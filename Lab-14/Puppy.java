public class Puppy{
    
  private puppyState state;
  private int numFeeds;
  private int numPlays;

  /**
	 * Constructs the puppy
	 */
  public Puppy(){
    numFeeds = 0;
    numPlays = 0;
    state = new AsleepState();        
  }

  /**
	 * Gets the state of the puppy
   * @param s is the state of the puppy you are making * it
	 */
  public void setState(puppyState s){
    state = s;
  }

  /**
	 * Makes the puppy play
	 */
  public void throwBall(){
    state.play(this);
  }

  /**
	 * Makes the puppy eat
	 */
  public void giveFood(){
    state.feed(this);
  }
  
  /**
	 * increments feed
	 */
  public int incFeeds(){
    numFeeds++;
    return numFeeds;
  }

  /**
	 * increments play
	 */
  public int incPlays(){
      numPlays++;
      return numPlays;
  }

  /**
	 * resets the puppy's feed, play, and state
	 */
  public void reset(){
    numFeeds = 0;
    numPlays = 0;
    state = new AsleepState();
  }
}
