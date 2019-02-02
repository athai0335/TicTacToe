package Model;

public class Tile {
	
	int x; // row coordinate
	int y; // column coordinate
	boolean isOccupied;
	Piece piece;
	
	public Tile() {
		x = 0;
		y = 0;
		isOccupied = false;
		piece = null;
	}
	
	public int getRow() {
		return x;
	}
	
	public int getColumn() {
		return y;
	}
	
	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public boolean isOccupied() {
		return this.isOccupied;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
