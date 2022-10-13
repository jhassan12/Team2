import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    assertTrue(frame.getMap().move("ghost", new Location(1, 1), Map.Type.GHOST) == true);
    frame.startGame();
  }
}
