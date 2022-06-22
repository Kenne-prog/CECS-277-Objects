/**
*Interface for Fire moves of a Fire type Pokemon object
*/
public interface Fire{

  public String specialMenu = "1.Ember\n2.Fire Blast\n3.Fire Punch";
  public int numSpecialMenuItems = 3;
   /**
   * 
   * @param p - Takes in the Pokemon object that
   * ember be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String ember(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * fire blast be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String fireBlast(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * fire punch be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String firePunch(Pokemon p);

}