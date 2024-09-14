import org.code.neighborhood.*;
// extending the painter class
public class PainterPlus extends Painter {
/* creates method to turn right
useful so we can call turn right
rather than turning left a bunch of times.
*/
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
  /*/ take all the paint while I am on the bucket
  */
  public void takeAllPaint() {
  while (isOnBucket()){
    takePaint();
  }
  
}
/* While I can move
move fast. Stops repetitive code.
*/
  public void moveFast(){
    while (canMove())
      move();
  }
  /* While I have paint,
  paint until there isn't any left.
*/
  public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
      move();
    }
  }
  /* Allows painter to paint a donut.
  removes excess code, as well as allowing
  it to run continously while the painter has paint.
*/
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      
      
      
      
    }
  }
}