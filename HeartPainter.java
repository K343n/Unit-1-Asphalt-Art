import org.code.neighborhood.*;
/*
 * HeartPainter is an extension of PainterPlus
 inherets everything from PainterPlus
 uses it to create hearts
 */
public class HeartPainter extends PainterPlus {

  

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  /*
   * Turns the HeartPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the HeartPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the HeartPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
  moves HeartPainter back to it's original position.
  */
public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

/* Starting off at the left side of the heart
is going to move into desired position first
*/
  public void paintLeftSideHeart(String color){
// making painter move to desired starting position
    turnRight();
    move();
    move();
    turnLeft();
    move();

// begin painting lines to start the top leftside of the heart
// begin painting
    paintLine(color, 4);
    turnToWest();
    paintLine(color, 6);
    turnToEast();
    paintLine(color, 7);
    turnToWest();
    paintLine(color, 8);
    turnToEast();
    paintLine(color, 8);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(color, 8);
    turnToEast();
    paintLine(color,8);

// once finished with the left side of the heart
// reset position
    resetPosition();
    

  }
/* Starting off at the left side of the heart
going to desired position first
*/
  public void paintRightSideHeart(String color){
  // making painter move to desired spot
    turnRight();
    move();
    move();
    turnLeft();
    while (canMove("east")){
      move();
    }
    turnAround();
    move();
    move();
// making the painter start painting lines
    paintLine(color, 4);
    turnToEast();
    paintLine(color, 6);
    turnToWest();
    move();
    paintLine(color, 7);
    turnToEast();
    paintLine(color, 8);
    turnToWest();
    move();
    paintLine(color, 7);
    turnToEast();
    paintLine(color, 8);
    turnToWest();
    move();
    paintLine(color, 7);
  }

/*/ creating method to paint the bottom half of the heart
is going to move into desired position first in order to get
easy painting.
*/
public void paintBottomHeart(String color){
  // getting painter to desired starting place
  while (canMove("west")){
      move();
    }
  turnLeft();
  move();
  turnLeft();
  move();

// begin paiting
  paintLine(color, 13);
  turnToWest();
  move();
  move();
  paintLine(color, 11);
  turnToEast();
  move();
  move();
  paintLine(color, 9);
  turnToWest();
  move();
  move();
  paintLine(color, 7);
  turnToEast();
  move();
  move();
  paintLine(color, 5);
  turnToWest();
  move();
  move();
  paintLine(color, 3);
  turnToEast();
  move();
  move();
  paintLine(color,1);

// reset position
  resetPosition();
  
}
  }