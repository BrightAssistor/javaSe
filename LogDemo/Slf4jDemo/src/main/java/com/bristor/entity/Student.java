package com.bristor.entity;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {
	static final Logger log =Logger.getLogger(Student.class);
//	LoggerFactory.getLogger(Student.class);
	private String name;
	private int age;
	public void shut() {
		System.out.println("start");
	
		if (3>2) {
			log.info("ok,info");
		}
		if (3==3) {
			log.debug("=,debug");
		}
		if (3>2) {
			log.error("error,error");
		}
	}
}
