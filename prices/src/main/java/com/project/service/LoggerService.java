package com.project.service;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.stereotype.Service;

@Service
public class LoggerService {


	public Logger getLogger(String className) {
		Logger logger = Logger.getLogger(className);

		try {  
			FileHandler fh;  

			// This block configure the logger with handler and formatter  
			fh = new FileHandler("C:/Logs/MyLogFile.log");  
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);  

			// the following statement is used to log any messages  
			logger.info("My first log");  
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		return logger;
	}
}
