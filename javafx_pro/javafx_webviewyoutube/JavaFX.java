
package javafx_webviewyoutube;
import tetris.*;

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
import java.io.IOException;

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

import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Group;

import javafx.application.Platform;
import java.io.File;
import java.awt.Desktop;





public class TetrisApp extends Application {
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
            
               String content_Url = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/r76glJEPlaQ\" frameborder=\"0\" allowfullscreen></iframe>";
            
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
   
public class TetrisApp extends Application {

   public static final int TILE_SIZE = 40;
   public static final int GRID_WIDTH = 15;
   public static final int GRID_HEIGHT = 20;

   private double time;
   private GraphicsContext g;

   private int[][] grid = new int[GRID_WIDTH][GRID_HEIGHT];

   private List<Tetromino> original = new ArrayList<>();
   private List<Tetromino> tetrominos = new ArrayList<>();

   private Tetromino selected;

   private Parent createContent() {
      Pane root = new Pane();
      root.setPrefSize(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE);
   
      Canvas canvas = new Canvas(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE);
      g = canvas.getGraphicsContext2D();
   
      root.getChildren().addAll(canvas);
   
   
      original.add(new Tetromino(Color.GREEN,
                new Piece(0, Direction.DOWN),
                new Piece(1, Direction.RIGHT),
                new Piece(2, Direction.RIGHT),
                new Piece(1, Direction.DOWN)));
        
      original.add(new Tetromino(Color.BLUE,
                new Piece(0, Direction.DOWN),
                new Piece(1, Direction.LEFT),
                new Piece(2, Direction.LEFT),
                new Piece(1, Direction.DOWN)));
   
      original.add(new Tetromino(Color.BLACK,
                new Piece(0, Direction.DOWN),
                new Piece(1, Direction.LEFT),
                new Piece(1, Direction.RIGHT),
                new Piece(2, Direction.RIGHT)));
       
      original.add(new Tetromino(Color.YELLOW,
         	     new Piece(0, Direction.DOWN),
                 new Piece(1, Direction.LEFT),
                 new Piece(1, Direction.RIGHT),
                 new Piece(1, Direction.DOWN)));
        
      original.add(new Tetromino(Color.PURPLE,
                new Piece(0, Direction.DOWN),
                new Piece(1, Direction.RIGHT),
                new Piece(1, Direction.RIGHT, Direction.DOWN),
                new Piece(1, Direction.DOWN)));
   
      original.add(new Tetromino(Color.RED,
                new Piece(0, Direction.DOWN),
               new Piece(1, Direction.DOWN, Direction.LEFT),
               new Piece(1, Direction.RIGHT),
               new Piece(1, Direction.DOWN)));
        
      original.add(new Tetromino(Color.ORANGE,
                new Piece(0, Direction.DOWN),
                new Piece(1, Direction.DOWN, Direction.RIGHT),
                new Piece(1, Direction.LEFT),
                new Piece(1, Direction.DOWN)));
        
      spawn();
   
      AnimationTimer timer = 
         new AnimationTimer() {
            @Override
            public void handle(long now) {
               time += 0.017;
            
               if (time >= 0.5) {
                  update();
                  render();
                  time = 0;
               }
            }
         };
      timer.start();
   
      return root;
   }

   private void update() {
      makeMove(p -> p.move(Direction.DOWN), p -> p.move(Direction.UP), true);
   }

   private void render() {
      g.clearRect(0, 0, GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE);
   
      tetrominos.forEach(p -> p.draw(g));
   }

   private void placePiece(Piece piece) {
      grid[piece.x][piece.y]++;
   }

   private void removePiece(Piece piece) {
      grid[piece.x][piece.y]--;
   }

   private boolean isOffscreen(Piece piece) {
      return piece.x < 0 || piece.x >= GRID_WIDTH
                || piece.y < 0 || piece.y >= GRID_HEIGHT;
   }

   private void makeMove(Consumer<Tetromino> onSuccess, Consumer<Tetromino> onFail, boolean endMove) {
      selected.pieces.forEach(this::removePiece);
   
      onSuccess.accept(selected);
   
      boolean offscreen = selected.pieces.stream().anyMatch(this::isOffscreen);
   
      if (!offscreen) {
         selected.pieces.forEach(this::placePiece);
      } else {
         onFail.accept(selected);
      
         selected.pieces.forEach(this::placePiece);
      
         if (endMove) {
            sweep();
         }
      
         return;
      }
   
      if (!isValidState()) {
         selected.pieces.forEach(this::removePiece);
      
         onFail.accept(selected);
      
         selected.pieces.forEach(this::placePiece);
      
         if (endMove) {
            sweep();
         }
      }
   }

   private boolean isValidState() {
      for (int y = 0; y < GRID_HEIGHT; y++) {
         for (int x = 0; x < GRID_WIDTH; x++) {
            if (grid[x][y] > 1) {
               return false;
            }
         }
      }
   
      return true;
   }

   private void sweep() {
      List<Integer> rows = sweepRows();
      rows.forEach(
         row -> {
            for (int x = 0; x < GRID_WIDTH; x++) {
               for (Tetromino tetromino : tetrominos) {
                  tetromino.detach(x, row);
               }
            
               grid[x][row]--;
            }
         });
   
      rows.forEach(
         row -> {
            tetrominos.stream().forEach(
               tetromino -> {
                  tetromino.pieces.stream()
                        .filter(piece -> piece.y < row)
                        .forEach(
                     piece -> {
                        removePiece(piece);
                        piece.y++;
                        placePiece(piece);
                     });
               });
         });
   
      spawn();
   }

   private List<Integer> sweepRows() {
      List<Integer> rows = new ArrayList<>();
   
      outer:
        for (int y = 0; y < GRID_HEIGHT; y++) {
         for (int x = 0; x < GRID_WIDTH; x++) {
            if (grid[x][y] != 1) {
               continue outer;
            }
         }
      
         rows.add(y);
      }
   
      return rows;
   }

   private void spawn() {
      Tetromino tetromino = original.get(new Random().nextInt(original.size())).copy();
      tetromino.move(GRID_WIDTH / 2, 0);
   
      selected = tetromino;
   
      tetrominos.add(tetromino);
      tetromino.pieces.forEach(this::placePiece);
   
      if (!isValidState()) {
         System.out.println("Game Over");
         System.exit(0);
      }
   }

   @Override
    public void start(Stage stage) throws Exception {
      Scene scene = new Scene(createContent());
   
      scene.setOnKeyPressed(
         e -> {
            if (e.getCode() == KeyCode.SPACE) {
               makeMove(p -> p.rotate(), p -> p.rotateBack(), false);
            } else if (e.getCode() == KeyCode.LEFT) {
               makeMove(p -> p.move(Direction.LEFT), p -> p.move(Direction.RIGHT), false);
            } else if (e.getCode() == KeyCode.RIGHT) {
               makeMove(p -> p.move(Direction.RIGHT), p -> p.move(Direction.LEFT), false);
            } else if (e.getCode() == KeyCode.DOWN) {
               makeMove(p -> p.move(Direction.DOWN), p -> p.move(Direction.UP), true);
            }
         
            render();
         });
   
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
     
