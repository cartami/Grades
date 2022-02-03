class Message{
    public static void main(String args[]){
        int  score=75;    // To hold a test score
        char grade;    // To hold a letter grade

      // Calculate the grade.
      if (score >= 90)
      {
         grade = 'A';
      }
      else if (score >= 80)
      {
         grade = 'B';
      }
      else if (score >= 70)
      {
         grade = 'C';
      }
      else if (score >= 50)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      }

      // Display the grade.
      System.out.println("Using if/else statements your grade is " + grade);

      score=65;    // To hold a test score
      switch(score/10) {
        // for >= 90
        case 10:
        case 9:
           grade = 'A';
           break;
        // for >= 80 and <90
        case 8:
           grade = 'B';
           break;
        // for >= 70 and <80
        case 7:
           grade = 'C';
           break;
        // for >= 60 and <70
        case 6:
           grade = 'D';
           break;
        // for >= 50 and <60
        case 5:
           grade = 'E';
           break;
        // for < 50
        default:
           grade = 'F';
           break;
      }
      
      // display result
      System.out.println("Using switch statement the Grade is " + grade);

      int num=5;

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Using odd/even the num entered number is even");
     else
        System.out.println("Using odd/even the num entered number is odd");
    }
}