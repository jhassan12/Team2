import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    assert frame.getMap().eatCookie("pacman") != null;
    assert frame.getMap().eatCookie("pacman") == null;
    frame.startGame();
  }
}
