/*
 * ***************************************************************************
 *
 * Author: sandeepkumar Aug 9, 2016 6:14:41 PM
 * Description: 
 * Company: 
 * Copyright (c) 2016.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.org.sei.exception.SeiException;
import com.org.sei.service.RemoveDuplicateService;

public class RemoveDuplicateServiceImpl implements RemoveDuplicateService 
{	 		
	/**
	 * 
	 * Author : sandeepkumar Aug 9, 2016 6:14:41 PM
	 *
	 * Description : Method to return integer array from given int array after removing dups
	 * @return the randomIntegerArray
	 *
	 */
	public int[] removeDuplicate(int[] integerArray) throws SeiException
	{
		int[] randomIntegerArray = null;
		List<Integer> integerList = null;
		
		try
		{
			if(integerArray != null && integerArray.length != 0)
			{				
				integerList = new ArrayList<Integer>();
				
				for(int i=0;i<integerArray.length;i++)
				{
					if(!integerList.contains(integerArray[i]))
					{
						integerList.add(integerArray[i]);
					}
				}
				
				if(integerList != null && integerList.size() != 0)
				{				
					int i = 0;
					randomIntegerArray = new int[integerList.size()];				
									
					for(Integer integer : integerList)
					{
						randomIntegerArray[i] = integer;
						i++;
					}
				}
			}
		}
		catch(Exception e)
		{
			throw new SeiException("Exception caught while removing duplicates from array : "+e);
		}
		finally
		{
			integerList = null;
		}
		
		return randomIntegerArray;
	}

	
	/**
	 * 
	 * Author : sandeepkumar Aug 9, 2016 6:10:03 PM
	 *
	 * Description : Method to remove duplicates from list of integers
	 * @return the randomIntegerArray
	 *
	 */
	public int[] removeDuplicate(List<Integer> integerList) throws SeiException 
	{
		int[] randomIntegerArray = null;
		Set<Integer> integerSet = null;
		
		try
		{
			if(integerList != null && integerList.size() != 0)
			{				
				integerSet = new HashSet<Integer>();
				integerSet.addAll(integerList);
				randomIntegerArray = removeDuplicate(integerSet);
			}
		}
		catch(Exception e)
		{
			throw new SeiException("Exception caught while removing duplicates from array list : "+e);
		}
		finally
		{
			integerList = null;
			integerSet = null;
		}
		
		return randomIntegerArray;
	}

	
	/**
	 * 
	 * Author : sandeepkumar Aug 9, 2016 6:13:14 PM
	 *
	 * Description : Method to return integers from set of integers
	 * @return the the randomIntegerArray
	 *
	 */
	public int[] removeDuplicate(Set<Integer> integerSet) throws SeiException
	{
		int[] randomIntegerArray = null;					
		
		try
		{
			if(integerSet != null && integerSet.size() != 0)
			{				
				int i = 0;
				randomIntegerArray = new int[integerSet.size()];				
								
				for(Integer integer : integerSet)
				{
					randomIntegerArray[i] = integer;
					i++;
				}
			}
		}
		catch(Exception e)
		{
			throw new SeiException("Exception caught while removing duplicates from set : "+e);
		}
		finally
		{
			integerSet = null;
		}
		
		return randomIntegerArray;
	}
}
