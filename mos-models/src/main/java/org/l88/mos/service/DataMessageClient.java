package org.l88.mos.service;

import org.l88.mos.domain.DataMessage;

/**
 * 数据报文客户端(同步)
 * 
 * @author liangbl
 * 
 */
public interface DataMessageClient {
    /**
     * 发送并接收应答(阻塞模式).
     * @param datamsg
     * @param waitForSecond 最大等待响应的时间
     * @return
     */
    DataMessage send(DataMessage datamsg, long waitForSecond);
    
    /**
     * 发送，但不接收应答（异步模式)
     * @param datamsg
     */
    void sendAsync(DataMessage datamsg);

    DataMessage newDataMessage();
}
