package com.bristor.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * slf4j是门面模式，只提供接口，由具体的日志框架实现打印日志，如log4j，log4j2，logback，slf4j-simple
 * @author bristor
 *
 */
public class Slf4jDemo {
	public static final	Logger LOG = LoggerFactory.getLogger(Slf4jDemo.class);
	public static void main(String[] args) {
		System.out.println("这里采用log4j2+slf4j：");
		LOG.info("这里采用log4j2+slf4j：");

	}

}
