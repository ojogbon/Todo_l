/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo_chat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author git
 */
public class Todo_Chat extends Application {
    
//    @Override
    
    String []  Question ={"how are you","are a programmer","where do you leave","do you love games like me?","why do you choose to use me?"}; 
    String []  answer = {"fine","cool","good","alright","hill","not fine","ok","yes","yea","yap","yeap","not yet","not at all"," appretiations to jare!"};
    Stage page;
    AnchorPane root,right,left;
    VBox vbox,vbox1;
    //HBox hbox;
    Button btn1,btn2,btn3;
    TextField txt1,txt2,txt3;
    Label lab1,lab2,lab3,lab4,lab5;
    ComboBox<String> combo,combo1;
    TextArea tarea;
    @Override
    public void start(Stage stage){
       page = stage;
        vbox = new VBox();
        vbox1 = new VBox();
        txt1 = new TextField();
        txt2 = new TextField();
        txt3 = new TextField();
        tarea = new TextArea();
        combo = new ComboBox<>();
        combo1 = new ComboBox<>();
        lab1 = new Label();
        lab2 = new Label();
        lab3 = new Label();
        lab4 = new Label();
        lab5 = new Label();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn2.getStyleClass().add("btn");
        btn3.getStyleClass().add("btn");
        txt1.getStyleClass().add("btn");
        btn1.getStyleClass().add("btn");
        vbox.getStyleClass().add("vbox");
        vbox1.getStyleClass().add("vbox");
       
        lab1.getStyleClass().add("lab");
        lab2.getStyleClass().add("lab");
        lab3.getStyleClass().add("lab");
        lab5.getStyleClass().add("lab");
        txt2.getStyleClass().add("txt");
        txt1.getStyleClass().add("txt");
        combo.getStyleClass().add("txt");
        combo1 .getStyleClass().add("txt");
        root = new AnchorPane();
        right = new AnchorPane();
        left = new AnchorPane();
         root.getStyleClass().add("vbox");
        root.getChildren().addAll(right,left);
        vbox.getChildren().addAll(lab2,combo,txt1,btn2,lab3,combo1);
        vbox1.getChildren().addAll(lab1,tarea,txt2,btn1,lab3,btn3,lab4);
       // vbox.setSpacing( new );
      
       Scene scene = new Scene(root,900,400);
         scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm()) ;
       right.getChildren().addAll(vbox);
        left.getChildren().addAll(vbox1);
        btn1.setText("SEND");
        btn2.setText("SAVE");
        btn3.setText("Start Chat");
        lab2.setText("------Todo List------");
        lab1.setText("Hi guys!, I'm Mr Bot..");
        
        //right.prefWidthProperty().bind(root.widthProperty());
        right.prefWidth(400);
        right.prefHeightProperty().bind(root.heightProperty());
        left.prefWidth(300);
        left.prefHeightProperty().bind(root.heightProperty());
        
        vbox.prefWidthProperty().bind(right.heightProperty());
        vbox.prefHeightProperty().bind(right.heightProperty());
       
        vbox1.prefWidthProperty().bind(left.heightProperty());
        vbox1.prefHeightProperty().bind(left.heightProperty());
        
        combo.prefWidthProperty().bind(vbox.widthProperty());
        combo.prefHeight(100);
        combo1.prefWidthProperty().bind(vbox.widthProperty());
        combo1.prefHeight(100);
        txt1.prefWidthProperty().bind(vbox.widthProperty());
        txt1.prefHeight(100);
        btn2.prefWidthProperty().bind(vbox.widthProperty());
        btn2.prefHeight(100);
        
        
        //-------------- event avenue
        
          lab4.setText("0");
         combo.setPromptText("Select/Creat ToDo");
         combo1.setPromptText("Marked");
         btn2.setOnAction(e-> {
             if(txt1.getText().trim().isEmpty()){
                lab3.setText("values can not Empty..");}else{
         writein(txt1.getText());
          lab3.setText("");
          }
           // page.setScene(scene);
         });
         
