public class Rectangle{
  //Declaring instance variables
  private int x;
  private int y;
  private int width;
  private int height;

  public Rectangle(int w, int h){
    width = w;
    height = h;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public int getWidth(){
    return width;
  }

  public int getHeight(){
    return height;
  }

  public void translate(int dx, int dy){
    x += dx;
    y +=dy;
  }

}