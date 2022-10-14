import java.awt.*;
import java.io.*;

import junit.framework.*;

public class TestConsume extends TestCase {
	
	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		assertTrue(pacman.consume() != null);
		assertTrue(pacman.consume() == null);
		frame.startGame();
		
	}
}
