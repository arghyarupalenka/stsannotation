package com.mca_annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("myCoach1")
public class BasketBall implements Coach_293{
//	@Autowired
	
	private FortuneService fortuneservice;
//	@Autowired
//	
//	public BasketBall(FortuneService fortuneservice) {
//		super();
//		this.fortuneservice = fortuneservice;
//	System.out.println("i am inside constructor");
//	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Basketball for 2 hours";
		
	}
	@Autowired
	@Qualifier("randomService_293")
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
		System.out.println("i am setter method");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
