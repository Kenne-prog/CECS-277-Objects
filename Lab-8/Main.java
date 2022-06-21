import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    System.out.println("Choose a kitty: \n1. Tabby Cat \n2. Ocelet \n3. Tiger");
    int kittyChoice = CheckInput.getIntRange(1, 3);
     
    System.out.print("Name your kitty: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    Player p = new Player(10);
    
    if (kittyChoice == 1){
      cat kitty = new Tabby(name);
      interactCat(kitty, p);
    }
    else if (kittyChoice == 2){
      cat kitty = new Ocelot(name);
      interactCat(kitty, p);
    }
    else{
      cat kitty = new Tiger(name);
      interactCat(kitty, p);
    }
    System.out.print("You have been hurt too many times you should go to the hospital");
  }
 
  /**
	 * Allows the user to interact with the cat
	 * @param cat is a cat which the player chooses
   * @param Player is a player object
	 */
  public static void interactCat(cat cat, Player player) {
    while(player.getHp() > 0){
      
      System.out.println(player.toString());
      System.out.println(cat.toString());

      System.out.println("1. Feed your cat \n2. Play with your cat \n3. Pet your cat.");
      int choice = CheckInput.getIntRange(1, 3);

      if (choice == 1){
        System.out.println(cat.feed(player));
      }
      else if (choice == 2){
        System.out.println(cat.play(player));
      }
      else{
        System.out.println(cat.pet(player));
      }
    }
  }
}