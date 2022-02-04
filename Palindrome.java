import java.util.*;

class Palindrome {
    static void fib(int n) {
        int f1 = 0, f2 = 1, i;
        
        if (n < 1) 
        return;
        System.out.print(f1 + " ");
        for (i = 1; i < n; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String args[]) {
        String original, reverse = ""; // Objects of String class
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number to check if it is a palindrome");
            original = in.nextLine();
        }
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered number is a palindrome.");
        else
            System.out.println("Entered number isn't a palindrome.");

    int n=Integer.parseInt(original);  
    fib(n);
    }

    
}