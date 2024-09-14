import org.code.neighborhood.*;


public class Background extends HeartPainter {
/*
   * Paints every other row of the neighborhood.
   allows for future design.
   */
  public void paintBackgroundLine(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        moveFast();
        turnToEast();
      }
    }

    turnAround();
    resetPosition();
  }
/* Making the method to paint the unfilled lines a different color
allows for easy painting.
*/
  public void paintBackgroundStripe(String color, int size) {
    while (canMove("south")) {
      moveFast();
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    resetPosition();
  }
}

