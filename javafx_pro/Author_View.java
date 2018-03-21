package javafx_pro;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
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
import javafx.scene.layout.BorderPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;


   

public class Author_View extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage Secondary2Stage) {
       
      GridPane paneForInfo = new GridPane();
      
      paneForInfo.setAlignment(Pos.TOP_LEFT);
    

      Text edu = new Text(" Education Status:\n I am a college junior CS major at Kennesaw State University.\n\n\n\n");//creates text
      edu.setFill(Color.GREEN);
      edu.setFont(Font.font("Times Roman", FontWeight.BOLD,
         FontPosture.ITALIC, 16));
          paneForInfo.getChildren().add(edu);
     
         
      Text hobbies = new Text("  \n\n Hobbies:\n  I am a member of the Autonomous Underwater Vehicle Team.I am also do website and graphics design.\n\n");//creates text
      hobbies.setFill(Color.BLACK);
      hobbies.setFont(Font.font("Times Roman", FontWeight.BOLD,
         FontPosture.ITALIC, 16));
          paneForInfo.getChildren().add(hobbies);
          
       Text add = new Text("  \n\n\n\n Additional Information:\n I am 21 years old.");//creates text
      add.setFill(Color.BLUE);
      add.setFont(Font.font("Times Roman", FontWeight.BOLD,
         FontPosture.ITALIC, 16));
          paneForInfo.getChildren().add(add);

         
   
      GridPane paneForImage = new GridPane();
      paneForImage.setAlignment(Pos.TOP_RIGHT);
      paneForImage.getChildren().clear();
      paneForImage.getChildren().add(new ImageView(new Image(
         "author.jpg")));    
      
       String content_Url = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4r9N0EvRWRg\" frameborder=\"0\" allowfullscreen></iframe>";
       
      GridPane paneForVideo = new GridPane();
      paneForVideo.setAlignment(Pos.TOP_LEFT);

       WebView webView = new WebView();
       WebEngine webEngine = webView.getEngine();
       webEngine.loadContent(content_Url);
       paneForVideo.getChildren().add(webView);
           
      
      // Create a border pane
      BorderPane pane = new BorderPane();
      pane.setBottom(paneForInfo);
      pane.setCenter(paneForImage);
      pane.setRight (paneForVideo); 
  
      Scene scene = new Scene(pane, 850, 450 );
   
      Secondary2Stage.setTitle("Author View"); // Set the stage title
      Secondary2Stage.setScene(scene); // Place the scene in the stage
      Secondary2Stage.show(); // Display the stage
   }   
   
   
   
   public static void main(String[] args) {
      launch(args);
   }
}