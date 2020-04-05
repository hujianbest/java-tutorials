package com.hujianbest.tutorials.spring.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author hujian
 */
@Component
public class Task {

    @Scheduled(cron = "0/10 * *  * * ? ")
    public void sayHello() {
        System.out.println(LocalDateTime.now() + " hello world");
    }
}
