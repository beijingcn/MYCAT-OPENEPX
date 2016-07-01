package cn.com.pencho.storm.rabbitmq;

public interface ErrorReporter {
  void reportError(Throwable error);
}
