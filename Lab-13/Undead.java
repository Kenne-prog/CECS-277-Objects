public class Undead extends Monster
{
  /**
  * Constructor for this class. Sets the initial HP and name for the Zombie
  */
  public Undead(){
    super("Undead", 9);
  }

  /**
  * Returns the base attack power of the Zombie
  * @return - returns 2 which is the base attack power of the Zombie
  */
  @Override
  public int attack(){
    return 2;
  }
}