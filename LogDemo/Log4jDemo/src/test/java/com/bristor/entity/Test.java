package com.bristor.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
	private static Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
		
		Student student = new Student();
		student.shut();
	}

}
