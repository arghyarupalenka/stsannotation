package com.mca_annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class FreedomService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "this is my freedom service class";
	}

}
