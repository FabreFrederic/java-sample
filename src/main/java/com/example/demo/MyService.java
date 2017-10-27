package com.example.demo;

import org.springframework.scheduling.annotation.Async;

public class MyService {
    @Async
    public void hello(){
        //SimpleAsyncTaskExecutor
        System.out.println("Currently Executing thread name : " + Thread.currentThread().getName());
        System.out.println("Hello with default executor");
    }

    @Async
    public void byby(){
        //SimpleAsyncTaskExecutor
        System.out.println("Currently Executing thread name : " + Thread.currentThread().getName());
        System.out.println("Byby with default executor");
    }
}
