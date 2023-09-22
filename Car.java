import objectdraw.*;
import java.awt.*;


public class Car extends ActiveObject{
  private VisibleImage carImage;
  private static final double CAR_HEIGHT = 100;
  private int x = 10;
  private int y = 10;

  public Car(Image i, Double speed, Double distance, DrawingCanvas c){
    carImage = new VisibleImage(i, new Location(x, y), c);
    speed = 5.0;
    distance = 500.0;
  }

  public void run(VisibleImage frogImage){
    while(carImage.overlaps(frogImage) == false){
      double timeSave = System.currentTimeMillis();
    }
    
  }

  
}