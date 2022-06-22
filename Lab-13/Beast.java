/**
* Specified beast monster with unique name and health points
*/
public class Beast extends Monster{
  /**
  * Constructor for this class. Sets the initial HP and name for the Beast
  */
  public Beast(){
    super("Beast", 12);
  }

  /**
  * Returns the base attack power of the Beast
  * @return - returns 3 which is the base attack power of the Beast
  */
  @Override
  public int attack(){
    return 4;
  }
}