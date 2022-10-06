import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    assertTrue(frame.getMap().eatCookie("pacman") != null);
    assertTrue(frame.getMap().eatCookie("pacman") == null);
    frame.startGame();
  }
}
