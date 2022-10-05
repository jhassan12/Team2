# Team 2 Project 3: PacMan
## Group Members
- Amal Verma
- Derek Noppinger
- Jake Perret
- Jessica Lee
## Image of Pacman Game
<INSERT IMAGE OF PACMAN WORKING>

## Running From Command Line
To run ```insert command here```

## Function and Test Descriptions
### Pacman Class

**get_valid_moves()** -> Allowed so that pacman could move up, down, left, or right one direction assuming the spot was not at the end of the frame or there was not a ghost or wall there.

In order to test this function, I created a frame and pacman object and ran the method to make sure the valid moveset was returned.

**is_ghost_in_range()** -> Determines if ghost is within range of a ghost that is one unit away in left, right, up, down directions.

To test this function, frame, pacman, and ghost object were created. Ghost location was set to be one unit distance away from pacman's location and expected to return true.

### Ghost Class

**get_valid_moves()** -> Allowed so that ghost could move up, down, left, or right one direction assuming the spot was not at the end of the frame or there was not a wall there.

In order to test this function, I created a frame and ghost object and ran the method to make sure the valid moveset was returned.

**is_pacman_in_range()** -> Determines if pacman is within range of a ghost that is one unit away in left, right, up, down directions.

To test this function, frame, pacman, and 2 ghost objects were created. One of the ghost location was set to be one unit distance away from pacman's location and expected to return true. The other ghost was more than one unit away from pacman and is expected to return false.

### Map Class

**move()** -> If the object exists on the field, it gets removed from the current location and then gets added to the new location.

In order to test this function, I used the method to move the Ghost object to (1,1) and it returned true.

**attack()** -> Determines if the specified ghost was able to attack pacman. If so, the gameover status would update and the method will return true.

To test this function, frame, pacman, and ghost objects were created. Ghost location was set to be one unit distance away from pacman's location and attack method is expected to return true.
