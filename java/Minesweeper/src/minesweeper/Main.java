package minesweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_RESET = "\u001B[0m";
		final String FLAG = ANSI_RED + "⚑" + ANSI_RESET;
		
		Scanner s = new Scanner(System.in);
		boolean appRunning = true;
		
		while (appRunning) {
			System.out.println("Enter number of columns (width):");
			Integer width = s.nextInt();
			System.out.println("Enter number of rows (height):");
			Integer height = s.nextInt();
			System.out.println("Enter number of mines:");
			Integer mines = s.nextInt();
		
			CoordinateField game = new CoordinateField( width, height, mines );
			
			game.DisplayUserField();
	
			boolean playing = true;
			while(playing) {
				System.out.println("Enter action 'R' to reveal, 'F' to flag:");
				String action = s.next().toLowerCase();
				
				if (!action.equals("r") && !action.equals("f")) {
					System.out.println("Please enter a valid action");
					continue;
				}
				
				System.out.println("Enter horizontal coordinate:");
				Integer xcoord = s.nextInt() -1;
				System.out.println("Enter vertical coordinate:");
				Integer ycoord = s.nextInt() -1;
				
				if (action.equals("r")) {
					game.RevealTile(ycoord, xcoord);
					if (game.userPlayingField[ycoord][xcoord].equals("*")) {
						playing = false;
						System.out.println("You lose! Play again? [Y/N]");
					}
				}
				
				if (action.equals("f")) {
					if (game.userPlayingField[ycoord][xcoord].equals("□")) {
						game.userPlayingField[ycoord][xcoord] = FLAG;
					} else if (game.userPlayingField[ycoord][xcoord].equals(FLAG)) {
						game.userPlayingField[ycoord][xcoord] = "□";
					} else {
						continue;
					}
				}

				game.DisplayUserField();
				
				if ((game.xsize*game.ysize - game.numOfMines)==(game.CountRevealed(game.userPlayingField))) {
					playing = false;
					System.out.println("You WON! Play again? [Y/N]");
				}
			}
			String keepPlaying = s.next().toLowerCase();
			if (keepPlaying.equals("y")) {
				continue;
			} else {
				appRunning = false;
				System.out.println("Thanks for playing! Goodbye");
			}
			}
		s.close();
		}
	}

