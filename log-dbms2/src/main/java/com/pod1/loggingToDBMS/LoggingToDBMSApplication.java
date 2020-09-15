package com.pod1.loggingToDBMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class LoggingToDBMSApplication {
	 private static final Logger logger= LoggerFactory.getLogger(LoggingToDBMSApplication.class);
	 
	 
     public static void main(String[] args) {
		   SpringApplication.run(LoggingToDBMSApplication.class, args);
		   Logchecker c=new Logchecker();
		   c.checkLog();
	 }

}
