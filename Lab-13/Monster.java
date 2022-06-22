/**
* Abstract monster class for generic monster that can deal damage
*/
public abstract class Monster{
  private String name;
  private int hp;

  /**
  * Sets name and hp without need of set functions
  *
  * @param newName Name of monster to be initialized to
  * @param newHP Max HP for monster to be intitizalized to
  */
  public Monster(String newName, int newHP){
    name = newName;
    hp = newHP;
  }
  /**
  * Returns name of monster
  *
  * @return Name of monster
  */
  public String getName(){
    return name;
  }

  /**
  * Returns health points of monster
  *
  * @return Health points of monster
  */
  public int getHP(){
    return hp;
  }

  /**
  * Returns amount of health points to be dealt in an attack
  *
  * @return Amount of damage monster can deal 
  */
  public abstract int attack();

}