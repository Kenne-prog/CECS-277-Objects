public class AsleepState extends puppyState{
  
  /**
	 * If the puppy is asleep the puppy will use this play
   * @param p is the puppy
	 */
  public void play(Puppy p){
    System.out.println("Puppy is asleep. It doesn't want to play now.");
  }

  /**
	 * If the puppy is asleep the puppy will use this feed
   * @param p is the puppy
	 */
  public void feed(Puppy p){
    p.setState(new EatingState());
    System.out.println("Puppy wakes up and comes running to eat");
    p.incFeeds();
  }
}
