package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Executor;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	private MyService myService;

	@Before
	public void beforeEach() {
		myService = new MyService();
	}

	@Test
	public void helloTest() {
		System.out.println("Current Thread in test class : " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			myService.hello();
			myService.byby();
		}
	}
}
