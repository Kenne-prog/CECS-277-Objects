import java.util.Random; 
class FireDragon extends Dragon {
  private int fireShots;
  
  /**
	 * Constructs the fire dragon
	 * @param n is the name of the dragon.
	 * @param mHp is the max health points of the dragon.
	 */
  public FireDragon(String n, int mHp ){
    super(n, mHp);
    fireShots = 3;
  }
  
  /**
	 * Gives the dragon damage for it's special attack 
	 * @return the amount of damage the special attack does.
	 */
  public int fireShot(){
    if(fireShots > 0){
      Random rand = new Random(); 
      fireShots-= 1;
      return rand.nextInt(5) + 5; 
    }
    return 0;
  }
  
  /**
	 * displays the special attacks as a string
	 * @return how many special attack the dragon has left
	 */
  @Override
  public String toString(){
    return (super.toString() + "   Fire Shots Remaining : " + fireShots); 
  }
}
