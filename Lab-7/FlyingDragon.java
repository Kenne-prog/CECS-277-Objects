import java.util.Random;
class FlyingDragon extends Dragon {
  private int swoops;

  /**
	 * Constructs the flying dragon
	 * @param n is the name of the dragon.
	 * @param mHp is the max health points of the dragon.
	 */
  public FlyingDragon(String n, int mHp ){
    super(n, mHp);
    swoops = 5;
  }
  
  /**
	 * Gives the dragon damage for it's special attack 
	 * @return the amount of damage the special attack does.
	 */
  public int swoopAttack(){
    if(swoops > 0 ){
      Random rand = new Random();
      swoops-= 1;
      return rand.nextInt(6) + 5;
    }
    return 0;
  }
  
  /**
	 * displays the special attacks as a string
	 * @return how many special attack the dragon has left
	 */
  @Override
  public String toString(){
    return (super.toString() + "   Swoop Attacks Remaining : " + swoops); 
  }
}
