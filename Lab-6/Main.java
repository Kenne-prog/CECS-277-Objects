import java.util.Arrays;
class Main {
  public static void main(String[] args) {
   
    System.out.println("Yahtzee");
    Player p = new Player();
   
    takeTurn(p);
   
    while(true) {
      
      System.out.print("Play again? (Y/N) ");
      boolean choice = CheckInput.getYesNo();
      
      if (choice){
        takeTurn(p);
      }
      
      else{
        break;
      }
    }
   System.out.println("Game Over");
   System.out.println("Final Score = "+p.getPoints()+" points");
  }

  public static void takeTurn(Player p) {
    p.roll();
    System.out.println("\nRolling Dice..."+p.toString());
    if(p.threeOfAKind()){        
      System.out.println("You got 3 of a kind!");
    }
    else if(p.pair()){
      System.out.println("You got a pair!");
    }
    else if(p.series()){
      System.out.println("You got a series of 3!");  
    }
    else{
      System.out.println("Awww. Too Bad.");
    }
    System.out.println("Score = "+p.getPoints()+" points.");
   }

}

