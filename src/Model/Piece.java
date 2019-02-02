package Model;

public class Piece {
	
	int x; // row coordinate of piece
	int y; // column coordinate of piece
	String type = "";
	
	public Piece() {
		x = 0;
		y = 0;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getRow() {
		return x;
	}
	
	public int getColumn() {
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
