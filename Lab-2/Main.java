/* CECS 277 Sec 4
Lab #3
Kenneth Nguyen 027559894
Nicholas Chan 025821144
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Minesweeper Maker");

    System.out.print("Enter number of Rows (5-10): ");
    int rows = CheckInput.getIntRange(5,10);

    System.out.print("Enter number of Columns (5-10): ");
    int cols = CheckInput.getIntRange(5,10);
    
    System.out.print("Enter number of Mines (5-10): ");
    int mines = CheckInput.getIntRange(5,10);
    
    int [][] grid = new int [rows][cols];  
  
    placeMines(grid, mines);
    fillGrid(grid);
    displayGrid(grid);
  }

  /** Places the mines at a random point
    * @param grid a multidimensional array
    * @param mines mines to put on a point
    */
  public static void placeMines(int [][] grid, int mines) {
    Random rand = new Random();
    // loop to set mines
    for(int i = 0; i < mines; i++){
      // chooses a random row
      int row = rand.nextInt(grid.length);
      // chooses a random column
      int col = rand.nextInt(grid[0].length);
      // make sure there is no mine then set one if none
      if(grid[row][col] != 9){
      
        grid[row][col] = 9;
      
      } 
    }
  }
  
  /** Fills the grid with numbers based on number of mines surrounding them
    * @param grid a multidimensional array
    */
 public static void fillGrid(int [][] grid)  {
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        if(grid [i][j] == 9){
          continue;
        }
        
        int count = 0;
        //top value
        if(i - 1 >= 0){
          if (grid[i-1][j] == 9){
            count++;
          }
        }
        //right value
        if(j + 1 < grid[j].length){
          if (grid[i][j+1] == 9){
            count++;
          }
        }
        //bottom value
        if(i + 1 < grid.length){
          if (grid[i+1][j] == 9){
            count++;
          }
        }         
        //left value   
        if(j - 1 >= 0){
          if (grid[i][j-1] == 9){
            count++;
          }
        }
        //top left value
        if(i - 1 >= 0 && j-1 >= 0){
          if (grid[i-1][j-1] == 9){
            count++;
          }
        }
        //top right value
        if(i - 1 >= 0 && j+1 < grid[i].length){
          if (grid[i-1][j+1] == 9){
            count++;
          }
        }
        //bottom right value
        if(i + 1 < grid.length && j + 1 < grid[i].length){
          if (grid[i+1][j+1] == 9){
            count++;
          }
        }
        //bottom left value
        if(i + 1 < grid.length && j - 1 >= 0){
          if (grid[i+1][j-1] == 9){
            count++;
          }
        }

        grid[i][j] = count;  
       
      }  
    }
  }
    /** Displays the minsweeper map
    * @param grid a multidimensional array
    */
  public static void displayGrid(int[][] grid) {
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
      }
        System.out.println();
    }
  }
}