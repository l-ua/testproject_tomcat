package com.mule.spring.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ExceptionUtil {
	public static String getExceptionMessage(Exception ex)
	{
		 String  exceptionMessage = null;
		 try {
		    ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
			ex.printStackTrace(new java.io.PrintWriter(buf, true));
			exceptionMessage = buf.toString();
			buf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exceptionMessage;
	}
}
