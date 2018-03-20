import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class JavaFX extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage primaryStage) {
   	// Create three buttons
      Button home = new Button("Home View");
      Button author = new Button("Author View");
      Button game = new Button("Game View");
   
   	// Create a pane and set its properties
      HBox pane = new HBox(5);
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(10, 10, 10, 10));
      pane.getChildren().addAll(home, author, game);
   
   	
   	// Create and register handlers
      home.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent e){
      
      
      
     
      }
      });
      
         
      author.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent e){
      
      }
      });
   
      game.setOnAction(new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent e){
      
      }
      });
   
   	// Create a scene and place it in the stage
      Scene scene = new Scene(pane);
      primaryStage.setTitle("JavaFX_Project"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
   }
   public static void main(String[] args) {
      launch(args);
   }
}
   
