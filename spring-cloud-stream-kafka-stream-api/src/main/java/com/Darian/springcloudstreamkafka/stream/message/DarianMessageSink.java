package com.Darian.springcloudstreamkafka.stream.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * <br>
 * <br>Darian
 **/
public interface DarianMessageSink {

    /**
     * 消息来源的管道名称：“darian”
     **/
    String Name = "darianSink";


    @Input(Name)
    SubscribableChannel subscribableChannel();
}
