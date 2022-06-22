import java.util.*;

class Ball{
  private static HashMap<String,Ball> colors = new HashMap<>();
  private String color;
  private int bounces;
  private int rolls;
  /**
	 * Constructs the ball
	 * @param String c is the color of the ball
	 */
  private Ball(String c){
    this.color = c;
    bounces = 0;
    rolls = 0;
  }
  /**
	 * Gets the instance of the ball
	 * @param String c is the color of the ball
	 */
  public static Ball getInstance(String c){
    if (!colors.containsKey(c)) {
      colors.put(c, new Ball(c));
    }
    return colors.get(c);
    }
  /**
	 * bounces the ball
	 */
  public void bounce(){
    bounces += 1;
  }
   /** 
	 * rolls the ball
	 */
  public void roll(){
    rolls += 1;
  }
  /**
	 * Displays the ball
	 */
  @Override
  public String toString() {
    return color+" Ball: "+"\n------------"+"\nRolls: "+rolls+"\nBounces: "+bounces;
  }
}