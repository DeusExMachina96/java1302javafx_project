package javafx_webviewyoutube;

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
      paneForInfo.add(new Text("Education Status:"), 0, 0);
      paneForInfo.add(new Text("Hobbies:"), 0, 1);
      paneForInfo.add(new Text("Additional Info About Me:"), 0, 2);
   
   
      GridPane paneForImage = new GridPane();
      paneForImage.setAlignment(Pos.BOTTOM_LEFT);
      paneForImage.getChildren().clear();
      paneForImage.getChildren().add(new ImageView(new Image(
         "author.jpg")));    
      
       String content_Url = "<iframe width=\"560\" height=\"315\" src=\"http://www.youtube.com/embed/9bZkp7q19f0\" frameborder=\"0\" allowfullscreen></iframe>";
       
      GridPane paneForVideo = new GridPane();
       WebView webView = new WebView();
       WebEngine webEngine = webView.getEngine();
       webEngine.loadContent(content_Url);
       paneForVideo.getChildren().add(webView);
           
      
      // Create a border pane
      BorderPane pane = new BorderPane();
      pane.setBottom(paneForInfo);
      pane.setCenter(paneForImage);
      pane.setRight (paneForVideo); 
  
      Scene scene = new Scene(pane, 500, 300);
   
      Secondary2Stage.setTitle("Author View"); // Set the stage title
      Secondary2Stage.setScene(scene); // Place the scene in the stage
      Secondary2Stage.show(); // Display the stage
   }   
   
   
   
   public static void main(String[] args) {
      launch(args);
   }
}