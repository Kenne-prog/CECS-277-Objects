import java.util.Random;
/*
* Acts as the Charmander pokemon
*/
public class Charmander extends Pokemon implements Fire{
  /**
	 * Default constructor will inherit the name
	 * and health of the pokemon
	 */
  public Charmander() {
    super("Charmander", 24);
  }
  //Subclasses of Pokemon MUST implement the abstract methods
  @Override
  /**
   * Displays the Special moves menu
   * @return the moves on the special menu
   */
  public String getSpecialMenu(){
    return specialMenu;
  }
  /**
   *The amount of special moves
   * @return number of Special moves
   */
  @Override
  public int getNumSpecialMenuItems(){
    return numSpecialMenuItems;
  }
  /**
   * depending on the decision of the trainer the move * will be selected
   * @param Pokemon p is the pokemon being attacked
   * @return the special move against the Pokemon p
   */
  @Override
  public String specialAttack(Pokemon p, int move){
    if (move == 1){
      return ember(p);
    }
    else if (move == 2){
      return fireBlast(p);
    }
    else{
      return firePunch(p);
    }
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String ember(Pokemon p){
    Random rand = new Random();
    int ember_damage = rand.nextInt(4);
    double ember_damage_boost = ember_damage * Pokemon.battleTable[0][p.getType()];
    int ember_damage_int = (int)Math.round(ember_damage_boost);
    p.takeDamage(ember_damage_int);
    String returnStringDamage = p.getName() + " is encased in EMBERS and takes " + ember_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String fireBlast(Pokemon p){
    int fireBlast_damage = (int)((Math.random() * 4) + 1);
    double fireBlast_damage_boost = fireBlast_damage * Pokemon.battleTable[0][p.getType()];
    int fireBlast_damage_int = (int)Math.round(fireBlast_damage_boost);
    p.takeDamage(fireBlast_damage_int);
    String returnStringDamage = p.getName() + " is BLASTED with FIRE and takes " + fireBlast_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String firePunch(Pokemon p){
    int firePunch_damage = (int)((Math.random() * 3) + 1);
    double firePunch_damage_boost = firePunch_damage * Pokemon.battleTable[0][p.getType()];
    int firePunch_damage_int = (int)Math.round(firePunch_damage_boost);
    p.takeDamage(firePunch_damage_int);
    String returnStringDamage = p.getName() + " is PUNCHED with FIRE and takes " + firePunch_damage_int + " damage";
    return returnStringDamage;
  }
}