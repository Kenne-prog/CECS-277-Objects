/* CECS 227 Sec 4
 * Lab #9
 * Kenneth Nguyen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    LinkedList<String> list = readFile();
    printList(list);
  }
  /**
	 * Prints the list of words
	 * @param list is the Linked list of strings.
	 */
  public static void printList(LinkedList<String> list) {
    ListIterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  /**
	 * Moves the iterator depending on the next word on 
   * the list
	 * @param iterator of the list
   * @param word is a string which is a word on the list
	 */
  public static void moveIter(ListIterator<String> iterator, String word) {
    while (iterator.hasNext()) {
      String after = iterator.next();
      if (after.compareToIgnoreCase(word) > 0) {
        iterator.previous();
        break;
      }
    }
  }
  /**
	 * Reads the file in the right order
	 * @throws FileNotFoundException
   * @returns the list in the right order
	 */
  public static LinkedList<String> readFile() throws FileNotFoundException {
    LinkedList<String> list = new LinkedList<>();
    Scanner scan = new Scanner(new File("words.txt"));
    while (scan.hasNext()) {
      String word = scan.nextLine();
      ListIterator<String> iterator = list.listIterator();
      moveIter(iterator, word);
      iterator.add(word);
    }
    return list;
  }
}