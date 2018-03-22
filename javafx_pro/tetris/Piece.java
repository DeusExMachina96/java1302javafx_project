package tetris;




import java.util.Arrays;
import java.util.List;

/*This class is used to describe the parts of the Tetromino
 * which is the entire block
 */
public class Piece {

	//These variables are the values for Piece class
    public int distance;
    public List<Direction> directions;
    public Tetromino parent;
    public int x, y;

    //The constructor for Piece which helps draw it.
    public Piece(int distance, Direction... direction) {
        this.distance = distance;
        this.directions = Arrays.asList(direction);
    }
    
    //This method is used for the construction of tetromino
    public void setParent(Tetromino parent) {
        this.parent = parent;

        int dx = 0, dy = 0;

        for (Direction d : directions) {
            dx += distance * d.x;
            dy += distance * d.y;
        }

        x = parent.x + dx;
        y = parent.y + dy;
    }
    //This method places the pieces according the the parent Tetromino
    public void setDirection(Direction... direction) {
        this.directions = Arrays.asList(direction);

        int dx = 0, dy = 0;

        for (Direction d : directions) {
            dx += distance * d.x;
            dy += distance * d.y;
        }

        x = parent.x + dx;
        y = parent.y + dy;
    }
    //Used to create more pieces
    public Piece copy() {
        return new Piece(distance, directions.toArray(new Direction[0]));
    }
}