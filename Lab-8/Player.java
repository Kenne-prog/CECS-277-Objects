public class Player{
  private int hp;

  /**
	 * Constructs the player
	 * @param hp is health points of the player.
	 */
  public Player(int hp) {
    this.hp = hp;
  }
  
  /**
	 * Constructs the player
	 * @returns the hp of the player
	 */
  public int getHp() {
  return hp;
  }
  
  /**
	 * Constructs the player
	 * @param d is amount of damage the player takes
	 */
  public void takeDamage(int d) {
   if (hp > 0){
     hp -= d;
   }
   else{
     hp = 0;
   }
  }
  /**
	 * Displays the users hp as a string
	 */
  @Override
  public String toString(){
     return "You have " + this.hp + "/10 HP"; 
  }
}

