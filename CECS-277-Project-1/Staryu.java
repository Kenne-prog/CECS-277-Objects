import java.util.Random;
public class Staryu extends Pokemon implements Water{
  /**
	 * Default constructor will inherit the name
	 * and health of the pokemon
	 */
  public Staryu(){
    super("Staryu", 24);
  }
  /**
   * Displays the Special moves menu
   * @return the moves on the special menu
   */
  @Override
  public String getSpecialMenu(){
    return specialMenu;
  }
  /**
   * The amount of special moves
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
      return waterGun(p);
    }
    else if (move == 2){
      return bubbleBeam(p);
    }
    else{
      return waterfall(p);
    }
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String waterGun(Pokemon p){
    int waterGun_damage = (int)((Math.random() * 5) + 1);
    double waterGun_damage_boost = waterGun_damage * Pokemon.battleTable[1][p.getType()];
    int waterGun_damage_int = (int)Math.round(waterGun_damage_boost);
    p.takeDamage(waterGun_damage_int);
    String returnStringDamage = p.getName() + " is shot with WATER GUN and takes " + waterGun_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String bubbleBeam(Pokemon p){
    int bubbleBeam_damage = (int)((Math.random() * 2) + 1);
    double bubbleBeam_damage_boost = bubbleBeam_damage * Pokemon.battleTable[1][p.getType()];
    int bubbleBeam_damage_int = (int)Math.round(bubbleBeam_damage_boost);
    p.takeDamage(bubbleBeam_damage_int);
    String returnStringDamage = p.getName() + " is blasted with BUBBLES and takes " + bubbleBeam_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String waterfall(Pokemon p){
    int waterfall_damage = (int)((Math.random() * 4) + 1);
    double waterfall_damage_boost = waterfall_damage * Pokemon.battleTable[1][p.getType()];
    int waterfall_damage_int = (int)Math.round(waterfall_damage_boost);
    p.takeDamage(waterfall_damage_int);
    String returnStringDamage = p.getName() + " is splashed with a WATERFALL and takes " + waterfall_damage + " damage";
    return returnStringDamage;
  }
}