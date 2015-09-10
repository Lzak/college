/*
 * Title: 		Randomizer
 * Author:		Lasha Zakariashvili
 * 
 * Description: A class which generates random numbers or random array of numbers.
 * 
 * Usage: 		generateNumber(from, to)  		//from and to could be either int or double
 * 				generateArray(from, to, size)	//from and to could be either int or double
 * 				sort(array[])					//sorts the array[] from least to greatest
 */

package Lottery;

import java.util.Arrays;

public class Randomizer {
	//----Class-Specific Functions----
	public Randomizer() {
	}
	public static double generateNumber() {	//useless function, kept it to make the prof happy :P
		return Math.random();	
	}
	public static int generateNumber(int low, int high) {
		return (int) ((Math.random() * (high-low)) + low);
	}
	public static double generateNumber(double low, double high) {
		return ((Math.random() * (high-low)) + low);
	}
	public static int[] generateArray(int low, int high, int size, boolean sorted) {
		int array[] = new int[size];
		for (int i=0; i<size; i++)
			array[i] = generateNumber(low, high);
		if (sorted == true)
			sort(array);
		return array;
	}
	public static double[] generateArray(double low, double high, int size, boolean sorted) {
		double array[] = new double[size];
		for (int i=0; i<size; i++)
			array[i] = generateNumber(low, high);
		if (sorted == true)
			sort(array);
		return array;
	}
	public static void sort(int[] array) {
		Arrays.sort(array);
	}
	public static void sort(double[] array) {
		Arrays.sort(array);
	}
}
