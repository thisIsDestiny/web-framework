package com.hj.configuration.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("resources/application.xml")
public class ConfigTest {

	@Value("${name}")
	private String name;
	
	@Value("${id}")
	private int id;
	
	public  void test(){
		
		System.out.println(name);
		
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		
		new ConfigTest().test();
	}
	
}
