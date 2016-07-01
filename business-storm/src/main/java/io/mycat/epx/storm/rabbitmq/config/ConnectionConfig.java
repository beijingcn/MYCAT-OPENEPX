package io.mycat.epx.storm.rabbitmq.config;

import com.rabbitmq.client.ConnectionFactory;

import java.io.Serializable;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;


public class ConnectionConfig implements Serializable {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    // Use named parameters
    private String host;
    private int port;
    private String username;
    private String password;
    private String virtualHost;
    private int heartBeat;
    private boolean ssl;
    // Backup hosts to try and connect to.
    private ConfigAvailableHosts highAvailabilityHosts = new ConfigAvailableHosts();

    // Use AMQP URI http://www.rabbitmq.com/uri-spec.html
    private String uri;

    public static ConnectionConfig forTest() {
        return new ConnectionConfig(ConnectionFactory.DEFAULT_HOST, ConnectionFactory.DEFAULT_USER, ConnectionFactory.DEFAULT_PASS);
    }

    public ConnectionConfig(String uri) {
        this.uri = uri;
    }

    public ConnectionConfig(String host,
                            String username,
                            String password) {
        this(host, ConnectionFactory.DEFAULT_AMQP_PORT, username, password, ConnectionFactory.DEFAULT_VHOST, 10, false);
    }
    
    public ConnectionConfig(String host,
            String username,
            String password, boolean ssl) {
        this(host, ConnectionFactory.DEFAULT_AMQP_PORT, username, password, ConnectionFactory.DEFAULT_VHOST, 10, ssl);
    }

    public ConnectionConfig(String host,
                            int port,
                            String username,
                            String password,
                            String virtualHost,
                            int heartBeat) {
        this(host,port,username,password,virtualHost,heartBeat,false);
    }
    
    public ConnectionConfig(String host, int port, String username, String password, String virtualHost, int heartBeat, boolean ssl) {
        this(new ConfigAvailableHosts(), host, port, username, password, virtualHost, heartBeat, ssl);
      }
    
    /**
     * Use this constructor if you wish to specify a set of 
     * hosts to connect to in the event that you need a high 
     * availability RabbitMQ connection.
     * 
     * @param hosts The {@link ConfigAvailableHosts} that will give you the ability to specify a set of hosts
     * @param username
     * @param password
     * @param virtualHost
     * @param heartbeat
     */
    public ConnectionConfig(final ConfigAvailableHosts hosts, String host, int port, String username, String password, String virtualHost, int heartBeat, final boolean ssl) {
      this.host = host;
      this.port = port;
      this.username = username;
      this.password = password;
      this.virtualHost = virtualHost;
      this.heartBeat = heartBeat;
      this.ssl = ssl;
      this.highAvailabilityHosts = hosts;
    }
    
    public ConfigAvailableHosts getHighAvailabilityHosts() {
        return highAvailabilityHosts;
    }
    
    /**
     * Set this value if you want to use a set of high availability hosts
     * in addition to the specified primary host you want to connect to,
     * and didn't use the full constructor.
     * 
     * @param highAvailabilityHosts The host configuration for using backup hosts
     */
    public void setHighAvailabilityHosts(ConfigAvailableHosts highAvailabilityHosts) {
        this.highAvailabilityHosts = highAvailabilityHosts;
    }
    
    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getVirtualHost() {
        return virtualHost;
    }

    public int getHeartBeat() {
        return heartBeat;
    }

    public String getUri() {
        return uri;
    }
    
    boolean isSsl(){
        return this.ssl;
    }

    public ConnectionFactory asConnectionFactory() {
        ConnectionFactory factory = new ConnectionFactory();
        if (uri != null) {
            try {
                factory.setUri(uri);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (KeyManagementException e) {
                throw new RuntimeException(e);
            }
        } else {
            factory.setHost(host);
            factory.setPort(port);
            factory.setUsername(username);
            factory.setPassword(password);
            factory.setVirtualHost(virtualHost);
            factory.setRequestedHeartbeat(heartBeat);
            if(ssl){
                try {
                    factory.useSslProtocol();
                } catch (KeyManagementException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return factory;
    }

    public static ConnectionConfig getFromStormConfig(Map<String, Object> stormConfig) {
        if (stormConfig.containsKey("rabbitmq.uri")) {
            return new ConnectionConfig(ConfigUtils.getFromMap("rabbitmq.uri", stormConfig));
        } else {
            String highAvailabilityHostsString = ConfigUtils.getFromMap("rabbitmq.ha.hosts", stormConfig);
            if(highAvailabilityHostsString != null){
                final ConfigAvailableHosts haHosts = ConfigAvailableHosts.fromString(highAvailabilityHostsString);
                return new ConnectionConfig(haHosts,
                    ConfigUtils.getFromMap("rabbitmq.host", stormConfig, ConnectionFactory.DEFAULT_HOST),
                    ConfigUtils.getFromMapAsInt("rabbitmq.port", stormConfig, ConnectionFactory.DEFAULT_AMQP_PORT),
                    ConfigUtils.getFromMap("rabbitmq.username", stormConfig, ConnectionFactory.DEFAULT_USER),
                    ConfigUtils.getFromMap("rabbitmq.password", stormConfig, ConnectionFactory.DEFAULT_PASS),
                    ConfigUtils.getFromMap("rabbitmq.virtualhost", stormConfig, ConnectionFactory.DEFAULT_VHOST),
                    ConfigUtils.getFromMapAsInt("rabbitmq.heartbeat", stormConfig, ConnectionFactory.DEFAULT_HEARTBEAT),
                    ConfigUtils.getFromMapAsBoolean("rabbitmq.ssl", stormConfig, false));
            }else{
              return new ConnectionConfig(ConfigUtils.getFromMap("rabbitmq.host", stormConfig, ConnectionFactory.DEFAULT_HOST),
                    ConfigUtils.getFromMapAsInt("rabbitmq.port", stormConfig, ConnectionFactory.DEFAULT_AMQP_PORT),
                    ConfigUtils.getFromMap("rabbitmq.username", stormConfig, ConnectionFactory.DEFAULT_USER),
                    ConfigUtils.getFromMap("rabbitmq.password", stormConfig, ConnectionFactory.DEFAULT_PASS),
                    ConfigUtils.getFromMap("rabbitmq.virtualhost", stormConfig, ConnectionFactory.DEFAULT_VHOST),
                    ConfigUtils.getFromMapAsInt("rabbitmq.heartbeat", stormConfig, ConnectionFactory.DEFAULT_HEARTBEAT),
                    ConfigUtils.getFromMapAsBoolean("rabbitmq.ssl", stormConfig, false));
            }
        }
    }

    public Map<String, Object> asMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        if (uri != null) {
            ConfigUtils.addToMap("rabbitmq.uri", map, uri);
        } else {
            ConfigUtils.addToMap("rabbitmq.host", map, host);
            ConfigUtils.addToMap("rabbitmq.port", map, port);
            ConfigUtils.addToMap("rabbitmq.username", map, username);
            ConfigUtils.addToMap("rabbitmq.password", map, password);
            ConfigUtils.addToMap("rabbitmq.virtualhost", map, virtualHost);
            ConfigUtils.addToMap("rabbitmq.heartbeat", map, heartBeat);
            ConfigUtils.addToMap("rabbitmq.ssl", map, ssl);
            addToMap("rabbitmq.ha.hosts", map, highAvailabilityHosts.toString());
        }
        return map;
    }
}
