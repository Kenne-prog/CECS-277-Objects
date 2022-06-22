import java.util.Scanner;
import java.util.Random;
import java.lang.Math; 
public abstract class Pokemon extends Entity{
  /**
	 * Default constructor will inherit the name
	 * and max hp of the pokemon
   * @param String n is the name of the pokemon
   * @param int mHp is the max hp of the pokemon
	 */
  public Pokemon(String n, int mHp) {
    super(n,mHp);
  }
  public static final double [][] battleTable = {{1,.5,2}, {2,1,.5}, {.5,2,1}};
  public abstract String getSpecialMenu();
  public abstract int getNumSpecialMenuItems();
  public abstract String specialAttack(Pokemon p, int move);
  /**
	 * String of the basic moves
	 * @return the basic moves as a string
	 */
  public String getBasicMenu(){
    return "1.slam\n2.tackle\n3.punch";
  }
  /**
	 * Gets the number of moves in the basic moves
	 * @return the amount of basic moves
	 */
  public int getNumBasicMenuItems(){
    return 3;
  }
  /**
	 * Depending on the trainer choice attack with a move
	 * @param Pokemon p is the pokemon getting attacked
   * @param int move is the decision of the trainer
   * @return the battle based on the move as a string
	 */
  //"int move" will be what the move the user chooses
  public String basicAttack(Pokemon p, int move){
    if (move == 1){
      return slam(p);
    }
    else if(move == 2){
      return tackle(p);
    }
    else {
      return punch(p);
    }
  }
  /**
	 * Makes menu of choices of basic or special attack
   * @return the two choices as a string
	 */
  //This should allow the user to choose either 
  //1.Basic attack or 2.Special attack 
  public String getAttackMenu() {
    String attack_menu = "1.Basic Attack\n2.Special Attack";
    return attack_menu;
  }
  /**
	 * Gets the number of types of attacks
	 * @return the amount of types of attacks
	 */
  public int getNumAttackMenuItems() {
    return 2;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  public String slam (Pokemon p) {
    Random rand = new Random();
    int damage = rand.nextInt(6);
    p.takeDamage(damage);
    String returnStringDamage = this.getName() + " SLAMS " + p.getName() + " for " + damage + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  public String tackle (Pokemon p) {
    Random rand = new Random();
    int damage = rand.nextInt(2) + 2;
    p.takeDamage(damage);
    String returnStringDamage = getName() + " TACKLES " + p.getName() + " for " + damage + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  public String punch (Pokemon p) {
    Random rand = new Random();
    int damage = rand.nextInt(4) + 1;
    p.takeDamage(damage);
    String returnStringDamage = getName() + " PUNCHES " + p.getName() + " for " + damage + " damage";
    return returnStringDamage;
  }
  /**
   * Gets the type of the pokemon
   * @return an int depending on the type of pokemon
   */
  public int getType() {
    int result;
    if (this instanceof Charmander || this instanceof Ponyta){
      result = 0;
    }
    else if (this instanceof Squirtle || this instanceof Staryu){
      result = 1;
    }
    else{
      result = 2;
    }
    return result;
  }
}