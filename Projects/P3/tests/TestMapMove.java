import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(2, 1), "ghost", Color.PINK);
    assert frame.getMap().move("ghost", new Location(1, 1), Map.Type.GHOST) == true;
    frame.startGame();
  }
}
