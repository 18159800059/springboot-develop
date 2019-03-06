package com;

import com.event.MyEvent;
import com.listener.MyListener4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ListenerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ListenerApplication.class, args);
        //手动添加
        run.addApplicationListener(new MyListener4());
        run.publishEvent(new MyEvent(new Object()));
        //run.close();
    }

}
