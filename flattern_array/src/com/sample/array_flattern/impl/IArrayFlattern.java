package com.sample.array_flattern.impl;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import javax.management.openmbean.InvalidOpenTypeException;

/**
 * 19th Nov, 2018
 * @author abdul
 * This interface will provide structure to falttern the array of any type, 
 * so at run time we can provide any implementation according to the array type 
 * 
 * Note: Interface is introduced for dynamic behaviour
 */
public interface IArrayFlattern {
	/**
	 *  @author abdul | 19th Nov, 2018
	 * Recursive method which flattern the array of arbitrarily nested arrays of any type
	 * 
	 * @param arbitrarilyArray
	 *            arbitrarily nested arrays of any type
	 * @param list
	 *            The out put list initially empty
	 * @return void
	 * @throws Exception which will be any specific implementation of exception
	 */
	public abstract void flatterteArray(Object[] arbitrarilyArray, ArrayList<Integer> resultOutputList) throws InvalidParameterException, InvalidOpenTypeException; 

}
