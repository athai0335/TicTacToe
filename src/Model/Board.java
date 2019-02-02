package Model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {
	Tile [][] board;
	int numRows = 3;
	int numColumns = 3;
	
	public Board() {
		board = new Tile[numRows][numColumns];
	}
	
	// Initialize every space on the board with a Tile
	public void populateEmptyBoard() {
		for(int i = 0; i <numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				this.board[i][j] = new Tile();
			}
		}
	}
	
	public Tile getTile(int row, int col) {
		return this.board[row][col];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
