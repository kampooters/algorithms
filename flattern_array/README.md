# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Flatter_Array application will flatten an array of arbitrarily nested arrays of integers into a flat array of integers. e.g. [[1,2,[3]],4] -> [1,2,3,4].



## How do I get set up? ##

This application is built as an component which can be imported into any java application. 
- The 'impl' package hold the all appliction logic.
- IArrayFlattern interface will provide structure to falttern the array of any type
- Implements {@link IArrayFlattern} will only flatterte the orbitrary Integral Array of arrays
- IDataSource interface provides structure to to the mock data
- IntegralMockData class provides the integral mocking data
- 'FlattenArrayTest' is a custom built test which tests the all possible cases
- 'TestExecuter' is execution class, run this class to run the test.

* Repo owner or admin
- Abdulrehman (abdulrehman.abdul.qau@gmail.com)

