
package javafx_webviewyoutube;

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
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import static javafx.application.Application.launch;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.Group;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;






public class JavaFX extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage primaryStage) {
   	// Create three buttons
      Button home = new Button("Home View");
      Button author = new Button("Jessy");
      Button game = new Button("Game View");
      Button author2 = new Button ("Antonio");
   	// Create a pane and set its properties
      HBox pane = new HBox(5);
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(10, 10, 10, 10));
      pane.getChildren().addAll(home, author,author2, game);
   
   	
   	// Create and register handlers
      //home view
      home.setOnAction(
         new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
               HBox homepane = new HBox(5);
               homepane.setAlignment(Pos.TOP_RIGHT);
               homepane.setPadding(new Insets(5, 5, 5, 5));
            
            
               Text welcome = new Text("Welcome to Tetris!");//creates text
               welcome.setFill(Color.GREEN);
               welcome.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 30));
               homepane.getChildren().add(welcome);
            
               Text app_info = new Text("\n \n \n This my CS1302 course project using JavaFX. \n We are using JavaFx to make a simple desktop application. \n The application has 3 views: Home, Author, and Game View.");//creates text
               app_info.setFill(Color.BLACK);
               app_info.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 17));
               homepane.getChildren().add(app_info);
               
               Text tetris_instr = new Text("\n \n \n Game Instructions: \n Space Bar - Change Block Direction \n Up and Down Arrow Keys - Change Block Horizontal Direction \n Down Arrow Key - Speeds Up Blocks Descent");//creates text
               tetris_instr.setFill(Color.GREEN);
               tetris_instr.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 17));
               homepane.getChildren().add(tetris_instr);
            
            
            // Create a path transition for welcome message
               PathTransition pt = new PathTransition(Duration.millis(10000), 
                  new Line(0, 0, 1400, 0), welcome);
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
                
               Scene homeScene = new Scene(homepane, 1010, 200);
            
                // New window (Stage)
               Stage homeWindow = new Stage();
               homeWindow.setTitle("Home Stage");
               homeWindow.setScene(homeScene);
            
                // Set position of second window, related to primary window.
               homeWindow.setX(primaryStage.getX() - 400);
               homeWindow.setY(primaryStage.getY() + 100);
            
               homeWindow.show();
            }
         });      
         
      //author view
      author.setOnAction(
         new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
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
               BorderPane authorpane = new BorderPane();
               authorpane.setBottom(paneForInfo);
               authorpane.setCenter(paneForImage);
               authorpane.setRight (paneForVideo);
            
               Scene authorScene = new Scene(authorpane, 850, 450);
            
                // New window (Stage)
               Stage authorWindow = new Stage();
               authorWindow.setTitle("Author Stage");
               authorWindow.setScene(authorScene);
            
                // Set position of second window, related to primary window.
               authorWindow.setX(primaryStage.getX() + 50);
               authorWindow.setY(primaryStage.getY() + 50);
            
               authorWindow.show();
            }
         });
      author2.setOnAction(
         new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
               GridPane paneForInfo = new GridPane();
            
               paneForInfo.setAlignment(Pos.TOP_LEFT);
            
            
               Text edu = new Text(" Education Status:\n I am a junior majoring in Computer Science at Kennesaw State University.\n\n\n\n");//creates text
               edu.setFill(Color.BLUE);
               edu.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 16));
               paneForInfo.getChildren().add(edu);
            
            
               Text hobbies = new Text("\n\n Hobbies:\n  I use my free time mostly for watching movies, playing video games, and playing soccer. I also really like going out places and trying new foods .\n\n");//creates text
               hobbies.setFill(Color.BLUE);
               hobbies.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 16));
               paneForInfo.getChildren().add(hobbies);
            
               Text add = new Text("  \n\n\n\n Additional Information:\n I am 22 years old.");//creates text
               add.setFill(Color.BLUE);
               add.setFont(Font.font("Times Roman", FontWeight.BOLD,
                  FontPosture.ITALIC, 16));
               paneForInfo.getChildren().add(add);
            
               GridPane paneForImage = new GridPane();
               paneForImage.setAlignment(Pos.TOP_RIGHT);
               paneForImage.getChildren().clear();
               paneForImage.getChildren().add(new ImageView(new Image(
                  "author2.jpg")));    
            
               String content_Url = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/QEtUoc3xCt4\" frameborder=\"0\" allowfullscreen></iframe>";
               GridPane paneForVideo = new GridPane();
               paneForVideo.setAlignment(Pos.TOP_LEFT);
            
               WebView webView = new WebView();
               WebEngine webEngine = webView.getEngine();
               webEngine.loadContent(content_Url);
               paneForVideo.getChildren().add(webView);
            
            
            // Create a border pane
               BorderPane authorpane = new BorderPane();
               authorpane.setBottom(paneForInfo);
               authorpane.setCenter(paneForImage);
               authorpane.setRight (paneForVideo);
            
               Scene authorScene = new Scene(authorpane, 1150, 450);
            
                // New window (Stage)
               Stage authorWindow = new Stage();
               authorWindow.setTitle("Author Stage");
               authorWindow.setScene(authorScene);
            
                // Set position of second window, related to primary window.
               authorWindow.setX(primaryStage.getX() - 150);
               authorWindow.setY(primaryStage.getY() + 50);
            
               authorWindow.show();
            }
         });
         
              
      
           
      game.setOnAction(
         new EventHandler<ActionEvent>() {
         
            @Override
            public void handle(ActionEvent event) {
            
               
            }
         });
   
   	// Create a scene and place it in the stage
      Scene scene = new Scene(pane,400, 50);
      primaryStage.setTitle("JavaFX_Project"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
   }
   public static void main(String[] args) {
      launch(args);
   }
}
     
