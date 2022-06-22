public class PlayingState extends puppyState{
  /**
	 * If the puppy is playing the puppy will use this play
   * @param p is the puppy
	 */
  public void play(Puppy p){
    System.out.println("You threw the ball again and the puppy excitedly chases it.");
    int fatigue = p.incPlays();
    if(fatigue>2){
      System.out.println("The puppy played so much it fell asleep!");
      p.reset();
    }
  }

  /**
	 * If the puppy is playing the puppy will use this feed
   * @param p is the puppy
	 */
  public void feed(Puppy p){
    System.out.println("The puppy continues to eat as you add another scoop of kibble to its bowl.");
    int feed = p.incFeeds();
    if(feed > 2){
      System.out.println("The puppy ate so much it fell asleep!");
      p.reset();
    }
  }
}