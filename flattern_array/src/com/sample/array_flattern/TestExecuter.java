package com.sample.array_flattern;

import com.sample.array_flattern.impl.IntegerArrayFlattern;
import com.sample.array_flattern.impl.IntegralMockData;

/**
 * 19th Nov, 2018
 * 
 * @author abdul Executes the {@link FlattenArrayTest} and prints the results on
 *         console
 * 
 * 
 *         Results: The application is tested with invalid data types and
 *         invalid values its working fine
 */
public class TestExecuter {

	// Main method with test case
	public static void main(String[] args) {

		try {
			FlattenArrayTest testObj = new FlattenArrayTest(new IntegralMockData(), new IntegerArrayFlattern());
			testObj.test();
		} catch (Exception ex2) {
			ex2.printStackTrace();
		}

	}
}
