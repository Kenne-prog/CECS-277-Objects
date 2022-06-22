1public class EatingState extends puppyState{
  
  /**
	 * If the puppy is eating the puppy will use this play
   * @param p is the puppy
	 */
  public void play(Puppy p){
    System.out.println("The puppy looks up from its food and chases the ball you threw.");
    p.setState(new PlayingState());
    p.incPlays();
  }
  /**
	 * If the puppy is eating the puppy will use this feed
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