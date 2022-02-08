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

      score=5;    // num 1-7
      String day;
      switch(score) {
        case 1:
        day = "Monday";
           break;
        case 2:
        day = "Tuesday";
           break;
        case 3:
        day = "Wednesday";
           break;
        case 4:
        day = "Thursday";
           break;
        case 5:
        day = "Friday";
           break;
        case 6:
        day = "Saturday";
           break;
        case 7:
        day = "Sunday";
           break;
       default:
        day = "No day selected";
           break;
      }
      
      // display result
      System.out.println("Using switch statement the day is " + day);
      
      String oddOrEven;
      int num=5;
    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
    {
      oddOrEven = (num==2||num==3||num==4||num==5) ? "Cool": "Not Cool";
      oddOrEven = (num>=6&&num<=20) ? "Cool": "Cool";
      oddOrEven = (num>20) ? "Not Cool": "Cool";
    }else
    oddOrEven ="Cool";
    System.out.println(oddOrEven);
    }
}