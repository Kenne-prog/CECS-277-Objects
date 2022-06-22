import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Prof. Oak: Hello there new trainer,\nwhat is your name?");
    String trainer_name = CheckInput.getString();
    System.out.println("Choose your first pokemon:\n1.Charmander\n2.Bulbasaur\n3.Squirtle");

    Charmander c = new Charmander();
    Bulbasaur b = new Bulbasaur();
    Squirtle s = new Squirtle();
    Map m = new Map();
    int map_layout = 1;
    Trainer t = null;
    int input = CheckInput.getIntRange(1,3);
    if (input == 1){
      t  = new Trainer(trainer_name, c, m);
    }

    else if (input == 2){
      t = new Trainer(trainer_name, b, m);
    }
    else if (input == 3){
      t = new Trainer(trainer_name, s, m);
    }
    m.mapToString(t.getLocation());
    for (int p = 0; p < 5; p++){
      t.recievePokeball();
    }
    t.recievePotion();
    t.recieveMoney(25);
    while(t.getHp() > 0){
      int pokemon_size_before = t.getNumPokemon();
      System.out.println(t);
      System.out.println(m.mapToString(t.getLocation()));
      int map_loc = MainMenu();
      Random rand = new Random();
      if (map_loc == 1){
        char location = t.goNorth();
        if (location == 'n'){
          System.out.println("There is nothing here");
        }
        else if (location == 'w'){
          Pokemon wild = chooseRandomPokemon();
          trainerAttack(t, wild);
          int pokemon_size_after = t.getNumPokemon();
          if (pokemon_size_after - pokemon_size_before == 1){
            m.removeCharAtLoc(t.getLocation());
          }
          if (wild.getHp() <= 0){
            m.removeCharAtLoc(t.getLocation());
          }
        }
        else if(location == 'i'){
          int rand_item = rand.nextInt(1);
          if (rand_item == 0){
            System.out.println("You found a pokeball!");
            t.recievePokeball();
          }
          else{
            System.out.println("You found a potion!");
            t.recievePotion();
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'c'){
          Store(t);
        }
        else if (location == 'p'){
          int rand_interaction = rand.nextInt(3);
          if (rand_interaction == 0){
            t.takeDamage(3);
            System.out.println("You run into Misty.\nMisty: Where's my bike, twerp!\nMisty SMACKS you for 3 damange");
          }
          else if (rand_interaction == 1){
            System.out.println("You run into BROCK.\nBrock: Hey " + t.getName() + ", here's something that will help you out!");
            int rand_item = rand.nextInt(1);
            if (rand_item == 0){
              t.recievePokeball();
              System.out.println("BROCK gives you a pokeball!");
            }
            else{
              System.out.println("BROCK gives you a potion!");
              t.recievePotion();
            }
          }
          else if (rand_interaction == 2){
            t.recieveMoney(5);
            System.out.println("You run into PROFESSOR OAK.\nProfessor Oak: Hello "+ t.getName() + ",here is some money to help you on your adventure!\nPROFESSOR OAK gives you $5");
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'f'){
          System.out.println("You've found the finish...");
          switch (map_layout){
            case 1:
              map_layout = 2;
              m.loadMap(map_layout);
              break;
            case 2:
              map_layout = 3;
              m.loadMap(map_layout);
              break;
            case 3:
              map_layout = 1;
              m.loadMap(map_layout);
              break;
          }
        }
      }
      else if(map_loc == 2){
        char location = t.goSouth();
        if (location == 'n'){
          System.out.println("There is nothing here");
        }
        else if (location == 'w'){
          Pokemon wild = chooseRandomPokemon();
          trainerAttack(t, wild);
          int pokemon_size_after = t.getNumPokemon();
          if (pokemon_size_after - pokemon_size_before == 1){
            m.removeCharAtLoc(t.getLocation());
          }
          if (wild.getHp() <= 0){
            m.removeCharAtLoc(t.getLocation());
          }
        }
        else if(location == 'i'){
          int rand_item = rand.nextInt(1);
          if (rand_item == 0){
            t.recievePokeball();
            System.out.println("You found a pokeball!");
          }
          else{
            System.out.println("You found a potion!");
            t.recievePotion();
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'c'){
          Store(t);
        }
        else if (location == 'p'){
          int rand_interaction = rand.nextInt(3);
          if (rand_interaction == 0){
            t.takeDamage(3);
            System.out.println("You run into Misty.\nMisty: Where's my bike, twerp!\nMisty SMACKS you for 3 damange");
          }
          else if (rand_interaction == 1){
            System.out.println("You run into BROCK.\nBrock: Hey " + t.getName() + ", here's something that will help you out!");
            int rand_item = rand.nextInt(1);
            if (rand_item == 0){
              t.recievePokeball();
              System.out.println("BROCK gives you a pokeball!");
            }
            else{
              System.out.println("BROCK gives you a potion!");
              t.recievePotion();
            }
          }
          else if (rand_interaction == 2){
            t.recieveMoney(5);
            System.out.println("You run into PROFESSOR OAK.\nProfessor Oak: Hello "+ t.getName() + ",here is some money to help you on your adventure!\nPROFESSOR OAK gives you $5");
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'f'){
          System.out.println("You've found the finish...");
          switch (map_layout){
            case 1:
              map_layout = 2;
              m.loadMap(map_layout);
              break;
            case 2:
              map_layout = 3;
              m.loadMap(map_layout);
              break;
            case 3:
              map_layout = 1;
              m.loadMap(map_layout);
              break;
          }
        }
      }
      else if(map_loc == 3){
        char location = t.goEast();
        if (location == 'n'){
          System.out.println("There is nothing here");
        }
        else if (location == 'w'){
          Pokemon wild = chooseRandomPokemon();
          trainerAttack(t, wild);
          int pokemon_size_after = t.getNumPokemon();
          if (pokemon_size_after - pokemon_size_before == 1){
            m.removeCharAtLoc(t.getLocation());
          }
          if (wild.getHp() <= 0){
            m.removeCharAtLoc(t.getLocation());
          }
        }
        else if(location == 'i'){
          int rand_item = rand.nextInt(1);
          if (rand_item == 0){
            System.out.println("You found a poke ball!");
            t.recievePokeball();
          }
          else{
            System.out.println("You found a potion");
            t.recievePotion();
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'c'){
          Store(t);
        }
        else if (location == 'p'){
          int rand_interaction = rand.nextInt(3);
          if (rand_interaction == 0){
            t.takeDamage(3);
            System.out.println("You run into Misty.\nMisty: Where's my bike, twerp!\nMisty SMACKS you for 3 damange");
          }
          else if (rand_interaction == 1){
            System.out.println("You run into BROCK.\nBrock: Hey " + t.getName() + ", here's something that will help you out!");
            int rand_item = rand.nextInt(1);
            if (rand_item == 0){
              t.recievePokeball();
              System.out.println("BROCK gives you a pokeball!");
            }
            else{
              System.out.println("BROCK gives you a potion!");
              t.recievePotion();
            }
          }
          else if (rand_interaction == 2){
            t.recieveMoney(5);
            System.out.println("You run into PROFESSOR OAK.\nProfessor Oak: Hello "+ t.getName() + ",here is some money to help you on your adventure!\nPROFESSOR OAK gives you $5");
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'f'){
          System.out.println("You've found the finish...");
          switch (map_layout){
            case 1:
              map_layout = 2;
              m.loadMap(map_layout);
              break;
            case 2:
              map_layout = 3;
              m.loadMap(map_layout);
              break;
            case 3:
              map_layout = 1;
              m.loadMap(map_layout);
              break;
          }
        }
      }
      else if(map_loc == 4){
        char location = t.goWest();
        if (location == 'n'){
          System.out.println("There is nothing here");
        }
        else if (location == 'w'){
          Pokemon wild = chooseRandomPokemon();
          trainerAttack(t, wild);
          int pokemon_size_after = t.getNumPokemon();
          if (pokemon_size_after - pokemon_size_before == 1){
            m.removeCharAtLoc(t.getLocation());
          }
          if (wild.getHp() <= 0){
            m.removeCharAtLoc(t.getLocation());
          }
        }
        else if(location == 'i'){
          int rand_item = rand.nextInt(1);
          if (rand_item == 0){
            System.out.println("You found a poke ball!");
            t.recievePokeball();
          }
          else{
            System.out.println("You found a potion!");
            t.recievePotion();
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'c'){
          Store(t);
        }
        else if (location == 'p'){
          int rand_interaction = rand.nextInt(3);
          if (rand_interaction == 0){
            t.takeDamage(3);
            System.out.println("You run into Misty.\nMisty: Where's my bike, twerp!\nMisty SMACKS you for 3 damange");
          }
          else if (rand_interaction == 1){
            System.out.println("You run into BROCK.\nBrock: Hey " + t.getName() + ", here's something that will help you out!");
            int rand_item = rand.nextInt(1);
            if (rand_item == 0){
              t.recievePokeball();
              System.out.println("BROCK gives you a pokeball!");
            }
            else{
              System.out.println("BROCK gives you a potion!");
              t.recievePotion();
            }
          }
          else if (rand_interaction == 2){
            t.recieveMoney(5);
            System.out.println("You run into PROFESSOR OAK.\nProfessor Oak: Hello "+ t.getName() + ",here is some money to help you on your adventure!\nPROFESSOR OAK gives you $5");
          }
          m.removeCharAtLoc(t.getLocation());
        }
        else if (location == 'f'){
          System.out.println("You've found the finish...");
          switch (map_layout){
            case 1:
              map_layout = 2;
              m.loadMap(map_layout);
              break;
            case 2:
              map_layout = 3;
              m.loadMap(map_layout);
              break;
            case 3:
              map_layout = 1;
              m.loadMap(map_layout);
              break;
          }
        }
      }
      else{
        t.takeDamage(25);
        break;
      }
    }
    if (t.getHp() <= 0){
      System.out.println("Game Over");
    }
  }
    /**
     * Assign what kind of pokemon the wild pokemon
     * will be
     * @return - returns a random pokemon that will
     */
    //Randomizes 1-6 and chooses a corresponding pokemon to construct and return
    public static Pokemon chooseRandomPokemon(){
      int wild_pokemon = (int)((Math.random() * 6) + 1);
      if (wild_pokemon == 1){
        return new Charmander();
      }
      else if(wild_pokemon == 2){
        return new Squirtle();
      }
      else if(wild_pokemon == 3){
        return new Bulbasaur();
      }
      else if(wild_pokemon == 4){
        return new Ponyta();
      }
      else if(wild_pokemon == 5){
        return new Staryu();
      }
      else{
        return new Oddish();
      }
    }
    /**
     * Displays the Main Menu
     * @return - returns the direction the user want to go to
     */
    public static int MainMenu(){
      System.out.println("1. Go North\n2. Go South\n3. Go East\n4. Go West\n5. Quit");
      int map_movement = CheckInput.getIntRange(1,5);
      return map_movement;
    }

    /**
     * Decides what the trainer wants to do when
     * fighting a wild pokemon
     * @param t - t will be the trainer
     * @param wild - wild will be the wild pokemon
     * encountered
     */
    public static void trainerAttack(Trainer t, Pokemon wild){
      //Create a print statement that will say a wild
      //pokemon has appeared. The wild pokemon needs to be
      //specified like if its a Bulbasaur or smth
      boolean operation = true;
      System.out.println("A wild " + wild.getName() + " has appeared.");
      do{
        System.out.println(wild);
        System.out.println("What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away");
        int options = CheckInput.getIntRange(1,4);
        if (options == 1){
          System.out.println("Choose a Pokemon:");
          System.out.println(t.getPokemonList());
          int pokemon_choice = CheckInput.getIntRange(1,t.getNumPokemon());
          Pokemon currentPokemon = t.getPokemon(pokemon_choice-1);
          if (currentPokemon.getHp() > 0){
            System.out.println(t.getPokemon(pokemon_choice-1).getName() + ", I choose you!");
            System.out.println(currentPokemon.getAttackMenu());

            int attack_choice = CheckInput.getIntRange(1,currentPokemon.getNumAttackMenuItems());

            if (attack_choice == 1){
              System.out.println(currentPokemon.getBasicMenu());
              int basic_attack = CheckInput.getIntRange(1,currentPokemon.getNumBasicMenuItems());
              System.out.println(currentPokemon.basicAttack(wild, basic_attack));
            }
            else{
              System.out.println(currentPokemon.getSpecialMenu());
              int special_attack = CheckInput.getIntRange(1, currentPokemon.getNumSpecialMenuItems());
              System.out.println(currentPokemon.specialAttack(wild, special_attack));
            }
            if (wild.getHp() > 0){
              int wild_choice = (int)((Math.random() * 2) + 1);
              if (wild_choice == 1){
                int wild_basic_attack = (int)((Math.random() * 3) + 1);
                System.out.println(wild.basicAttack(currentPokemon, wild_basic_attack));
              }
              else {
                int wild_special_attack = (int)((Math.random() * 3) + 1);
                System.out.println(wild.specialAttack(currentPokemon, wild_special_attack));
              }
            }
            if (currentPokemon.getHp() <= 0){
              System.out.println(currentPokemon.getName() + " has fainted!");
            }
          }
          else if (currentPokemon.getHp() <= 0){
            System.out.println("This pokemon has fainted.");
            int wild_attack = (int)((Math.random()* 4) + 1);
            t.takeDamage(wild_attack);
            System.out.println(wild.getName() + " hits you instead for " + wild_attack + " damage");
          }
          if (t.getHp() <= 0){
            System.out.println("You have fainted!");
            operation = false;
            break;
          }
        }
        else if (options == 2){
           System.out.println("Which pokemon would you like to heal?");
           System.out.println(t.getPokemonList());
           int pokemon_heal = CheckInput.getIntRange(1,t.getNumPokemon());
           t.usePotion(pokemon_heal-1);
        }

        else if (options == 3){
          if(t.hasPokeball() == true){
            boolean catch_result = t.catchPokemon(wild);
            System.out.println("Shake...Shake...Shake...");
            if (catch_result == true){
              System.out.println("You caught " + wild.getName());
              operation = false;
              break;
            }
            else{
              System.out.println("You failed to catch " + wild.getName());
            }
          }
          else{
            System.out.println("You do not have any poke balls!");
          }
        }
        else{
          int rand_direction = (int)(Math.random() * 4) + 1;
          if (rand_direction == 1){
            t.goNorth();
          }
          else if (rand_direction == 2){
            t.goSouth();
          }
          else if (rand_direction == 3){
            t.goEast();
          }
          else {
            t.goWest();
          }
          operation = false;
          break;
        }
        if (wild.getHp() <= 0){
          t.recieveMoney(5);
          System.out.println(wild.getName() + " has fainted!");
          operation = false;
          break;
        }
      }while(operation != false);
    }
    /**
     * A city where they can buy items or
     * heal their pokemon
     * @param t - will be the user entering
     */
    public static void Store(Trainer t){
      boolean in_city = true;
      while (in_city = true){
        System.out.println("You've entered the city.\nWhere would you like to go?");
        System.out.println("1. Store\n2. Pokemon Hospital");
        int city_choice = CheckInput.getIntRange(1,2);
        if (city_choice == 1){
          boolean store_operation = true;
          while (store_operation = true){
            System.out.println("Hello! What can I help you with?");
            System.out.println("1. Buy Potions - $5\n2. Buy Poke Balls - $3\n3. Exit");
            int store_choice = CheckInput.getIntRange(1,3);
            if (store_choice == 1){
              t.recievePotion();
              t.spendMoney(5);
              System.out.println("Here's your potion.");
            }
            else if(store_choice == 2){
              t.recievePokeball();
              t.spendMoney(3);
            }
            else{
              System.out.println("Thank you, come again soon!");
              store_operation = false;
              break;
              }
            }
          }
        else{
          System.out.println("Hello! Welcome to the\nPokemon Hospital.\nI'll fix your pokemon up in a jiffy!\nThere you go! See you\nagain soon.");
          t.healAllPokemon();
        }
        in_city = false;
        break;
      }
    }
  }
