import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// question 1 Write a Java program to display the total
		// numbers of characters in a user entered String
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");

		String str = input.nextLine();
		// String str = "James Carter";
		int count = 0;
		System.out.println("The entered string is: " + str);
		// Count the characters in the string except space
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		// Displays the total number of characters in the string
		System.out.println("Total number of characters in the string: " + count + "\n");

		// question 2 Using a while loop, print each character
		// of the string ‘Hello World’

		// create a string
		String world = "Hello World";

		System.out.println("Characters in " + world + " are:");

		// loop through each element
		for (int i = 0; i < world.length(); i++) {

			// access each character
			char a = world.charAt(i);
			System.out.print(a + ", ");
		}

		// question 3 Take two strings form the user and compare if they're equal or
		// not.
		// Display a message saying the strings are equal or not equal
		String helloWorld = "Hello World";
		System.out.println("\n\n String helloWorld = \"Hello World\" && String world = \"Hello World\" == "
				+ helloWorld.equals(world) + "\n"); // Returns true because they are equal

		// question 4 Print a given string in reverse order without using the reverse( )
		// method
		String reverseString;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to print in reverse order: ");
		reverseString = sc.nextLine(); // reading string from user
		System.out.print("After reverse string is: ");
		for (int i = reverseString.length(); i > 0; --i) // i is the length of the string
		{
			System.out.print(reverseString.charAt(i - 1)); // printing the character at index i-1

		}
		
		//Q5 Print the total number of consonants and vowels in a given string
		
		//Counter variable to store the count of vowels and consonant  
        int vCount = 0, cCount = 0;  
          
        //Declare a string  
        String str1 = "This is a really simple sentence";  
          
        //Converting entire string to lower case to reduce the comparisons  
        str1 = str1.toLowerCase();  
          
        for(int i = 0; i < str1.length(); i++) {  
            //Checks whether a character is a vowel  
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  
            else if(str1.charAt(i) >= 'a' && str1.charAt(i)<='z') {    
                //Increments the consonant counter  
                cCount++;  
            }  
        }
        System.out.println("\n\n String str1 = \"This is a really simple sentence\" "); 
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);  
    }  
	}

