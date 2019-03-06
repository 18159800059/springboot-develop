package com.listener;

import com.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 方式2：
 * 使用@EventListener ,无需实现ApplicationListener接口
 * 自定义监听器，监听指定的事件。当事件执行时，onApplicationEvent将被调用(适用异步邮件发送等)
 * @author ：lyk
 * @date ：Created in 2019/3/6 20:27
 */
@Component
@Slf4j
public class MyListener2{

    @EventListener
    public void onApplicationEvent(MyEvent myEvent) {
        log.info("======================执行监听器逻辑:"+ MyListener2.class.getName());
    }
}
