/*
 * ***************************************************************************
 *
 * Author: sandeepkumar May 23, 2016 3:01:14 PM
 * Description: 
 * Company: http://www.optum.com
 * Copyright (c) 2016 Optum.  All rights reserved.
 *
 * ***************************************************************************
 */
package com.org.sei.model;

import java.util.List;
import java.util.Set;

public class RandomInteger 
{
	private int[] randomInteger;
	private List<Integer> integerList;
	private Set<Integer> integerSet;
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Accessor method for randomIntegers
	 * @return the randomIntegers
	 * 
	 */	
	public int[] getRandomInteger() {
		return randomInteger;
	}
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Mutator method for randomIntegers
	 * @param randomIntegers - the randomIntegers to set
	 * 
	 */	
	public void setRandomIntegers(int[] randomInteger) {
		this.randomInteger = randomInteger;
	}
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Accessor method for integerList
	 * @return the integerList
	 * 
	 */	
	public List<Integer> getIntegerList() {
		return integerList;
	}
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Mutator method for integerList
	 * @param integerList - the integerList to set
	 * 
	 */	
	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Accessor method for integerSet
	 * @return the integerSet
	 * 
	 */	
	public Set<Integer> getIntegerSet() {
		return integerSet;
	}
	
	
	/**
	 * Author : sandeepkumar May 23, 2016 3:02:48 PM
	 *
	 * Description : Mutator method for integerSet
	 * @param integerSet - the integerSet to set
	 * 
	 */	
	public void setIntegerSet(Set<Integer> integerSet) {
		this.integerSet = integerSet;
	}	
}
