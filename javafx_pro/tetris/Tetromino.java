package tetris;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static tetris.TetrisApp.TILE_SIZE;

/*The Tetromino class uses the Piece class to
 * form the entire shape. This class also includes
 * methods used to describe their movement in the game.
 */
public class Tetromino {

	//These are the values that belong to tetromino class.
    public int x, y;

    public Color color;

    //Included in List for performance with rowSweep()
    public List<Piece> pieces;

    //Constructor for Tetromino which consist of its color and pieces
    public Tetromino(Color color, Piece... pieces) {
        this.color = color;
        this.pieces = new ArrayList<>(Arrays.asList(pieces));

        for (Piece piece : this.pieces)
            piece.setParent(this);
    }

    // moves the tetramino on plane. Accepts Direction +x,y coordinate
    public void move(int dx, int dy) {
        x += dx;
        y += dy;

        pieces.forEach(p -> {
            p.x += dx;
            p.y += dy;
        });
    }
    // overloaded method which just accepts Direction 
    public void move(Direction direction) {
        move(direction.x, direction.y);
    }
    
    //Fills each piece of tetromino with color
    public void draw(GraphicsContext g) {
        g.setFill(color);

        pieces.forEach(p -> g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE));
    }
    //This is the actual function that rotates entire tetromino
    public void rotateBack() {
        pieces.forEach(p -> p.setDirection(p.directions.stream().map(Direction::prev).collect(Collectors.toList()).toArray(new Direction[0])));
    }
  //This is the actual function that rotates entire tetromino
    public void rotate() {
        pieces.forEach(p -> p.setDirection(p.directions.stream().map(Direction::next).collect(Collectors.toList()).toArray(new Direction[0])));
    }

    //detach method needed for performing rowsweep() and it requires the x&y coordinate of piece
    public void detach(int x, int y) {
        pieces.removeIf(p -> p.x == x && p.y == y);
    }
    //another copy function to produce more easily.
    public Tetromino copy() {
        return new Tetromino(color, pieces.stream()
                .map(Piece::copy)
                .collect(Collectors.toList())
                .toArray(new Piece[0]));
    }
}