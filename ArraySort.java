// Java Program to Sort Array of Integers
// by Default Sorts in an Ascending Order
// using Arrays.sort() Method
  
// Importing Arrays class from the utility class
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		//defining an array of integer type   
		int[] arr = new int [] {9, 3, 55, 19, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(arr);   
		System.out.println("Items of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < arr.length; i++)   
		{       
		System.out.println(arr[i]);   
		}   

	}

}
