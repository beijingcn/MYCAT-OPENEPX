package io.mycat.epx.storm.rabbitmq;

public interface ErrorReporter {
  void reportError(Throwable error);
}
