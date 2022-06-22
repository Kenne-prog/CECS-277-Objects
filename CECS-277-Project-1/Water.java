/**
*Interface for Water moves of Water type pokemon
*/
public interface Water{
  public String specialMenu = "1.Water Gun\n2.Bubble Beam\n3.Waterfall";

  public int numSpecialMenuItems = 3;
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * water gun be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String waterGun(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * bubble beam be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String bubbleBeam(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * water fall be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String waterfall(Pokemon p);
}