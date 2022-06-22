public class Enemy {
  
  private String name;
  private int maxHp;
  private int hp;
  /**
	 * Constructs the enemy
	 * @param String n is the name
	 * @param h is the health
	 */
  public Enemy(String n, int h) {
    name = n;
    maxHp = h;
    hp = h;
  }

  /**
	 * Constructs a copy
	 * @param e is the enemy
	 */
  public Enemy(Enemy e) {
    name = e.name;
    hp = e.hp;
    maxHp = e.maxHp;
  }

  /**
	 * Accesses the name
   * @return the name of the enemy
	 */
  public String getName() {
    return name;
  }
  
  /**
	 * Accesses the hp
   * @return the hp of the enemy
	 */
  public int getHp() {
    return hp;
  }
  
  /**
	 * damages the object
   * @param h is the hp of the object
	 */
  public void takeDamage(int h) {   
    hp -= h;
      if(hp < 0){
        hp = 0;
      }
   }
  
  /**
	 * Decides the damage
   * @return amount of damage the object will take
	 */
  public int attack() {
    return (int)(Math.random()*5) + 1;
  }
  
  /**
	 * Displays the name and hp of the object
   * @return the name and hp of the object
	 */
  @Override
  public String toString() {
    return name + "\n" + "HP: " + hp + "/" + maxHp;
  }

  /**
	 * clone of the enemy
   * @return clone of the enemy
	 */
  public Enemy clone() {
    return new Enemy(this);
  }
  
}