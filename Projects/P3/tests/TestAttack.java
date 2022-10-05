import java.awt.*;
import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    
    Ghost ghost = frame.addGhost(new Location(1, 1), "Tyler", Color.red);
    PacMan pacman = frame.addPacMan(new Location(1, 2));
    assert ghost.attack();
    frame.startGame();
  
    frame = new NoFrame();
    ghost = frame.addGhost(new Location(5, 5), "John", Color.red);
    pacman = frame.addPacMan(new Location(1, 2));
    assert !ghost.attack();
    frame.startGame();
  }
}
