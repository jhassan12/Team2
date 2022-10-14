import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    pacman.move();
    assertTrue(pacman.myLoc.x == 1 && pacman.myLoc.y == 2);
    frame.startGame();
  }
}
