package com.sample.array_flattern;

import java.util.ArrayList;

import com.sample.array_flattern.impl.IArrayFlattern;
import com.sample.array_flattern.impl.IDataSource;
import com.sample.array_flattern.impl.IntegerArrayFlattern;

/**
 * 19th Nov, 2018
 * @author abdul
 * FlattenArrayTest tests the {@link IntegerArrayFlattern}, its a custom test class not using any testing framework
 */
public class FlattenArrayTest {
	IDataSource dataSourceObj = null;
	IArrayFlattern arrayFlatternObj = null;
	public FlattenArrayTest(IDataSource dataSource, IArrayFlattern arrayFlattern) throws NullPointerException {
		if(dataSource == null) {
			throw new NullPointerException("IDataSource is null");
		}else if(arrayFlattern == null) {
			throw new NullPointerException("IArrayFlattern is null");
		}
		this.dataSourceObj = dataSource;
		this.arrayFlatternObj = arrayFlattern;

	}
	public void test() throws Exception {

		ArrayList<Integer> resultedList = new ArrayList<Integer>();
		try {
			arrayFlatternObj.flatterteArray(dataSourceObj.getMockData(), resultedList);
			System.out.println("Flatteren Array Result: " + resultedList+"\n ___________________\n");

			ArrayList<Integer> expectedList = new ArrayList<Integer>();
			expectedList.add(1);
			expectedList.add(2);
			expectedList.add(3);
			expectedList.add(4);
			System.out.println("Test Result: " + expectedList.equals(resultedList));
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 

	}

}

