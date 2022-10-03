import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    // all possible attack ranges:
    Location loc1 = myLoc.shift(-1, 0);
    Location loc2 = myLoc.shift(0, -1);
    Location loc3 = myLoc.shift(0, 1);
    Location loc4 = myLoc.shift(1, 0);

    if (myMap.getLoc(loc1).contains(Map.Type.GHOST) 
        || myMap.getLoc(loc2).contains(Map.Type.GHOST)
        || myMap.getLoc(loc3).contains(Map.Type.GHOST)
        || myMap.getLoc(loc4).contains(Map.Type.GHOST)) {
          
      return true;  
    }

    return false;
  }

  public JComponent consume() {
	  if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
		  return myMap.eatCookie("pacman");
	  else
		  return null;
  }
}
