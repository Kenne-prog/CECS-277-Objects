public abstract class cat{
  private String name;
  private int hunger = 1;
  /*
  Creates a name for cat.
  @param n the name of the dragon.
  */
  public void Cat(String n){
    name = n;
  }
  /*
  Returns the name of the cat.
  @return name name of the cat.
  */
  public String getName(){
    return name;

  }
  /*
  Returns the current hunger of the cat.
  @return returns hunger level of the cat.
  */

  public int getHunger(){
    return hunger;

  }
  /*
  Returns the current hunger level of the cat.
  @param Val the random value that is generated depending upon each cat.
  @return returns hunger level of the cat.
  */

  public int incrementHunger(int Val){
    hunger += Val;
    if (hunger < 1){
      hunger = 1;
    }
    else if (hunger > 10){
      hunger = 10;
    }
    return hunger;
    
  }
  /*
  Prints name and hunger associated with the current cat. Overrides toString method.
  @return String of name and if its hungry.
  @return String of name and if its full.
  */
  @Override
  public String toString(){
    if (hunger < 10){
      return name + " is hungry.";
    }else{
      return name + " is full.";
    }
  }

  public abstract String feed(Player p);

  public abstract String play(Player p);

  public abstract String pet(Player p);
    
}