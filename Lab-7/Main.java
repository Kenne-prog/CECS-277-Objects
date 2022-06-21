/* CECS 227 Sec 4
 * Lab #7
 * Kenneth Nguyen
 * Christian Arrendondo
 *Description:
 *  Program that allows the user to fight dragons
 */
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    Dragon firstDragon = new Dragon("Deadly Nadder", 10);
    FireDragon secondDragon = new FireDragon("Gronckle", 15);
    FlyingDragon thirdDragon = new FlyingDragon("Timberjack", 20);

    System.out.println("What is your name, challenger?");
    String person = input.nextLine(); 
    int personHp = 50;
    int dragonsbeat = 0;
    System.out.println("Welcome to Dragon Training " + person);
    System.out.println("You must defeat 3 Dragons \n");
    // when the user is still alive and there are still dragons
    while(personHp >0 && dragonsbeat < 3){
    
      System.out.println(person +" Hp : "+ personHp);
      //displays drag if it is sitll alive
      if(firstDragon.getHp() != 0){
        System.out.print("1. Attack "+firstDragon);
      }  
    
      if(secondDragon.getHp() != 0){
        System.out.println("2. Attack "+secondDragon);
      }
    
      if(thirdDragon.getHp() != 0){
        System.out.println("3. Attack "+thirdDragon);
      }
      //choose which drag to attack 
      int attack_dragon = CheckInput.getIntRange(1,3);
      System.out.println();
      // checks if the drag is alive if not give and error
      if(attack_dragon == 1){
        if(firstDragon.getHp() == 0){
          System.out.println("This dragon has been defeated.");
          continue;
        }   
      }
    
      else if(attack_dragon == 2){
        if(secondDragon.getHp() == 0){
          System.out.println("This dragon has been defeated.");
          continue;
        }   
      }

      else if(attack_dragon == 3){
        if(thirdDragon.getHp() == 0){
          System.out.println("This dragon has been defeated.");
          continue;
        }
      }
      // let the user choose weapon
      System.out.println("Attack With : \n1. Arrow (1 D12)\n2. Sword (2 D6)");
      int attack_choice = CheckInput.getIntRange(1,2);
      System.out.println();
      int attack_value;
      //randomly gives the user damage of weapons
      if(attack_choice == 1){
        attack_value = rand.nextInt(12) + 1;
        System.out.println("You hit the dragon with an arrow.");
      }
      else{
        attack_value = (rand.nextInt(6)+rand.nextInt(6))+ 2;
        System.out.println("You slash the dragon with your sword.");
      }
      //depending on dragon fighting it takes damage
      if(attack_dragon == 1){
        firstDragon.takeDamage(attack_value);
        if(firstDragon.getHp() == 0){
          System.out.println("Deadly Nadder has been defeated.");
          dragonsbeat += 1;
        }
      }

      else if(attack_dragon == 2){
        secondDragon.takeDamage(attack_value);
        if(secondDragon.getHp() == 0){
          System.out.println("Gronckle has been defeated.");
          dragonsbeat += 1;
        }
      }

      else if(attack_dragon == 3){
        thirdDragon.takeDamage(attack_value);
        if(thirdDragon.getHp() == 0){
          System.out.println("Timberjack has been defeated.");
          dragonsbeat += 1;
        }
      }
      
      if(dragonsbeat == 3){
        break;
      }
      
      // variable to for type of attack (normal or special)
      int dragon_atk;
      int attacking_dragon;
      //chooses a random dragon and if it is not defeated it will be selected
      while(true){
        attacking_dragon = rand.nextInt(3)+1;
        if(attacking_dragon == 1 && firstDragon.getHp() != 0)
          break;
        else if(attacking_dragon == 2 && secondDragon.getHp() != 0)
          break;
        else if(attacking_dragon == 3 && thirdDragon.getHp() != 0)
          break;
      }
      // the randomly chosen dragon will deal damage
      if(attacking_dragon == 1){
        dragon_atk = firstDragon.attack();
        System.out.println(firstDragon.getName()+ " headbutted you.");
        personHp -= dragon_atk;  
      }

      else if(attacking_dragon == 2){
        int atk_type = rand.nextInt(2) + 1;
        if(atk_type  == 1){
          dragon_atk = secondDragon.attack();
          System.out.println(secondDragon.getName()+ " slammed you.");
        }
        else{
            dragon_atk = secondDragon.fireShot();
            System.out.println(secondDragon.getName()+ " spewed magma at you");
          }
        personHp -= dragon_atk; 
        }  
 


      else if(attacking_dragon == 3){
        int atk_type = rand.nextInt(2) + 1;
        if(atk_type  == 1){
          dragon_atk= thirdDragon.attack();
          System.out.println(thirdDragon.getName()+ " whipped it's tail at you.");
        }
        else{
            dragon_atk = thirdDragon.swoopAttack();
            System.out.println(thirdDragon.getName()+ " swooped in and clawwed you");
        }
          personHp -= dragon_atk;       
      } 
    }

    if(dragonsbeat == 3){
      System.out.println("\nCongratulations! " + person + "\nYou defeated all 3 Dragons\nYou Won!" );
    }

    else{
      System.out.println("\nYou lost.\nThe dragons have defeated you");
    }
  }
}