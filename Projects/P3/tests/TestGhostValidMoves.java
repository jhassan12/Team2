import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(2, 1), "ghost", Color.PINK);
    ArrayList<Location> expected = new ArrayList<>();
    expected.add(new Location(3, 1));
    expected.add(new Location(1, 1));
		assertTrue(ghost.get_valid_moves().size() == expected.size());
    assertTrue(ghost.get_valid_moves().get(0).equals(expected.get(0)));
    assertTrue(ghost.get_valid_moves().get(1).equals(expected.get(1)));
		frame.startGame();
  }
}
