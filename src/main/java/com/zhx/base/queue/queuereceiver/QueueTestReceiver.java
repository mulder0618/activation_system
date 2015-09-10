package com.zhx.base.queue.queuereceiver;


import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import java.util.HashMap;

/**
 * Created by admin on 2015/7/29.
 */
public class QueueTestReceiver implements MessageListener {


    public void onMessage(Message message) {
        HashMap object = null;
        try {
            object = (HashMap)((ObjectMessage) message).getObject();
        } catch (JMSException e) {
            e.printStackTrace();
        }

        String msg = String.valueOf(object.get("msg"));
    }
}