package minesweeper;
import java.util.Arrays;
import java.util.Random;

public class CoordinateField {
	final String ANSI_YELLOW = "\u001B[33m";
	final String ANSI_RED = "\u001B[31m";
	final String ANSI_RESET = "\u001B[0m";
	Integer xsize;
	Integer ysize;
	Integer numOfMines;
	String[][] userPlayingField;
	String[][] realPlayingField;
	
	Random rand = new Random();
	
	final int[][] checkVectors = {
		{ 1, 1  }, 
		{ 1, 0  }, 
		{ 1, -1 }, 
		{ 0, 1  }, 
		{ 0, -1 }, 
		{ -1, 1 }, 
		{ -1, 0 }, 
		{ -1, -1 }
	};
	
	public CoordinateField(Integer xsize, Integer ysize, Integer numOfMines) {
		this.xsize = xsize;
		this.ysize = ysize;
		this.numOfMines = numOfMines;	
		this.userPlayingField = new String[ysize][xsize];
		this.realPlayingField = new String[ysize][xsize];
		ConstructField();
		PlaceMinesAndGenerate();
	}
	
	public void ConstructField(){
		for (int i = 0; i < ysize; ++i) {
			Arrays.fill(userPlayingField[i], "□");
		}
	}
	
	public void GenerateNumbers(){
		for (int i = 0; i < ysize; ++i) {
			for (int j = 0; j < xsize; ++j) {
				if (realPlayingField[i][j].equals("*")) {
					continue;
				} else {
					int countMines = 0;
					for (int k = 0; k < 8; ++k) {
						try {
							int xOffset = checkVectors[k][0];
							int yOffset = checkVectors[k][1];
							if (realPlayingField[i+yOffset][j+xOffset].equals("*")) {
								countMines += 1;
							}
						}
						catch(Exception e) {}
					}
					realPlayingField[i][j] = String.format("%s%s%s", ANSI_YELLOW, countMines, ANSI_RESET);
				}
			}
		}
	}
	
	public void CascadeZeroes(int xcor, int ycor) {
		for (int i = 0; i < 8; ++i) {
			try {
				int xOffset = checkVectors[i][0];
				int yOffset = checkVectors[i][1];
				int newXcor = xcor + xOffset;
				int newYcor = ycor + yOffset;
				RevealTile(newYcor, newXcor);
			}catch(Exception e) {} 
		}
	}
	
	public void RevealTile(int ycor, int xcor) {
		if (userPlayingField[ycor][xcor].equals("□")) {
			userPlayingField[ycor][xcor] = realPlayingField[ycor][xcor];
			if (userPlayingField[ycor][xcor].equals(ANSI_YELLOW+"0"+ANSI_RESET)) {
				CascadeZeroes(xcor, ycor);
			}
		}
	}
	
	public void PlaceMinesAndGenerate() {
		for (int i = 0; i < ysize; ++i) {
			Arrays.fill(realPlayingField[i], "0");
		}
		int count = 0;
		while (count < numOfMines) {
			int randXcoord = rand.nextInt(xsize);
			int randYcoord = rand.nextInt(ysize);
			if (realPlayingField[randYcoord][randXcoord].equals("0")) {
				realPlayingField[randYcoord][randXcoord] = "*";
				++count;
			} else {
				continue;
			}
		}
		GenerateNumbers();
	}

	
	public int CountRevealed(String[][] field) {
		int countRevealed = 0;
		
		for (int i = 0; i < ysize; ++i) {
			for (int j = 0; j < xsize; ++j) {
				if (!field[i][j].equals(ANSI_RED+"⚑"+ANSI_RESET) && field[i][j] != "□") {
					countRevealed += 1;
				} else {continue;}
			}
	}
		return countRevealed;
	}
	
	public void DisplayUserField() {
		System.out.print("  ");
		for (int j = 0; j < userPlayingField[0].length; ++j) {
			
			if (j<10) {
				System.out.print("  " + (j+1));
			}
			if (j>=10) {
				System.out.print(" " + (j+1));;
			}
		}
		System.out.print("\n");
		for (int i = 0; i < userPlayingField.length; ++i) {
			if (i<9) {
			System.out.println(i+1 +"  "+ Arrays.toString(userPlayingField[i]).replace(", ", "]["));
			}
			if (i>=9) {
				System.out.println(i+1 +" "+ Arrays.toString(userPlayingField[i]).replace(", ", "]["));
			}
		};
	};
};

