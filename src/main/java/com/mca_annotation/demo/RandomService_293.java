package com.mca_annotation.demo;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class RandomService_293 implements FortuneService{

	@Override
	public String getFortune() {
//		// TODO Auto-generated method stub
//		String a=usingRandomUUID();
////		System.out.println(a);
		Random rand_293=new Random();
		String[] str_293= {"Hello have a good day","How are you?","Good morning","good evening"};
		int index=rand_293.nextInt(str_293.length);
	
		return str_293[index];
	}
//	static String usingRandomUUID() {
//		UUID randomUUID=UUID.randomUUID();
//		return randomUUID.toString().replaceAll("_", "");
//	}

}
