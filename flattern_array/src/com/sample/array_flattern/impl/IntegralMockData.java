/**
 * 
 */
package com.sample.array_flattern.impl;

/**
 * 19th Nov, 2018
 * 
 * @author abdul This class provides the integral mocking data
 */
public class IntegralMockData implements IDataSource {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sample.array_flattern.IDataSource#getMockData()
	 */
	@Override
	public Object[] getMockData() {
		Object[] array = new Object[2];

		// Add new arrays to the main array and store the integers.
		array[0] = new Object[3];
		((Object[]) array[0])[0] = 1;
		((Object[]) array[0])[1] = 2;
		((Object[]) array[0])[2] = new Object[1];
		((Object[]) ((Object[]) array[0])[2])[0] = 3;
		array[1] = 4;
		return array;
	}

}
