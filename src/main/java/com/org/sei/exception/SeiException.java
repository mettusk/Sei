/*
 * ***************************************************************************
 *
 * Author: sandeepkumar May 1, 2016 7:22:25 PM
 * Description: 
 * Company: 
 * Copyright (c) 2016.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.exception;

public class SeiException extends Exception 
{	
	private static final long serialVersionUID = 2551728157976297646L;
	private Throwable cause = null;
	
	/**
	 * 
	 * Author : sandeepkumar May 1, 2016 7:26:06 PM
	 *
	 * Description : 
	 *
	 */
	public SeiException()
	{
		super();
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 1, 2016 7:26:27 PM
	 *
	 * Description : 
	 * @param message
	 *
	 */
	public SeiException(String message)
	{
		super(message);
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 1, 2016 7:28:02 PM
	 *
	 * Description : 
	 * @param message
	 * @param cause
	 *
	 */
	public SeiException(String message, Throwable cause)
	{
		super(message);
		this.cause = cause;
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 1, 2016 7:28:42 PM
	 *
	 * Description : 
	 * @return the 
	 *
	 */
	public Throwable getCause()
	{
		return cause;
	}	
}
