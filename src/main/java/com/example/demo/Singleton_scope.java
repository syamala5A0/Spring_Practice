package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Singleton_scope {
	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(Singleton_scope.class, args);
		
		Message_Services obj1=context.getBean(Message_Services.class);
		Message_Services obj2=context.getBean(Message_Services.class);
		
		System.out.println(obj1.getMessage());
		
		System.out.println("obj1.hashCode :  "+obj1.hashCode());
		System.out.println("obj2.hashCode :  "+obj2.hashCode());
		
		if(obj1==obj2) {
			System.out.println("Same Object  Singleton Scope Confirmed");
		}
		else {
			System.out.println( "Different Object  => Not Singleton Scope");
		}
		}
}
