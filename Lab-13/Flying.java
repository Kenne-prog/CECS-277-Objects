/**
* Fire Decoration that adds extra hp, new name, and attack damage
* to a monster
*/
public class Flying extends MonsterDecorator
{
  /**
  * Adds fiery adjective and new fire stats to passed in monster
  *
  * @param newMonster Monster to which fire powers are to be appended to
  */
  public Flying(Monster m)
  {
    super(m, "Flying " + m.getName(), m.getHP() + 2);
  }
  
  /**
  * Updates attack function to increase damage by 5
  *
  * @return New attack damage with fire addition
  */
  @Override
  public int attack(){
    int FIRE_DAMAGE = 5;
    return super.attack() + FIRE_DAMAGE; 
  }
}
