import objectdraw.*;
import java.awt.*;


public class Frog{
  private VisibleImage frogImage;
  private static final double FROG_HEIGHT = 48;



  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(20, 20), c);
  }

  public boolean overlaps(VisibleImage vehicleImage){
    return frogImage.overlaps(vehicleImage);

    
  }
  
  public void hop(String direction){
      if(direction.equals("l"))
      {
        frogImage.move(-50, 0);
      }
    else if(direction.equals("u"))
      {
        frogImage.move(0, -50);
      }
    else if(direction.equals("b"))
      {
        frogImage.move(0, 50);
      }
    else if(direction.equals("r"))
      {
        frogImage.move(50, 0);
      }
    }
  
}