         btn1.setOnAction(e-> {
             if(txt2.getText().trim().isEmpty()){
                lab3.setText("values can not Empty..");
             }else{
             tarea.appendText("You -: "+txt2.getText()+"\n"); 
             lab5.setText(txt2.getText());
              for (int i = 0; i < 1000; i++) {
                           for (int j = 0; j < 1000; j++) {
                               System.out.print("*");
                         }
                     }
         bot(txt2.getText().toLowerCase());
          lab3.setText("");
          }
          //  page.setScene(scene);
         });
         
          btn3.setOnAction(e->{
                 
                 tarea.appendText("Bot -: Hello"+"\n"+"Bot -: "+Question[0]+"\n");
                 btn3.setVisible(false);
                 
               /**vbox.getChildren().addAll(txt3);
              System.out.println( combo.getValue()+ combo.getSelectionModel().getSelectedIndex());//;
              /combo.getSelectionModel(). 
              combo.getSelec tionModel().clearSelection();**/
         });
        
         combo.setOnAction(e-> {
         combo1.getItems().add(combo.getValue());
         });
        btn1.prefWidthProperty().bind(vbox1.widthProperty());
        btn1.prefHeight(100);
        txt2.prefWidthProperty().bind(vbox1.widthProperty());
        txt2.prefHeight(100);
        lab1.prefWidthProperty().bind(vbox1.widthProperty());
        lab1.prefHeight(100);
        root.setTopAnchor(left, 0.0);
        root.setLeftAnchor(left, 0.0);
        root.setTopAnchor(right, 0.0);
        root.setRightAnchor(right, 0.0);
    
        page.setScene(scene);
       page.setTitle("Ami");
        page.show();
        
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
       
    }
    
     void writein(String cont){
     combo.getItems().addAll(cont);
         System.out.println("-Done-");
         txt1.setText("");
         
  }
     void bot(String cont){
             int g = Integer.parseInt(lab4.getText());
                 g = g+1;
                 lab4.setText(g+"");
                 
                 if(lab4.getText().equals("1")){
                    
                     System.out.println("one");
                   tarea.appendText("Bot -: ko, "+Question[2]+"\n");
                  
                 }
                 else if(lab4.getText().equals("2")){
                     
                   System.out.println("two"+ lab5.getText());
                    if(!lab5.equals(" ")){
                    tarea.appendText("Bot -: wow! What a wonder place "+"\n");
                    tarea.appendText("Bot -: "+Question[1]+"\n");
                    }else{
                      tarea.appendText("Bot -: ok good, hummm... "+"\n");
                    }
                 }
                 else if(lab4.getText().equals("3")){
                   System.out.println("three"+ lab5.getText());
                    if(lab5.getText().contains("yes")
                            ||lab5.getText().contains("yea")
                             ||lab5.getText().contains("yeah")
                             ||lab5.getText().contains("yeap")){
                   tarea.appendText("Bot -: ok good, i love coding too, anyways "+"\n");
                 }else{
                      tarea.appendText("Bot -: you might need one, may be java? "+"\n");
                    }
                 }else if(lab4.getText().equals("4")){
                      System.out.println("four"+ lab5.getText());
                    if(!lab5.getText().equals(" ") ){
                     tarea.appendText("Bot -: ko, "+Question[4]+"\n");
                    }else{
                    tarea.appendText("Bot -: ko, "+" is this real"+"\n");
                    }
                 }
                 else if(lab4.getText().equals("5")){
                    System.out.println("five"+ lab5.getText());
                    if(!lab5.getText().equals(" ") ){
                      tarea.appendText("Bot -: ko, "+answer[13]+"\n");
                    }else{
                     tarea.appendText("Bot -: ko, "+answer[13]+"\n");
                    }
                 }
         System.out.println("-Done bot-");
         txt2.setText("");

}
}

//}
