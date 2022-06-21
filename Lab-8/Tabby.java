public class Tabby extends cat{
  /*
  Constructor that uses cat to create Tabby with name.
  @param n the name of the cat.
  */
  public Tabby(String n){
    super.Cat(n);
  }
  /*
  Abstract method feed that lets user feed the Tabby, and lets the Tabby attack the user.
  @param p the player object.
  @return returns a String that lets the user know if the Tabby attacks or eats depending on its hunger level.
  */
  @Override
  public String feed(Player p){
    int Min = 1;
    int Max = 3;
    int randVal = Min + (int)(Math.random() * ((Max - Min) + 1));
    if(super.getHunger() != 10){
      incrementHunger(randVal);
      return super.getName() + " is pretty hungry, and starts chomping down the food right away.";
    }else{
      p.takeDamage(randVal);
      return super.getName() + " is already full, and bites and scratches you for insulting them with food.";
    }

  }
  /*
  Abstract method play that lets user play with the Tabby, and lets the Tabby attack the user.
  @param p the player object.
  @return returns a String that lets the user know if the Tabby attacks or plays depending on its hunger level.
  */
  @Override
  public String play(Player p){
    //the min and Max vary from each cat 
    int Min = 1;
    int Max = 4;
    int randVal = Min + (int)(Math.random() * ((Max - Min) + 1));
    if (super.getHunger() < 3){
      p.takeDamage(randVal);
      return super.getName() + " is annoyed, so it bites and scratches you for not feeding it.";
    }else if (super.getHunger() == 10){
      incrementHunger(-1);
      return super.getName() + " is so full, they can barely roll over to glare at you when you roll a jingle ball toward them.";
    }else{
      incrementHunger(-2);
      return super.getName() + " jumps and plays with the fake mouse toy.";
    }
  }
  /*
  Abstract method pet that lets user pet the Tabby, and lets the Tabby attack the user.
  @param p the player object.
  @return returns a String that lets the user know if the Tabby attacks or likes being pet depending on its hunger level.
  */
  @Override
  public String pet(Player p){
    //the min and Max vary from each cat 
    int Min = 1;
    int Max = 4;
    int randVal = Min + (int)(Math.random() * ((Max - Min) + 1));
    if (super.getHunger() < 3){
      p.takeDamage(randVal);
      return super.getName() + " is hungry, and bites and scratches you for annoying it.";
    }else if(super.getHunger() == 10) {
      return super.getName() + " is so full, they purr and fall asleep.";
    }else{
      return super.getName() + " purrs and brushes against you.";
    }

  }
  
}
