package tetris;

//The enum direction holds the constants for the values of the possible
//directional moves.
	public enum Direction {
	    UP(0, -1),
	    RIGHT(1, 0),
	    DOWN(0, 1),
	    LEFT(-1, 0);

	    int x, y;
	    // Constructor for Direction which accepts an x & y coordinate
	    Direction(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    //This method is also used to describe the 
	    //placement making sure numbers are positive with ordinal()
	    public Direction prev() {
	        int nextIndex = ordinal() - 1;

	        if (nextIndex == -1) {
	            nextIndex = Direction.values().length - 1;
	        }

	        return Direction.values()[nextIndex];
	    }
	    
	    //This method is also used to describe the 
	    //placement making sure numbers are positive with ordinal()
	    public Direction next() {
	        int nextIndex = ordinal() + 1;

	        if (nextIndex == Direction.values().length) {
	            nextIndex = 0;
	        }

	        return Direction.values()[nextIndex];
	    }
	}

