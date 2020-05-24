package com.sample.array_flattern.impl;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import javax.management.openmbean.InvalidOpenTypeException;

/**
 * 19th Nov, 2018
 * 
 * @author abdul
 * 
 *         Implements {@link IArrayFlattern} will only flatterte the orbitrary
 *         Integral Array of arrays
 */
public class IntegerArrayFlattern implements IArrayFlattern {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sample.array_flattern.IArrayFlattern#flatterteArray(java.lang.Object[],
	 * java.util.ArrayList)
	 */
	@Override
	public void flatterteArray(Object[] arbitrarilyArray, ArrayList<Integer> resultOutputList)
			throws InvalidParameterException, InvalidOpenTypeException {
		if (null == arbitrarilyArray || 1 > arbitrarilyArray.length || null == resultOutputList) {
			throw new InvalidParameterException("one of the params is invalid");
		}
		for (int i = 0; i < arbitrarilyArray.length; i++) {
			if (arbitrarilyArray[i] instanceof Object[]) {
				flatterteArray((Object[]) arbitrarilyArray[i], resultOutputList);
			} else if (arbitrarilyArray[i] instanceof Integer) {
				resultOutputList.add((Integer) arbitrarilyArray[i]);
			} else {
				throw new InvalidOpenTypeException("Invalid Datatype");
			}
		}
	}
}
