package com.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件，当执行了该事件后，监听该事件的监听器会执行监听逻辑。
 * @author ：lyk
 * @date ：Created in 2019/3/6 20:26
 */
public class MyEvent extends ApplicationEvent {


    public MyEvent(Object source) {
        super(source);
    }

}
