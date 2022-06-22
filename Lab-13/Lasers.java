/**
* Laser Decoration that adds extra hp, new name, and attack damage
* to a monster
*/
public class Lasers extends MonsterDecorator
{
  /**
  * Adds with lasers adjective and new laser stats to passed in monster
  *
  * @param newMonster Monster to have laser ability added to
  */
  public Lasers(Monster m){
    super(m, m.getName() + " with Laser Beams", m.getHP() + 5);
  }
  
  /**
  * Updates attack function to increase damage by 7
  *
  * @return New attack damage with laser addition
  */
  @Override
  public int attack(){
    int LASER_DAMAGE = 7;
    return super.attack() + LASER_DAMAGE; 
  }
}