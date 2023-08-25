import objectdraw.*;
import java.awt.*;
public class Frog{
  private VisibleImage frogImage;
  private static final double FROG_HEIGHT = 48;


  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(10, 10), c);
  }

  public boolean overlaps(VisibleImage vehicleImage){
    return false; //you need to change this
  }
}