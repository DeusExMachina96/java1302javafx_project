package javafx_pro;

import javafx.scene.paint.Color;

public class Square {

   private boolean isDisplayed;

   private Color color;

   private static final String BLUE = "0000FF";

   private static final String GREEN = "00FF00";

   private static final String RED = "FF0000";

   private static final String YELLOW = "FFFF00";

   public Square( Color c ) {
   
      this.color = c;
   
      this.isDisplayed = false;
   
   }

   public Color getDisplayedColor() {
   
      if( this.isDisplayed() )
      
         return this.getColor();
      
      else
      
         return Color.GRAY;
   
   }

   public Color getColor() {
   
      return this.color;
   
   }

   public boolean isDisplayed() {
   
      return isDisplayed;
   
   }

   public void hide() {
   
      this.isDisplayed = false;
   
   }

   public void reveal() {
   
      this.isDisplayed = true;
   
   }

   public String getColorAsCode() {
   
      if( !isDisplayed() )
      
         return Color.GRAY.toString();
   
      if( color.equals(Color.RED) )
      
         return RED;
      
      else if( color.equals(Color.GREEN) )
      
         return GREEN;
      
      else if( color.equals(Color.BLUE) )
      
         return BLUE;
      
      else
      
         return YELLOW;
   
   }

   public String getColorAsString() {
   
      if( !isDisplayed() )
      
         return "GRAY";
   
      if( color.equals(Color.YELLOW) )
      
         return "YELLOW";
      
      else if( color.equals(Color.GREEN) )
      
         return "GREEN";
      
      else if( color.equals(Color.BLUE) )
      
         return "BLUE";
      
      else if( color.equals(Color.RED) )
      
         return "RED";
      
      else 
         return "GRAY";
   
   }

   public String toString() {
   
      return this.getColorAsString();
   
   }

}