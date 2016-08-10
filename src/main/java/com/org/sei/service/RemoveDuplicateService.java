/*
 * ***************************************************************************
 *
 * Author: sandeepkumar May 23, 2016 1:53:47 PM
 * Description: 
 * Company: 
 * Copyright (c) 2016.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.service;

import java.util.List;
import java.util.Set;

import com.org.sei.exception.SeiException;

public interface RemoveDuplicateService 
{
	public int[] removeDuplicate(int[] integerArray) throws SeiException;
	public int[] removeDuplicate(List<Integer> integerList) throws SeiException; 
	public int[] removeDuplicate(Set<Integer> integerSet) throws SeiException;
}
