import java.util.Random;
/**
 * Acts as the Bulbasaur pokemon
 */
public class Bulbasaur extends Pokemon implements Grass{
  /**
	 * Default constructor will inherit the name
	 * and health of the pokemon
	 */
  public Bulbasaur(){
    super("Bulbasaur", 24);
  }
  //Subclasses of Pokemon MUST implement the abstract methods
  /**
   * Displays the Special moves menu
   * @return the moves on the special menu
   */
  @Override
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
      return vineWhip(p);
    }
    else if (move == 2){
      return razorLeaf(p);
    }
    else{
      return solarBeam(p);
    }
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String vineWhip(Pokemon p){
    Random rand = new Random();
    int vineWhip_damage = (int)((Math.random() * 3) + 1);;
    double vineWhip_damage_boost = vineWhip_damage * Pokemon.battleTable[2][p.getType()];
    int vineWhip_damage_int = (int)Math.round(vineWhip_damage_boost);
    p.takeDamage(vineWhip_damage_int);
    String returnStringDamage = p.getName() + " is VINE WHIPPED and takes " + vineWhip_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String razorLeaf(Pokemon p){
    Random rand = new Random();
    int razorLeaf_damage = (int)((Math.random() * 3) + 2);;
    double razorLeaf_damage_boost = razorLeaf_damage * Pokemon.battleTable[2][p.getType()];
    int razorLeaf_damage_int = (int)Math.round(razorLeaf_damage_boost);
    p.takeDamage(razorLeaf_damage_int);
    String returnStringDamage = p.getName() + " is slashed with RAZOR LEAF and takes " + razorLeaf_damage_int + " damage";
    return returnStringDamage;
  }
  /**
   * Does the damgaging
   * @param Pokemon p is the pokemon getting attacked
   * @return the string that shows that battle
   */
  @Override
  public String solarBeam(Pokemon p){
    Random rand = new Random();
    int solarBeam_damage = rand.nextInt(6);
    double solarBeam_damage_boost = solarBeam_damage * Pokemon.battleTable[2][p.getType()];
    int solarBeam_damage_int = (int)Math.round(solarBeam_damage_boost);
    p.takeDamage(solarBeam_damage_int);
    String returnStringDamage = p.getName() + " is dazzled by SOLAR BEAM and takes " + solarBeam_damage_int + " damage";
    return returnStringDamage;
  }
}