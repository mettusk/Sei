/*
 * ***************************************************************************
 *
 * Author: sandeepkumar May 23, 2016 1:49:21 PM
 * Description: 
 * Company: 
 * Copyright (c) 2016.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.org.sei.model.RandomInteger;
import com.org.sei.service.RemoveDuplicateService;
import com.org.sei.service.impl.RemoveDuplicateServiceImpl;

public class RemoveDuplicateController 
{
	public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,
								   		  3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,
								   		  6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   

	private static List<Integer> integerList;
	private static Set<Integer> integerSet;
	private static RandomInteger randomInteger;
	
	
	/**
	 * 
	 * Author: sandeepkumar May 24, 2016 9:49:23 AM
	 *
	 * Description: Method to initialize controller 
	 *
	 */
	public static void initializeController()
	{				
		integerList = buildArrayList(randomIntegers);		
		integerSet = new LinkedHashSet<Integer>();
		integerSet.addAll(integerList);		
		
		randomInteger = new RandomInteger();
		randomInteger.setRandomIntegers(randomIntegers);
		randomInteger.setIntegerList(integerList);
		randomInteger.setIntegerSet(integerSet);
	}
	
	
	/**
	 * 
	 * Author: sandeepkumar May 23, 2016 5:21:17 PM
	 *
	 * Description: Method to build array list from integer array
	 * @param integerArray - Integer Array
	 * @return listOfInteger
	 *
	 */
	public static List<Integer> buildArrayList(int[] integerArray)
	{
		List<Integer> listOfInteger = null;		
		
		try
		{
			if(integerArray != null && integerArray.length != 0)
			{
				listOfInteger = new ArrayList<Integer>(integerArray.length);
				
				for(int i=0;i<integerArray.length;i++)
				{
					listOfInteger.add(integerArray[i]);
				}								
			}						
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while building array list : "+e);
		}
		
		return listOfInteger;
	}
	
	
	/**
	 * 
	 * Author: sandeepkumar May 23, 2016 4:45:38 PM
	 *
	 * Description: Method to display elements from array 
	 * @param integerArray - Integer Array
	 *
	 */
	public static void displayArray(int[] integerArray)
	{
		try
		{
			if(integerArray != null && integerArray.length != 0)
			{								
				System.out.print("Random integer array is : [");				
				
				for(int i=0;i<integerArray.length;i++)
				{																				
					System.out.print(integerArray[i]);
					
					if(i!=integerArray.length)
					{
						System.out.print(", ");												
					}					
					
					if(i==integerArray.length-1)
					{
						System.out.print("]");
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while processing array removing duplicates: "+e);
		}
	}
	
	
	/**
	 * 
	 * Author: sandeepkumar May 23, 2016 4:45:45 PM
	 *
	 * Description: Static main method of Controller class
	 * @param args - String[] args
	 *
	 */
	public static void main(String [] args)  
	{				
		int[] integerArray;
		int[] integerArrayFromList;
		int[] integerArrayFromSet; 
		
		try
		{				
			displayArray(randomIntegers);
			initializeController();
			RemoveDuplicateService duplicateArrayService = new RemoveDuplicateServiceImpl();		
			integerArray = duplicateArrayService.removeDuplicate(randomInteger.getRandomInteger());
			System.out.println("\nResult from array is : "+Arrays.toString(integerArray));			
			integerArrayFromList = duplicateArrayService.removeDuplicate(randomInteger.getIntegerList());
			System.out.println("Result from list is : "+Arrays.toString(integerArrayFromList));
			integerArrayFromSet = duplicateArrayService.removeDuplicate(randomInteger.getIntegerSet());
			System.out.println("Result from set is : "+Arrays.toString(integerArrayFromSet));			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while processing array removing duplicates: "+e);
		}
		finally
		{
			integerArray = null;
			integerArrayFromList = null;
			integerArrayFromSet = null;
			randomInteger = null;
			randomIntegers = null;
		}
	}
}
