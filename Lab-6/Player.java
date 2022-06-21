public class Player {
  Die [] Dice;
  int points;

  public Player(){
    Dice = new Die[3];
    for( int i = 0; i < 3; i++ ) {
        Dice[i] = new Die(6);
    }
  }
        
  public int getPoints(){
      return points;
  }

  public void sort(){
    for(int i = 0; i < Dice.length-1; i++){
     
      for(int j = i + 1; j < Dice.length; j++){
        
        if(Dice[j].lessThan(Dice[i])){ 
          
          Die temp = Dice[j];
          Dice[j] = Dice[i];
          Dice[i] = temp;
        }
      }
    }
  }   

  public boolean pair(){
      if ((Dice[0].equals(Dice[1])) || (Dice[0].equals(Dice[2])) || (Dice[1].equals(Dice[2]))){
          points += 1;
          return true;
      }
      return false;
  }
  public boolean threeOfAKind(){
      if((Dice[0].equals(Dice[1])) && (Dice[0].equals(Dice[2])) && (Dice[1].equals(Dice[2]))){
         points += 3;
         return true;
      }
      return false;
  }
  public boolean series(){
      sort();
      if((Dice[2].difference(Dice[1])==1) && (Dice[1].difference(Dice[0])==1)){
        points += 2;
        return true;}
      return false;
  }

  public void roll(){
      for( int d = 0; d < 3; d++ ) {
            Dice[d].roll();
          }
      sort();
  }

  @Override
  public String toString(){
      return ("D1=" +Dice[0] + "," + "D2=" +Dice[1]+ "," +"D3="+ Dice[2]);
  }
}
