/*
 * ***************************************************************************
 *
 * Author: sandeepkumar May 24, 2016 2:24:22 AM
 * Description: 
 * Company: 
 * Copyright (c) 2016.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.org.sei.exception.SeiException;
import com.org.sei.model.RandomInteger;
import com.org.sei.service.RemoveDuplicateService;
import com.org.sei.service.impl.RemoveDuplicateServiceImpl;

public class RemoveDuplicateControllerTest 
{
	int[] integerArray;
	int[] integerArrayFromList;
	int[] integerArrayFromSet;			
	int[] actualOrderedIntegerArray = {1,2,34,25,45,3,26,85,4,86,43,10000,11,16,19,18,9,20,17,8,15,6,5,10,14,12,13,7};
	int[] actualSortedIntegerArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,34,43,45,85,86,10000};
	
	List<Integer> integerList;
	Set<Integer> integerSet;
	
	RandomInteger randomInteger;
	RemoveDuplicateService duplicateArrayService;
	
	/**
	 * Author : sandeepkumar May 24, 2016 2:24:22 AM
	 *
	 * Description : 
	 * @throws java.lang.Exception
	 * 
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
	}

	
	/**
	 * Author : sandeepkumar May 24, 2016 2:24:22 AM
	 *
	 * Description : 
	 * @throws java.lang.Exception
	 * 
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	/**
	 * Author : sandeepkumar May 24, 2016 2:24:22 AM
	 *
	 * Description : 
	 * @throws java.lang.Exception
	 * 
	 */
	@Before
	public void setUp() throws Exception 
	{
		int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,
	   		  					3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,
	   		  					6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   												
		
		integerList = RemoveDuplicateController.buildArrayList(randomIntegers);		
		integerSet = new LinkedHashSet<Integer>();
		integerSet.addAll(integerList);		
		
		randomInteger = new RandomInteger();
		randomInteger.setRandomIntegers(randomIntegers);
		randomInteger.setIntegerList(integerList);
		randomInteger.setIntegerSet(integerSet);		
		
		duplicateArrayService = new RemoveDuplicateServiceImpl();
	}

	
	/**
	 * Author : sandeepkumar May 24, 2016 2:24:22 AM
	 *
	 * Description : 
	 * @throws java.lang.Exception
	 * 
	 */
	@After
	public void tearDown() throws Exception 
	{
		randomInteger = null;
		integerList = null;
		integerSet = null;
		integerArray = null;
		integerArrayFromList = null;
		integerArrayFromSet = null;		
	}

	
	@Test
	public void test() throws SeiException 
	{						
		try
		{
			//integerArray = duplicateArrayService.removeDuplicate(randomInteger.getRandomInteger());
			//System.out.println("Result from array is : "+Arrays.toString(integerArray));
			//System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));
			//Assert.assertArrayEquals(integerArray, actualOrderedIntegerArray);									
			
			//integerArrayFromList = duplicateArrayService.removeDuplicate(randomInteger.getIntegerList());
			//System.out.println("Result from list is : "+Arrays.toString(integerArrayFromList));
			//System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));
			//Assert.assertArrayEquals(integerArrayFromList, actualOrderedIntegerArray);
						
			//integerArrayFromSet = duplicateArrayService.removeDuplicate(randomInteger.getIntegerSet());
			//System.out.println("Integer array from set is : "+Arrays.toString(integerArrayFromSet));
			//System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));			
			//Assert.assertArrayEquals(integerArrayFromSet, actualOrderedIntegerArray);														
		}
		catch(Exception e)
		{					
			Assert.fail("Assertion for array equality condition failed");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 24, 2016 12:20:10 PM
	 *
	 * Description : 
	 * @throws SeiException
	 *
	 */
	@Test
	public void removeDuplicateByPassingIntArray() throws SeiException
	{
		try
		{
			integerArray = duplicateArrayService.removeDuplicate(randomInteger.getRandomInteger());
			System.out.println("Integer array is : "+Arrays.toString(integerArray));
			System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));
			Assert.assertArrayEquals(integerArray, actualOrderedIntegerArray);			
		}
		catch(Exception e)
		{					
			Assert.fail("Assertion for array equality condition failed");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 24, 2016 12:20:16 PM
	 *
	 * Description : 
	 * @throws SeiException
	 *
	 */
	@Test
	public void removeDuplicateByPassingListArray() throws SeiException
	{
		try
		{
			integerArrayFromList = duplicateArrayService.removeDuplicate(randomInteger.getIntegerList());
			System.out.println("Integer array from list is : "+Arrays.toString(integerArrayFromList));
			System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));
			Assert.assertArrayEquals(integerArrayFromList, actualOrderedIntegerArray);			
		}
		catch(Exception e)
		{					
			Assert.fail("Assertion for array equality condition failed");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Author : sandeepkumar May 24, 2016 12:20:24 PM
	 *
	 * Description : 
	 * @throws SeiException
	 *
	 */
	@Test
	public void removeDuplicateByPassingSetArray() throws SeiException
	{
		try
		{
			integerArrayFromSet = duplicateArrayService.removeDuplicate(randomInteger.getIntegerSet());
			System.out.println("Integer array from set is : "+Arrays.toString(integerArrayFromSet));
			System.out.println("Actual ordered array is : "+Arrays.toString(actualOrderedIntegerArray));			
			Assert.assertArrayEquals(integerArrayFromSet, actualOrderedIntegerArray);				
		}
		catch(Exception e)
		{					
			Assert.fail("Assertion for array equality condition failed");
			e.printStackTrace();
		}
	}
}
