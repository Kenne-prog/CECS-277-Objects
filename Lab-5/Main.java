class Main {
  public static void main(String[] args) {
    char[][] board = new char [20][20];
    for(int i = 0 ; i < board.length; i++){
      for (int j = 0; j< board[i].length;j++){
        board[i][j] = '.';
      }
    }
    
    System.out.println("Enter the width of the Rectangle (1-5)");
    int width = CheckInput.getIntRange(1, 5); 
    System.out.println("Enter the height of the Rectangle (1-5)");
    int height = CheckInput.getIntRange(1,5);

    Rectangle rect = new Rectangle(width,height); 
    placeRect(board,rect);
    displayGrid(board);

    while(true) { 
      int choice = menu();
      resetGrid(board);
      if(choice == 1){
        rect.translate(-1,0);
      }
      else if(choice == 2){
        rect.translate(1,0);
      }
      else if(choice == 3){
        rect.translate(0,-1);
      }
      else if(choice == 4){
        rect.translate(0,1);
      }
      else{
        break;
      }
      try {
          placeRect(board,rect);
        } catch (ArrayIndexOutOfBoundsException e){
          // catches the error and resets the x value before translation 
          //I am not sure if there is another way that is more effecient
          System.out.println("You cannot go that way.");
          resetGrid(board);
          if(choice == 1){
            rect.translate(1,0);
          }
          else if(choice == 2){
            rect.translate(-1,0);
          }
          else if(choice == 3){
            rect.translate(0,1);
          }
          else if(choice == 4){
           rect.translate(0,-1);
          }
          continue;
        }
      displayGrid(board);
    }
  }

  public static void displayGrid(char [][]board){
    for(int i = 0 ; i < board.length; i++){
      for (int j = 0; j< board[i].length;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void placeRect(char [][] board, Rectangle rec){
    for(int i = 0; i< rec.getHeight();i++){
      for (int j =0;j<rec.getWidth();j++){ 
          board[rec.getX()+i][rec.getY()+j] = '*';
      }  
    }
  }

  public static void resetGrid(char [][] board){
    for(int i = 0 ; i < board.length; i++){
      for (int j = 0; j< board[i].length;j++){
        board[i][j] = '.';
      }
    }
  } 

  public static int menu(){
    System.out.println("Enter a direction:\n1. Up\n2. Down\n3. Left\n4. Right\n5. Quit the Game");

    int input = CheckInput.getIntRange(1,5);
    return input;
  }
}