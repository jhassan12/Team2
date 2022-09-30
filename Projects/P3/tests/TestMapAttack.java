import junit.framework.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost1 = frame.addGhost(new Location(1, 2), "g1", Color.red);
    assert frame.getMap().attack("g1") == true;
    frame.startGame();
  }
}
