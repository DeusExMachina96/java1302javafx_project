import javafx.scene.paint.Color;

public class Board {

   private Square[][] squares;

   public Board() {
   
      this.squares = new Square[2][4];
   
      squares[0][0] = new Square(Color.RED);
   
      squares[0][1] = new Square(Color.BLUE);
   
      squares[0][2] = new Square(Color.GREEN);
   
      squares[0][3] = new Square(Color.YELLOW);
   
      squares[1][0] = new Square(Color.GREEN);
   
      squares[1][1] = new Square(Color.RED);
   
      squares[1][2] = new Square(Color.YELLOW);
   
      squares[1][3] = new Square(Color.BLUE);
   
   }

   public void hide( int x, int y ) {
   
      squares[x][y].hide();
   
   }

   public void hideBoth(int x1, int y1, int x2, int y2) {
   
   
      hide(x1, y1);
   
      hide(x2, y2);
   
   }

   public boolean matchFound(int x1, int y1, int x2, int y2) {
   
   
      if(reveal(x1, y1).equals(reveal(x2, y2))) {
      
         return true;
      
      }
   
      hideBoth(x1, y1, x2, y2);
   
      return false;
   
   }

   public String reveal( String buttonName ) {
   
      int x = buttonName.startsWith("zero") ? 0 : 1;
   
      int y;
   
      if( buttonName.endsWith("zero") )
      
         y = 0;
      
      else if( buttonName.endsWith("one") )
      
         y = 1;
      
      else if( buttonName.endsWith("two") )
      
         y = 2;
      
      else
      
         y = 3;
   
      return this.reveal(x,y);
   
   }

   public String reveal( int x, int y ) {
   
      squares[x][y].reveal();
   
      return squares[x][y].getColorAsCode();
   
   }



   public String toString() {
   
      String ret = squares[0][0] + ", " + squares[0][1] + ", ";
   
      ret += squares[0][2] + ", " + squares[0][3] + "\n";
   
      ret += squares[1][0] + ", " + squares[1][1] + ", ";
   
      ret += squares[1][2] + ", " + squares[1][3];
   
      return ret;
   
   }

}