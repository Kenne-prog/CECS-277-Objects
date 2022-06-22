/**
* Specified alien monster with unique name and health points
*/
public class Alien extends Monster{
  /**
  * Constructor for this class. Sets the initial HP and name for the Alien
  */
  public Alien(){
    super("Alien", 6);
  }
  /**
  * Returns the base attack power of the Alien
  *
  * @return - returns 1 which is the base attack power of the Alien
  */
  @Override
  public int attack()
  {
    return 5;
  }
}
