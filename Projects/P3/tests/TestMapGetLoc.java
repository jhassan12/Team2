import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    frame.addPacMan(new Location(1, 1));
    assertTrue(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.PACMAN));
    frame.startGame();
  }
}
