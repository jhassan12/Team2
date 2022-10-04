import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    ArrayList<Location> possibleMoves = get_valid_moves();
    if (possibleMoves != null) {
      myLoc.shift(possibleMoves.get(0).x - myLoc.x, possibleMoves.get(0).y - myLoc.y );
      return true;
    }
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
