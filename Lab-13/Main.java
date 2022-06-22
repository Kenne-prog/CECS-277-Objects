class Main {
  public static void main(String[] args) {
    Monster mon = null;
    //Prompt User with a menu of monster types
    System.out.println("Monster Creator!\nChoose a base monster: \n1. Alien\n2. Beast\n3. Undead");
    
    int menu = CheckInput.getIntRange(1,3);
    
    //Select monster type based on user input
    if(menu == 1)
    {
      mon = new Alien();
    }
    if(menu == 2)
    {
      mon = new Beast();
    }
    if(menu == 3)
    {
      mon = new Undead();
    }

    int typemenu = 0;
    while(typemenu != 5){
      System.out.println(mon.getName() + " has " + mon.getHP() + " hp " + "and attacks for " + mon.attack() + " damage.");
      System.out.println("Add an ability: \n1. Fire \n2. Flying \n3. Lasers \n4. Poison \n5. Quit");
      
      typemenu = CheckInput.getIntRange(1, 5);
      
      //Select ability to add to monster based on user input
      if (typemenu == 1){
        mon = new Fire(mon);
      }
      else if (typemenu == 2){
        mon = new Flying(mon);
      }
      else if (typemenu == 3){
        mon = new Lasers(mon);
      }
      else if(typemenu == 4){
        mon = new Poison(mon);
      }
      else if(typemenu == 5){
        System.out.println("Exiting");
      }
    }
  }
}