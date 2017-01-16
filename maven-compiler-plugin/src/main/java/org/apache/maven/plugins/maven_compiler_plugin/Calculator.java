package org.apache.maven.plugins.maven_compiler_plugin;

/**
 * @author Yasher
 *
 */
public class Calculator {
	/**
	 * This method finds the maximum number and returns the maximum number
	 * @param num1:is the first parameter
	 * @param num2:is the second parameter
	 * @param num3:is the third parameter
	 * @return the maximum number
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	
	/**
	 * This method finds the square and return the square of number
	 * @param num: is the parameter
	 * @return return the square of number
	 * @throws IllegalArgumentException
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
	
		/**
		 * This method finds the cube and return the cube of number.
		 * @param num:is the parameter
		 * @return Return the cube of number
		 * @throws IllegalArgumentException
		 */
		public int cube(int num) throws IllegalArgumentException {
			int result = 0;
			if (num > 0 && num < 10) {
			result = num * num*num;
			} else
			throw new IllegalArgumentException();
			return result;
			}
}
