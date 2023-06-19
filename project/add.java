/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author SMART
 */
public class add extends Application {

    @Override
    public void start(Stage Stage) throws FileNotFoundException {
        Image image = new Image(new FileInputStream("D:\\IMAGE\\back.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(1280);
        imageView.setFitWidth(1280);

        imageView.setPreserveRatio(true);
        Rectangle rect = new Rectangle();

        rect.setWidth(1280);
        rect.setHeight(1280);

        rect.setFill(Color.rgb(0, 0, 0, 0.19));
        GridPane g = new GridPane();
        Button b5 = new Button("Add transaction");
        Button b6 = new Button("Delete transaction ");
       
        Button b8 = new Button("Update transaction");
        

        g.add(b5, 0, 0);
        g.add(b6, 1, 0);
        
        g.add(b8, 1, 2);
        

        g.setAlignment(Pos.CENTER);
        g.setHgap(10);
        g.setVgap(10);

        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        root.getChildren().add(rect);
        root.getChildren().add(g);
        Button btn1= new Button("add");
        Button btn2= new Button("back");
        Label l0=new Label(" add new transaction");
        l0.getStyleClass().add("title");
        Label ll1=new Label("Date");
        ll1.getStyleClass().add("labl");
        Label ll2=new Label("Description"); 
         ll2.getStyleClass().add("labl");
        Label l3=new Label("Type"); 
         l3.getStyleClass().add("labl");
        Label l4=new Label("Amount");
         l4.getStyleClass().add("labl");
        Label l5=new Label("Balance");  
        l5.getStyleClass().add("labl");
        TextField T1=new TextField();
        TextField T2=new TextField();TextField T3=new TextField();TextField T4=new TextField();TextField T5=new TextField();
        
        GridPane g4=new GridPane ();
        
        g4.add(l0, 0, 0,2,1);
        g4.add(ll1, 0, 1);
        g4.add(T1, 1, 1);
        g4.add(ll2, 0, 2);
        g4.add(T2, 1, 2);
        g4.add(l3, 0, 3);
        g4.add(T3, 1, 3);
        g4.add(l4, 0, 4);
        g4.add(T4, 1, 4); 
        g4.add(l5, 0, 5);
        g4.add(T5, 1, 5);
        g4.add(btn1, 0, 6);
         g4.add(btn2, 1, 6);
        
        g4.setVgap(5);
        g4.setHgap(5);
        g4.setPadding(new Insets(20,20,20,20));
      //-------------------------------
      //delete scene
         GridPane g5=new GridPane ();
         
        Button btn3= new Button("delete");
        Button btn4= new Button("back");
        Label L0=new Label(" Delete transactions :");
        L0.getStyleClass().add("title");
         
        Label L1=new Label("enter transaction ID :");
        L1.getStyleClass().add("labl");
        TextField T6=new TextField();
        
        g5.add(L0, 0, 0,2,1);
        g5.add(L1, 0, 1);
        g5.add(T6, 0, 2);
        g5.add(btn3, 0, 5);
        g5.add(btn4, 1, 5);
     
        g5.setVgap(5);
        g5.setHgap(5);
        g5.setPadding(new Insets(20,20,20,20));
      //  -------------------------------
      //UPDATE scene
         GridPane g6=new GridPane ();
         
        Button btn5= new Button("Update");
        Button btn6= new Button("back");
        Label LL1=new Label(" Update type of transactions :");
        LL1.getStyleClass().add("title");
         
        Label L2=new Label("enter transaction ID :");
        L2.getStyleClass().add("labl");
        TextField T7=new TextField();
        Label L3=new Label("enter your update :");
         L3.getStyleClass().add("labl");
        TextField T8=new TextField();
        
        g6.add(LL1, 0, 0,2,1);
        g6.add(L2, 0, 1);
        g6.add(T7, 0, 2);
        g6.add(L3, 0, 3);
        g6.add(T8, 0, 4);
        g6.add(btn5, 0, 7);
        g6.add(btn6, 1, 7);
     
        g6.setVgap(5);
        g6.setHgap(5);
        g6.setPadding(new Insets(20,20,20,20));
      
      
     //  -------------------------------
     //PRINT scene
         GridPane g7=new GridPane ();
         
        Button btn7= new Button("delete");
        Button btn8= new Button("back");
        Label LL2=new Label(" Print transactions :");
        LL2.getStyleClass().add("title");
         
         
        
        g7.add(LL2, 0, 0,2,1);
         
        g7.add(btn7, 0, 4);
        g7.add(btn8, 1, 4);
     
        g7.setVgap(5);
        g7.setHgap(5);
        g7.setPadding(new Insets(20,20,20,20));
      
      
     //  -------------------------------
    
        TableView<Transactions> myTable  ;
        Stage.setTitle("Bank");
        
        TableColumn<Transactions, String> c = new TableColumn<>("Transaction ID");
        c.setMinWidth(200);
        c.setCellValueFactory(new PropertyValueFactory<>("Transaction ID")); 
          
        TableColumn<Transactions, String> c1 = new TableColumn<>("Date");
        //c1.setMinWidth(50);
        c1.setCellValueFactory(new PropertyValueFactory<>("Date")); 
        
        TableColumn<Transactions, String> c2= new TableColumn<>("Description");
        c2.setMinWidth(200);
        c2.setCellValueFactory(new PropertyValueFactory<>("Description")); 
        
        TableColumn<Transactions, String> c3 = new TableColumn<>("Type");
        c3.setMinWidth(120);
        c3.setCellValueFactory(new PropertyValueFactory<>("Type"));
        
        TableColumn<Transactions, Double> c4 = new TableColumn<>("Amount");
        c4.setMinWidth(120);
        c4.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        
         TableColumn<Transactions, Double> c5= new TableColumn<>("Balance");
        c5.setMinWidth(120);
        c5.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        
        myTable = new TableView<>();
         
        myTable.getColumns().addAll(c,c1,c2,c3,c4,c5);
        
        
        
        //-------------------------------------
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              
     
        Scene ss = new Scene(root, Double.MAX_VALUE, Double.MAX_VALUE);
        Stage.setTitle("bank");
        Stage.setScene(ss);

        Stage.show();
            }
        }); 
        
    
          
          
          
