import java.util.Scanner;

public class Arrays {
	//question 1
	static double average(int a[], int n)
    {
        //1) Display the average of a given integer array 
        // Find sum of array element
        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (int)sum / n;
    }
	
	//question 2
	static int search(String[]arr, String s)
    {
            int counter = 0;
            for (int j = 0; j < arr.length; j++)
 
                if (s.equals(arr[j]))
                    counter++;
 
           return counter;
    }
 
	//question 2
    static void answerQueries(String[] arr, String q[])
    {
        for (int i=0;i<q.length; i++)
            System.out.print(search(arr, q[i]) + " ");
    }
	
	public static void main(String[] args) {
		int arr[] = {7, 7, 8, 9};
        int n = arr.length;
     
        System.out.println("Question 1: " + average(arr, n)); //Arrays.average(arr, n)
        
        
        //question 2
        String[] arrFind = {"aba","baba","aba","xzxb"};
        String[] q   = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Question 2: Select three string(s) to find \"aba\",\"baba\",\"aba\",\"xzxb\"");
        for (int i = 0; i < q.length; i++)
        {
            //System.out.println("Please enter string");
            q[i] = input.nextLine();
        }
        
        answerQueries(arrFind, q);
        
        //3) Copy one array into another (without any built-in method) and display the new array
        int intArray[] = {25,33,5}; 
        
        //print original intArray
        System.out.println("\n\nContents of intArray[] before assignment:"); 
        for (int i=0; i<intArray.length; i++) 
             System.out.print(intArray[i] + " ");
 
        // Create an array b[] of same size as a[] 
        int copyArray[] = new int[intArray.length]; 
 
        // intArray is assigned to copyArray; so references point to same location 
        copyArray = intArray;     
 
        // change element of copyArray
        copyArray[2]++; //third element incremented to show both arrays are changed since both reference same memory location
 
        //print both arrays
        System.out.println("\nContents of intArray[]:"); 
        for (int i=0; i<intArray.length; i++) 
              System.out.print(intArray[i] + " "); 
 
        System.out.println("\nContents of copyArray[]:"); 
        for (int i=0; i<copyArray.length; i++) 
              System.out.print(copyArray[i] + " "); 
	
	
	
	}

}
