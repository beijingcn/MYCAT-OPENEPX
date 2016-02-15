##模块说明

1. common-entity 通用实体包
2. common-dao    通用数据访问对象模块
3. common-service  通用业务模块
4. common-ice ICE工具类模块
5. business-goods 商品业务服务模块
6. business-goods-ice 商品业务RPC 接口模块
7. business-order 订单业务服务模块
8. business-order-ice 订单业务RPC 接口模块
9. business-payment 支付业务服务模块
10. business-payment-ice 支付业务RPC 接口模块
11. business-shipping 配送业务服务模块
12. business-shipping-ice 配送业务RPC 接口模块

business-xxx-ice 编写RPC接口生成ICE代码，调用方引用该依赖包。
business-xxx 实现具体业务 ，部署到IceGrid ，各业务模块根据具体情况可单独部署（推荐），也可同时部署到一个IceBox


##模块内目录规划

```
├─module                                                                                                                                                                                                                                                   
│  └─src                                                                                                                                                                                                                                                         
│      ├─main                                                                                                                                                                                                                                                                                        
│      │  ├─java               源码 包名 xxx.xxx.module_name                                                                                                                                                                                                                                
│      │  └─resources                                                                                                                                                                                                                                           
│      │      └─conf           配置文件目录  properties  spring-config ...                                                                                                                                                                                                                                
│      └─test                                                                                                                                                                                                                                                    
│          ├─java              测试类                                                                                                                                                                                                                                  
│          └─resources                                                                                                                                                                                                                                           
 
```
