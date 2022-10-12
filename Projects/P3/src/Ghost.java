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
    ArrayList<Location> moveSet = new ArrayList<>();
    if (!myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.WALL)
          && myLoc.y + 1 < myMap.getDim()) {
      moveSet.add(new Location(myLoc.x, myLoc.y + 1));
    }
    if (!myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.WALL)
          && myLoc.x + 1 < myMap.getDim()) {
      moveSet.add(new Location(myLoc.x + 1, myLoc.y));
    }
    if (!myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.WALL)
          && myLoc.x - 1 > 0) {
      moveSet.add(new Location(myLoc.x - 1, myLoc.y));
    }
    if (!myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.WALL)
          && myLoc.y - 1 > 0) {
      moveSet.add(new Location(myLoc.x, myLoc.y - 1));
    }

    return moveSet;
  }

  public boolean move() {
    ArrayList<Location> possibleMoves = get_valid_moves();
    if (possibleMoves != null) {
      myLoc = myLoc.shift(possibleMoves.get(0).x - myLoc.y, possibleMoves.get(0).y - myLoc.x );
      myMap.move(myName, myLoc, Map.Type.GHOST);
      return true;
    }
    return false;
  }

  /*This method checks its surroundings to see if any Ghosts are in attack 
  * range. The attack radius of a ghost is 1 which means that a ghost at 
  * location (x, y) can attack PacMan as long as PacMan is located at 
  * (x+-1, y+-1). If any Ghosts are in the attack range, this method returns 
  * true otherwise
  * it returns false.
  */
  public boolean is_pacman_in_range() {
    // all possible attack ranges:
    Location loc1 = myLoc.shift(-1, 0);
    Location loc2 = myLoc.shift(0, -1);
    Location loc3 = myLoc.shift(0, 1);
    Location loc4 = myLoc.shift(1, 0);

    if (myMap.getLoc(loc1).contains(Map.Type.PACMAN)
        || myMap.getLoc(loc2).contains(Map.Type.PACMAN)
        || myMap.getLoc(loc3).contains(Map.Type.PACMAN)
        || myMap.getLoc(loc4).contains(Map.Type.PACMAN)) {
          
      return true;  
    }
    
    return false;
  }

  public boolean attack() {
    if (is_pacman_in_range())
      return myMap.attack(myName);
    else return false;
  }
}
