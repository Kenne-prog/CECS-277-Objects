import java.util.Scanner;
import java.util.Random;

public class Dragon{
  private String name;
  private int hp;
  private int maxHp; 

   /**
	 * Constructs the dragon
	 * @param n is the name of the dragon.
	 * @param mHp is the max health points of the dragon.
	 */
  public Dragon(String n, int mHp){
    name = n;
    maxHp = mHp;
    hp = maxHp;
  }

  /**
	 * @return the name of the dragon
	 */
  public String getName(){
    return name;
  }

  /**
	 * @return the hp of the dragon
	 */
  public int getHp(){
    return hp;
  }
  
  /**
	 * @return the amount of damage a dragon does
	 */
  public int attack(){
    Random rand = new Random();
    return rand.nextInt(5) + 3;
  }

  /**
	 * @return the amount of damage the player recieves 
   * @parm d damage that lowers the player's hp
	 */
  public void takeDamage(int d){
    hp -= d;
		if (hp < 0) {
      hp = 0;
		}
  }

  /**
	 * displays the name and hp left from the max hp
	 * @return the name and how much hp the player has
	 */
  @Override
  public String toString(){
    return String.format("%s HP: %d/%d\n", name, hp, maxHp); 
  }
}