/* CECS 227 Sec 4
 * Lab #10
 * Kenneth Nguyen
 */
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    int choice = menu();
    TreeMap<String, Integer> words = readFile();
    while (choice != 3) {
      if (choice == 1){
        search(words);
        choice = menu();
      }
      else{
        display(words);
        choice = menu();
      }
    }
  }
  /**
	 * Reads the file in the right order
   * @returns the treemap
	 */
  public static TreeMap<String, Integer> readFile() {
    TreeMap<String, Integer> words = new TreeMap<String, Integer>();
    try {
      Scanner read = new Scanner(new File("words.txt"));
      while (read.hasNext()) {
        String singleWord = read.nextLine();
        if (words.containsKey(singleWord)) {
            words.put(singleWord, (words.get(singleWord) + 1));
        }
        else {
          words.put(singleWord, 1);
        }
      }
    } catch (FileNotFoundException fnf) {
        System.out.println("File not Found");
      }
    return words;
  }

  /**
	 * searches for the word
   * @param Treemap is the treemap of words
	 */
  public static void search(TreeMap<String, Integer> words) {
    System.out.print("Enter Word: ");
    String findword = CheckInput.getString();
    if (words.containsKey(findword)) {
      System.out.println(findword + " => " + words.get(findword));
    }
    else {
      System.out.println(findword + " => 0");
    }
  }
  /**
	 * displays the word and how many there are
   * @param Treemap is the treemap of words
	 */
  public static void display(TreeMap<String, Integer> words) {
    Set<String> setOfKey = words.keySet();
    for (String key : setOfKey) {
      System.out.println(key + " => " + words.get(key));
    }
  }
  /**
	 * menu of the choices
   * @returns the choice of the user
	 */
  public static int menu() {
  System.out.println("1. Search\n2. Display\n3. Quit");
  return (CheckInput.getIntRange(1, 3));
  }
}