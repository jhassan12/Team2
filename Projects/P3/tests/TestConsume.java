import java.awt.*;
import java.io.*;

import junit.framework.*;

public class TestConsume extends TestCase {
	
	public void testConsume() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		assert pacman.consume() != null;
		assert pacman.consume() == null;
		frame.startGame();
		
	}
}
