import objectdraw.*;
import java.awt.*;


public class Frog{
  private VisibleImage frogImage;
  private static final double FROG_HEIGHT = 48;
  private int lives = 3;
  private int score = 0;



  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(100, 100), c);
  }

  public boolean overlaps(VisibleImage vehicleImage){
    if(frogImage.overlaps(vehicleImage)){
      kill();
      return true;
    }
    else{
      return false;
    }
    

    
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


  public void kill(){
    
      //kill
      frogImage.hide();
      System.out.println("OUCH");
    
  }
  public void reincarnate(){
    frogImage.moveTo(20,20);
    frogImage.show();
    
  }
  public boolean isAlive(){
    if(frogImage.isHidden() == false){
      return true;
    }
    return false;
  }
  
  public VisibleImage getFrog(){
    return frogImage;
  }
}