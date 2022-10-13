import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
    ArrayList<Location> expected = new ArrayList<>();
    expected.add(new Location(1, 2));
    expected.add(new Location(2, 1));
		assertTrue(pacman.get_valid_moves().size() == expected.size());
    assertTrue(pacman.get_valid_moves().get(0).equals(expected.get(0)));
    assertTrue(pacman.get_valid_moves().get(1).equals(expected.get(1)));
		frame.startGame();
  }
}
