package com.mule.spring.messageprocessors;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;
import org.mule.util.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMessageProcessor implements MessageProcessor {

	private static Logger logger = LogManager.getLogger(LoggerMessageProcessor.class);
	
	@Override
	public MuleEvent process(MuleEvent event) throws MuleException 
	{		
		String exceptionMessage = 
        		ExceptionUtils.getFullStackTrace(event.getMessage().getExceptionPayload().getException());
        logger.error(exceptionMessage);	
		return event;
	}

}
