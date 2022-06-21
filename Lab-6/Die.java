public class Die{
  private int sides;
  private int value;
  
  public Die(int s){
    if (s > 1){
      sides = s;
    } else{
      sides = 6;
    }
    roll();
  }

  public int roll(){
    value = (int)( Math.random() * sides ) + 1;
    return value;
  }
  
  @Override
  public boolean equals(Object obj) {
    Die Dice = (Die) obj;
    if (value != Dice.value)
      return false;
    if (sides != Dice.sides)
      return false;
    return true;
   }

  public boolean lessThan(Die d){
    return (value < d.value);
  }

  public int difference(Die d){
    return(value - d.value);
  }
  @Override
  public String toString(){
    return("" + value);
  }
}
