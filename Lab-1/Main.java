import java.util.Random;
import java.util.Scanner;

class Main 
{
  public static void main (String[] args)
  {

    int count = 0; //initialize count
    
    int rand1 = (int) ((Math.random() * (100-1+1))+1);

    System.out.println(rand1);
    
    System.out.print("I’m thinking of a number. Guess a value (1-100): ");

    int i = CheckInput.getIntRange(1,100);

    while (i!= rand1)  // count++ // count 
    {

      if (i < rand1) // less then range
      {
        System.out.print("Too Low. Guess Again: ");
        Scanner input = new Scanner(System.in);
        i = CheckInput.getIntRange(1,100);
      }
      else if (i > rand1)// higher than range
      {
        System.out.print("Too High. Guess Again:  ");
        Scanner input = new Scanner(System.in);
        i = CheckInput.getIntRange(1,100);
      }

      count++;
    
    }
    
    System.out.println("Correct! You got it in " + (count+1) + " tries.");

   }
}