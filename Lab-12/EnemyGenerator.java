import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EnemyGenerator {
  
  private ArrayList<Enemy> enemyList;

  /**
	 * Gets the enemy from the txt file
	 */
  public EnemyGenerator() {
    enemyList = new ArrayList<>();
    try {
      Scanner reader = new Scanner(new File("enemyList.txt"));
        
        while(reader.hasNextLine()){
          String line = reader.nextLine();
          String[] data = line.split(",");
          enemyList.add(new Enemy(data[0], Integer.parseInt(data[1].trim())));
        }
        reader.close(); // close the file
          
       } catch (FileNotFoundException e) {
           System.out.println("File: enemyList.txt not found. Exiting the program");
           System.exit(0);
       }
   }
  
  /**
	 * Gets a random enemy from the file
   * @return the enemy
	 */
  public Enemy generateEnemy() {
    int index = (int)(Math.random()*enemyList.size());
    return enemyList.get(index).clone();
   }
}