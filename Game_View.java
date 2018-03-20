   import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.util.Duration;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

   

public class Game_View extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage Secondary3Stage) {
   	       
   
   
      
   
   	      
   	// Create a scene and place it in the stage
      
      Scene scene = new Scene(pane, 500, 150);
      Secondary3Stage.setTitle("JavaFX Project"); // Set the stage title
      Secondary3Stage.setScene(scene); // Place the scene in the stage
      Secondary3Stage.show(); // Display the stage
   }
   public static void main(String[] args) {
      launch(args);
   }
}