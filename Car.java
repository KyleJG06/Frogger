import objectdraw.*;
import java.awt.*;


public class Car extends ActiveObject{
  private VisibleImage carImage;
  private static final double CAR_HEIGHT = 100;
  private double timeSave, speed;
boolean alive = true;
  private Frog jeff;
  

  public Car(Image i, int x, int y, Double speed, DrawingCanvas c, Frog jeff){
    carImage = new VisibleImage(i, new Location(x, y), c);
    this.speed = speed;
this.jeff = jeff;
    this.start();
  }

  public void run(){
    while(carImage.getX() < 500 && carImage.getX() > -200 && alive == true){
      timeSave = System.currentTimeMillis();
      pause(30);
      double actuTime = System.currentTimeMillis() - timeSave;
      double dist = speed * actuTime;
      carImage.move(dist, 0);
      if(jeff.overlaps(carImage))
      {
        alive = false;
      }

      
    }
    
    alive = false;
  }

  public VisibleImage getCar(){
    return carImage;
  }
}