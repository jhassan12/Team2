import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Ghost testGhost = frame.addGhost(new Location(2, 1), "test ghost", Color.PINK);
    testGhost.move();
    assert (testGhost.myLoc.x == 2 && testGhost.myLoc.y == 2);
    frame.startGame();
  }
}
