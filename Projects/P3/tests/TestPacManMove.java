import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    pacman.move();
    assert (pacman.myLoc.x == 1 && pacman.myLoc.y == 2);
    frame.startGame();
  }
}
