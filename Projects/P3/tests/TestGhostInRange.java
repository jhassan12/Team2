import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost1 = frame.addGhost(new Location(1, 2), "g1", Color.red);
		assertTrue(pacman.is_ghost_in_range());
		frame.startGame(); 
  }
}
