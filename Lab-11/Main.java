import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while (true){
      System.out.println("Choose a ball color (q to quit): ");
        String color = scan.next();
          if(color.equalsIgnoreCase("q")){
            break;
          }
          Ball ball = Ball.getInstance(color);
          System.out.println("1. Roll Ball");
          System.out.println("2. Bounce Ball");
          int choice = scan.nextInt();
          switch (choice){
            case 1:
              System.out.println("\nYou roll the "+color+" ball.");
              ball.roll();
              System.out.println(ball);
              break;
            case 2:
              System.out.println("\nYou bounce the "+color+"ball");
              ball.bounce();
              System.out.println(ball);
              break;
            default:
              System.out.println("Invalid choice!");
        }
      System.out.println();
    }
  }
}