          b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              VBox v= new VBox(myTable);
              v.setPadding(new Insets(20));
              GridPane rt= new GridPane();
       
              rt.add(g4, 0, 1);
              rt.add(v, 1, 1);
              
     
        Scene ss = new Scene(rt, Double.MAX_VALUE, Double.MAX_VALUE);
        //ss.getStylesheets().add((new File("src/BankFinal/Sheet.css")).toURI().toString());//to link css with main file
        Stage.setTitle("Add transaction");
        Stage.setScene(ss);
        Stage.show();  
            }
        }); 
          
          b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              VBox v= new VBox(myTable);
              v.setPadding(new Insets(20));
              GridPane rt= new GridPane();
       
              rt.add(g5, 0, 1);
              rt.add(v, 1, 1);
     
        Scene ss = new Scene(rt, 1060, 700);
        //ss.getStylesheets().add((new File("src/BankFinal/Sheet.css")).toURI().toString());//to link css with main file
        Stage.setTitle("Delete transaction");
        Stage.setScene(ss);
        Stage.show();  
            }
        }); 
         
         
          b8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              VBox v= new VBox(myTable);
              v.setPadding(new Insets(20));
              GridPane rt= new GridPane();
       
              rt.add(g6, 0, 1);
              rt.add(v, 1, 1);
     
        Scene ss = new Scene(rt, 1060, 700);
        //ss.getStylesheets().add((new File("src/BankFinal/Sheet.css")).toURI().toString());//to link css with main file
        Stage.setTitle("Delete transaction");
        Stage.setScene(ss);
        Stage.show();  
            }
        }); 
         
         
         
         
            
        
        

        Scene ss = new Scene(root, Double.MAX_VALUE, Double.MAX_VALUE);
        Stage.setTitle("bank");
        Stage.setScene(ss);

        Stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
