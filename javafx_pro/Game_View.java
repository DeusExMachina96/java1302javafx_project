package javafx_pro;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;

import javafx.scene.Parent;

import javafx.scene.Scene;

  
public class Game_View extends Application {

   @Override
   
   public void start(Stage primaryStage) {
   
      try {
      
      // Load the FXML file for the game board
      
         Parent root = FXMLLoader.load(getClass().getResource("/board.fxml"));
      
      // Set the scene onto the stage
      
         primaryStage.setScene(new Scene(root, 800, 400));
      
      // Display the board to the user
      
         primaryStage.show();
      
      } catch(Exception e) {
      
         e.printStackTrace();
      
      }
   
   }

   public static void main(String[] args) {
   
   // Launches the application (calls start method in the process)
   
      launch(args);
   
   }

}