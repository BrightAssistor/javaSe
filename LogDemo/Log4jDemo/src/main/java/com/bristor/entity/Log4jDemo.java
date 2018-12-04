package com.bristor.entity;

import org.apache.log4j.Logger;

public class Log4jDemo {
	private static final Logger log = Logger.getLogger(Student.class);

	public static void main(String[] args) {
		log.info("start");
		log.info("ok,info");
		log.debug("=,debug");
		log.error("error,error");
		log.info("直接引入包，根目录下配置log4j.properties");

	}

}
