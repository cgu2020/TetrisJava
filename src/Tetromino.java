import java.awt.Color;
import java.awt.Graphics;

public abstract class Tetromino {
	public Tile[][] shape;
	private Color c;
	
	public Tetromino(int r, int c) {
		shape = new Tile[r][c];
	}

	public Color getColor(){
		return c;
	}

	public abstract void draw(Graphics g, int x, int y);
	
	public abstract Tile[][] getShape();
}