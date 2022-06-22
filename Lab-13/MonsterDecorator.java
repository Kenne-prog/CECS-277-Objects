public abstract class MonsterDecorator extends Monster
{
  private Monster monster;

  /**
  * Constructor that creates monsterdecorator for a monster object
  *
  * @param newMonster Monster to be decorated with new abilities
  * @param newName New Name for monster after getting appended with abilities
  * @param newHP New Hp for monster after getting appended with abilities
  */
  public MonsterDecorator(Monster m, String addName, int addHP){
    super(addName, addHP);
    monster = m;
  }

  /**
  * Attack function that uses the passed in monster's attack
  */
  public int attack(){
    return monster.attack();
  }
}
