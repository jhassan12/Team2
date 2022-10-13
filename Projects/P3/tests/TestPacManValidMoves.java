import java.io.*;
import java.util.ArrayList;

import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
    ArrayList<Location> expected = new ArrayList<>();
    expected.add(new Location(2, 1));
    expected.add(new Location(1, 2));
		assertTrue(pacman.get_valid_moves() == expected);
		frame.startGame();
  }
}
