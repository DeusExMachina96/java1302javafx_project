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

   

public class Home_View extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage Secondary1Stage) {
   	       
   	// Create a pane and set its properties
   
      HBox pane = new HBox(5);
      pane.setAlignment(Pos.TOP_RIGHT);
      pane.setPadding(new Insets(5, 5, 5, 5));
   
      
      Text welcome = new Text("Welcome to the Memory Game!");//creates text
      welcome.setFill(Color.GREEN);
      welcome.setFont(Font.font("Times Roman", FontWeight.BOLD,
         FontPosture.ITALIC, 22));
      pane.getChildren().add(welcome);
      
      Text app_info = new Text("\n \n \n This my CS1302 course project using JavaFX. \n We are using JavaFx to make a simple desktop application. \n The application has 3 views: Home, Author, and Game View.");//creates text
      app_info.setFill(Color.BLACK);
      app_info.setFont(Font.font("Times Roman", FontWeight.BOLD,
         FontPosture.ITALIC, 17));
      pane.getChildren().add(app_info);
      
   // Create a path transition for welcome message
      PathTransition pt = new PathTransition(Duration.millis(10000), 
         new Line(-150, 0, 500, 0), welcome);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.play(); // Start animation
   
   	// Create and register the handle
      pane.setOnMousePressed(
         e -> {
            pt.pause();
         });
   
      pane.setOnMouseReleased(
         e -> {
            pt.play();
         });
   
   	      
   	// Create a scene and place it in the stage
      
      Scene scene = new Scene(pane, 500, 150);
      Secondary1Stage.setTitle("Home View"); // Set the stage title
      Secondary1Stage.setScene(scene); // Place the scene in the stage
      Secondary1Stage.show(); // Display the stage
   }
   public static void main(String[] args) {
      launch(args);
   }
}