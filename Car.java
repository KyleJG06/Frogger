import objectdraw.*;
import java.awt.*;


public class Car{
  private VisibleImage carImage;
  private static final double CAR_HEIGHT = 100;
  private int x = 10;
  private int y = 10;

  public Car(Image i, DrawingCanvas c){
    carImage = new VisibleImage(i, new Location(x, y), c);
  }


  public void move(){
    x++;
  }

  
}