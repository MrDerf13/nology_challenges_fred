# CLI Minesweeper

## MVP

Recreate a simplified version of the game Minesweeper to be played in the java console - DONE
The game should be able to randomly generate 10 mines in a 10x10 grid - DONE
The user will be able to enter a command that represents a coordinate to check a location for a mine - DONE
The application will display a number from 0-8 depending on how many mines surround that location - DONE
If the user selects a mine, the game will respond "boom!" and the game will be lost - DONE
If every non-mine square has been revealed, the game is won - DONE
Render the grid to the console after every user command - DONE

## Bonuses (optional)

Allow for the user to configure number of mines and grid size via a configuration.json file - Changed to User can configure no. of mines and grid size via inputs to Constructor
(Difficult) Discovering an empty square should reveal all squares around it, and cascade into other nearby empty squares - DONE

## Approach

```java
String[][]
```

2 String array arrays are created, one displayed to the user, the other that holds the location of the mines and numbered fields. Inputs are required to basically check the given index of the hidden 2D array and then rendered to the user facing array based on checks of the string values.

## Known Issues

Lack of robustness, errors can occur if numbers outside of given array range are entered.
Not input validation on play again input.

## Future Goals

Input validation to remove input errors.
