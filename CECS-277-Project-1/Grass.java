/**
*Interface for Grass moves for Grasss type Pokemon Objects
*/
public interface Grass{
  public String specialMenu = "1.Vine Whip\n2.Razor Leaf\n3.Solar Beam";

  public int numSpecialMenuItems = 3;
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * vine whip be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String vineWhip(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * razor leaf be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String razorLeaf(Pokemon p);
  /**
   * 
   * @param p - Takes in the Pokemon object that
   * solar beam be used against
   * @return - Returns a message of the move being 
   * used against another pokemon 
   */
  public String solarBeam(Pokemon p);
}