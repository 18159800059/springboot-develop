package com.listener;

import com.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 方式4：
 * 手动代码实现添加
 * 自定义监听器，监听指定的事件。当事件执行时，onApplicationEvent将被调用(适用异步邮件发送等)
 * @author ：lyk
 * @date ：Created in 2019/3/6 20:27
 */
@Slf4j
public class MyListener4 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        log.info("======================执行监听器逻辑:"+ MyListener4.class.getName());
    }
}
