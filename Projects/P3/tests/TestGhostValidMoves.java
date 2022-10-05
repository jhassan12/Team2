import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(2, 1), "ghost", Color.PINK);
    ArrayList<Location> expected = new ArrayList<>();
    expected.add(new Location(3, 1));
    expected.add(new Location(2, 2));
    expected.add(new Location(1, 1));
		assert ghost.get_valid_moves() == expected;
		frame.startGame();
  }
}
