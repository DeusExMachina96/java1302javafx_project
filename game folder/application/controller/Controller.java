package application.controller;

import application.model.Board;

import javafx.concurrent.Task;

import javafx.concurrent.WorkerStateEvent;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

public class Controller implements EventHandler{

   @FXML
   
   Button zero0, zero1, zero2, zero3, one0, one1, one2, one3;

   private Board gameBoard = new Board();

   @Override
   
   public void handle(ActionEvent event)
   
   {
   
      Button selected = (Button) event.getSource();
   
      System.out.println("User selected square: " + selected.toString());
   
      String color = gameBoard.reveal(selected.getId());
   
      if( color!=null )
      
         selected.setStyle("-fx-background-color: #" + color );
   
      sleep( selected, 2 );
   
      System.out.println( gameBoard );
   
   }


   public void sleep( Button selected, int seconds )
   
   {
   
      Task sleeper = 
         new Task() {
         
            @Override
            
            protected Void call() throws Exception {
            
               try {
               
                  Thread.sleep(seconds*1000);
               
               } catch (InterruptedException e) {
               
                  e.printStackTrace();
               
               }
            
               return null;
            
            }
         
         };
   
   
   
      EventHandler e = 
         new EventHandler()
         
         {
         
            @Override
            
            public void handle(WorkerStateEvent event) {
            
               selected.setStyle("");
            
            }
         
         };
   
   
   
      sleeper.setOnSucceeded( e );
   
      new Thread(sleeper).start();
   
   }

}