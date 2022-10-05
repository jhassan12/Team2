# Team 2 Project 3: PacMan

## Group Members
- Amal Verma
- Derek Noppinger
- Jake Perret
- Jessica Lee

## Image of Pacman Game
<INSERT IMAGE OF PACMAN WORKING>

## Running From Command Line

To run the game from the command line run from the project directory: 
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## Function and Test Descriptions
### Pacman Class

**get_valid_moves()** -> Allowed so that pacman could move up, down, left, or right one direction assuming the spot was not at the end of the frame or there was not a ghost or wall there.

In order to test this function, I created a frame and pacman object and ran the method to make sure the valid moveset was returned.

**move()** -> Utilizes the get_valid_moves() class to retrieve a list of the valid moves pacman can make. If there are no valid moves, return false.
Otherwise, move pacmans location to the first valid location in the list retrieved and return true.
  
To test this function, a new frame and pacman were created and I ran move() on the pacman. If pacman's new location was the first option returned from get_valid_moves() true was asserted.

**is_ghost_in_range()** -> Determines if ghost is within range of a ghost that is one unit away in left, right, up, down directions.

To test this function, frame, pacman, and ghost object were created. Ghost location was set to be one unit distance away from pacman's location and expected to return true.

**consume()** -> If pacman is in the same location as a cookie then eat the cookie

To test this function, the pacman is placed on a cookie. Pacman should successfully consume the first time, but fail to consume a second time at the same location (since the cookie will be gone after the first consume).

### Ghost Class

**get_valid_moves()** -> Allowed so that ghost could move up, down, left, or right one direction assuming the spot was not at the end of the frame or there was not a wall there.

In order to test this function, I created a frame and ghost object and ran the method to make sure the valid moveset was returned.

**move()** -> Utilizes the get_valid_moves() class to retrieve a list of the valid moves the ghost can make. If there are no valid moves, return false.
Otherwise, move the ghost location to the first valid location in the list retrieved and return true.

To test this function, a new frame and ghost were created and I ran move() on the ghost. If the ghost's new location was the first option returned from get_valid_moves() true was asserted.
  
**is_pacman_in_range()** -> Determines if pacman is within range of a ghost that is one unit away in left, right, up, down directions.

To test this function, frame, pacman, and 2 ghost objects were created. One of the ghost location was set to be one unit distance away from pacman's location and expected to return true. The other ghost was more than one unit away from pacman and is expected to return false.

**attack()** -> This method checks if Pacman is in attacking range with the is_pacman_in_range() function. If so then the map.attack() is called. Otherwise null is returned.

To test this function the game is initialized twice, once where the pacman is in range and the ghost should successfully attack. Another where Pacman is out of range and should fail to attack.

### Map Class

**move()** -> If the object exists on the field, it gets removed from the current location and then gets added to the new location.

In order to test this function, I used the method to move the Ghost object to (1,1) and it returned true.

**getLoc()** -> Returns a set of everything at the given location 

To test this function, I created a new frame and added pacman to the location (1,1). I then called getLoc() on that location and asserted true if the function returns a set that contains Map.Type.PACMAN.
  
**attack()** -> Determines if the specified ghost was able to attack pacman. If so, the gameover status would update and the method will return true.

To test this function, frame, pacman, and ghost objects were created. Ghost location was set to be one unit distance away from pacman's location and attack method is expected to return true.

**eatCookie()** -> If the pacman is in the same location as a cookie then the cookie is removed from locations and field, the number of cookies is updated and the cookie component is returned.

To test this function, the pacman is placed on a cookie. Pacman should successfully consume the first time, but fail to consume a second time at the same location (since the cookie will be gone after the first consume).
