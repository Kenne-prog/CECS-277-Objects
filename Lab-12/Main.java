import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    EnemyGenerator generator = new EnemyGenerator();
    int userHP = 25;
    int maxHP = 25;
    int enemiesSlain = 0;
    int choice;
    int damage;
    do{
      Enemy enemy = generator.generateEnemy();
      System.out.println("You have " + userHP + "/" + maxHP + " hp.");
      System.out.println("You encounter a "+enemy);
      do{
        System.out.println("What do you want to do?\n1. Attack Enemy\n2. Quit");
        choice = CheckInput.getIntRange(1,2);
        if(choice == 1){
          if(userHP > 0){
            damage = (int)(Math.random()*5 + 1);
            System.out.println("You attack " + enemy.getName() + " for " + damage + " damage.");
            enemy.takeDamage(damage);
            if(enemy.getHp() > 0){
              damage = enemy.attack();
              System.out.println(enemy.getName() + " attacks you for " + damage + " damage.");
              userHP -= damage; // attack the user
              System.out.println(enemy); // display the enemy state
            }
            else{
              System.out.println("You have slain the "+enemy.getName()+"\n");
              enemiesSlain++;
            }
          }
        }
        else if(choice != 2){
          System.out.println("Invalid choice!");
        }     
    }
    while(userHP > 0 && enemy.getHp() > 0 && choice != 2);
      
    }
    while(userHP > 0 && choice != 2);
    if(userHP <= 0){
      System.out.println("You have died.");
      
       // display number of enemies slain
       System.out.println("Enemies Slain: "+enemiesSlain);
       System.out.println("Game Over.");
    }
  }
}

