import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost1 = frame.addGhost(new Location(1, 2), "g1", Color.red);
    Ghost ghost2 = frame.addGhost(new Location(4, 2), "g2", Color.cyan);
		assert ghost1.is_pacman_in_range() == true;
		assert ghost2.is_pacman_in_range() == false;
		frame.startGame();
  }
}
