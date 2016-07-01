package com.mule.spring.components;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.util.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomComponent implements Callable 
{

	private static Logger logger = LogManager.getLogger(CustomComponent.class);

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String exceptionMessage = 
				ExceptionUtils.getFullStackTrace(eventContext.getMessage().getExceptionPayload().getException());
		logger.error(exceptionMessage);	
        return eventContext.getMessage();
	}

}
