package com.cyy.MySpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyy.MySpringBoot.config.DemoSettings;
import com.cyy.SpringBootHello.HelloService;

@RestController
@SpringBootApplication
public class MySpringBootApplication {

	@Autowired
	private DemoSettings demoSetting;
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/")
	String index(){
		return "This SpringBoot Demo Name is " + demoSetting.getName() + ";Author is " + demoSetting.getAuthor();
	}
	
	@RequestMapping("/hello")
	String hello(){
		return helloService.sayHello();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
