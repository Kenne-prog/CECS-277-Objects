b class Main {
  public static void main(String[] args) {
    
    Puppy puppy = new Puppy();
    System.out.println("\nCongratulations on your new puppy!");
    while(true){
      System.out.println("\nWhat would you like to do?\n1.Feed\n2.Play\n3.Quit");
      int choice = CheckInput.getIntRange(1,3);
      if(choice == 1){
        puppy.giveFood();
      }
      else if(choice == 2){
        puppy.throwBall();
      }
      else if(choice == 3){
        break;
      }
    }
  }
}