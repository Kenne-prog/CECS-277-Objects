/* CECS 227 Sec 4
 * Lab #4
 * Kenneth Nguyen
 * your name
 */
import java.io.*;
import java.text.*;
import java.util.*;
import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    // Array list storing states
    ArrayList<String> state = new ArrayList<String>();
    // Array list storing population
    ArrayList<Integer> population = new ArrayList<Integer>(); 
    
    readFile(state,population);
    //Loop to choose whichever method
    while(true) { 
      int n = menu();

      if(n == 1){
        sortStates(state,population);
        displayStates(state,population);
      }
      else if(n == 2){
        sortPopulation(state,population);
        displayStates(state,population);
      }
      else if(n == 3){
        totalSum(state,population);
      }
      else if(n == 4){
        populationGreater(state,population);
      }
      else if(n == 5){
        break;
      }

    }
  }
  
  public static void readFile(ArrayList<String> state,ArrayList<Integer> population){
    
    try {
      
      Scanner read = new Scanner(new File( "StatePops.txt"));
    
      while(read.hasNextLine()) {
        
        String [] tokens = read.nextLine().split(",");
    
        String states = "";
        
        for(int i=0;i<tokens.length-1;i++) {
        
          states += tokens[i] + "";
        
        }  
        state.add(states.trim());
        
        population.add(Integer.parseInt(tokens[tokens.length-1])); 
      }
      read.close();
    } catch (FileNotFoundException e) {
       
        System.out.println("FNF");   
    }
  }
  //case 1
  public static void sortStates(ArrayList<String> state,ArrayList<Integer> population){
    boolean swapped = true;
    do {
          swapped = false;
          for(int i = 0; i < state.size() - 1; i++) {
            if( state.get(i).compareTo(state.get(i + 1)) > 0) {
              
              String swap = state.get(i);
              state.set(i, state.get(i + 1));
              state.set(i + 1, swap);
              
              Integer swp = population.get(i);
              population.set(i, population.get(i + 1));
              population.set(i + 1, swp);

              swapped = true;
            }
          }
    } while(swapped);
  }
  
  public static void sortPopulation(ArrayList<String> state,ArrayList<Integer> population){
    boolean swapped = false;
    do {
          swapped = false;
          for( int i = 0; i < state.size() - 1; i++ ) {
            if(population.get(i) > (population.get(i + 1))) {
             
              String swap = state.get(i);
              state.set(i, state.get(i + 1));
              state.set(i + 1, swap);
              
              Integer swp = population.get(i);
              population.set(i, population.get(i + 1));
              population.set(i + 1, swp);

              swapped = true;
            }
          }
      } while(swapped);
    }

  public static void displayStates(ArrayList<String> state,ArrayList<Integer> population){
    
    DecimalFormat df = new DecimalFormat("#,###");
    
    for(int i=0;i<state.size();i++) { 
      
    System.out.println(state.get(i)+" "+df.format(population.get(i)));
    }
  }
  
  public static void totalSum(ArrayList<String> state,ArrayList<Integer> population){

  }
  
  public static void populationGreater(ArrayList<String> state,ArrayList<Integer> population){

  }

  public static int menu() {
    while(true) {  
      System.out.println("State Stats");
      System.out.println("1. Display Sorted States");
      System.out.println("2. Display Sorted Population");
      System.out.println("3. Display Total US Population");
      System.out.println("4. Display States with Population Greater Than");
      System.out.println("5. Quit");
      
      int input = CheckInput.getIntRange(1,5);
      
      return input;
      
    }
  }              
}

  
