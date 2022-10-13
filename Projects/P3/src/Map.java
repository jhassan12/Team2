import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public int getDim() {
    return dim;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    Location oldLoc = locations.get(name);
    locations.remove(name);
    locations.put(name, loc);
    field.get(oldLoc).remove(name);
    field.get(loc).add(type);
    components.get(name).setLocation(loc.x, loc.y);
    return false;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method
    if(field.get(loc) != null) {
      return field.get(loc);
    }
    return emptySet;
  }

  public boolean attack(String Name) {
    Location ghostLoc = locations.get(Name);
  
    // all possible attack ranges:
    Location loc1 = ghostLoc.shift(-1, 0);
    Location loc2 = ghostLoc.shift(0, -1);
    Location loc3 = ghostLoc.shift(0, 1);
    Location loc4 = ghostLoc.shift(1, 0);
  
    if (getLoc(loc1).contains(Map.Type.PACMAN)
        || getLoc(loc2).contains(Map.Type.PACMAN)
        || getLoc(loc3).contains(Map.Type.PACMAN)
        || getLoc(loc4).contains(Map.Type.PACMAN)) {
      // update gameOver
      gameOver = true;    
      return true;  
    }

    return false;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    Location pacmanLoc = locations.get(name);
    if (field.get(pacmanLoc).contains(Type.COOKIE)) {
      String cookieID = "tok_x"+pacmanLoc.x+"_y"+pacmanLoc.y;
      locations.remove(cookieID);
      field.get(pacmanLoc).remove(Type.COOKIE);
      cookies++;
      return components.remove(cookieID);
    } else return null;
  }
}
