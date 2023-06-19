/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import java.awt.Rectangle;
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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
public class Project extends Application {
     private Connection coun = null;
    private ResultSet res = null;
    private PreparedStatement pst = null;
    private ObservableList<sinup> data;
    private TableView<sinup> s1;

    @Override
    public void start(Stage Stage) throws FileNotFoundException {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//
//        Scene scene = new Scene(root, 300, 250);
//
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        Image image = new Image(new FileInputStream("D:\\IMAGE\\back.jpg"));
        // String 
        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
//      imageView.setX(50);
//      imageView.setY(25);
        //setting the fit height and width of the image view
        imageView.setFitHeight(1280);
        imageView.setFitWidth(1280);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        Rectangle rect = new Rectangle();

        rect.setWidth(1280);
        rect.setHeight(1280);

        rect.setFill(Color.rgb(0, 0, 0, 0.19));
        Rectangle r = new Rectangle();

        r.setWidth(400);
        r.setHeight(300);
        r.setStroke(Color.WHEAT);
        r.setFill(Color.rgb(255, 255, 255, 0.7));
        r.setArcHeight(30);
        r.setArcWidth(30);

        Text t1 = new Text("LogIn");
        t1.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 50));
        t1.setFill(Color.GOLD);
        t1.setStroke(Color.GRAY);
        Button b1 = new Button("Login");
        Button b2 = new Button("Create account");
        TextField t2 = new TextField();
        t2.setPromptText("your account");
        Text t3 = new Text("Account");
        t3.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        t3.setFill(Color.GOLD);
        t3.setStroke(Color.GRAY);
        PasswordField t4 = new PasswordField();
        t4.setPromptText("password");
        Text t5 = new Text("password");
        t5.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        t5.setFill(Color.GOLD);
        t5.setStroke(Color.GRAY);
        b1.setStyle("-fx-background-color: gray;-fx-text-fill:gold;");

        b2.setStyle("-fx-background-color: gray;-fx-text-fill:gold;");
        GridPane r1 = new GridPane();
        r1.add(t3, 1, 0);
        r1.add(t2, 2, 0);
        r1.add(t5, 1, 1);
        r1.add(t4, 2, 1);
        r1.add(b1, 1, 2);
        r1.add(b2, 2, 2);
        r1.setVgap(20);
        r1.setHgap(10);

        r1.setAlignment(Pos.CENTER);
        VBox v1 = new VBox(t1, r1);
        v1.setMargin(t1, new Insets(0, 0, 50, 0));
        v1.setAlignment(Pos.CENTER);
         Alert a=new Alert(Alert.AlertType.ERROR);

        v1.setFillWidth(true);
        //===========================================================================================================================
        b2.setOnAction(e -> {
            try {
                CreateAcount creat=new CreateAcount();
                 creat.start(new Stage());
                Stage.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         b1.setOnAction(e -> {
             String userName=t2.getText();
             String password=t4.getText();
             
             String sql="select * from SINUP where USER_NAME=? and PASSWORD = ?";
             coun =DB.DBConnection();
            try {
                pst=coun.prepareStatement(sql);
                pst.setString(2,password);
                pst.setString(1,userName);
                res=pst.executeQuery();
                pst.executeUpdate();
                if(pst.executeUpdate()==0){
                    a.setContentText("error in the data");
                    a.show();
                }else{
                    
                   
                    pst.close();;
                    coun.close();
                    try {
                        new add().start(new Stage());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                    }
                Stage.close();
                }    
                
            } catch (SQLException ex) {
                Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        });

//
//      StackPane sroot = new StackPane();
//        sroot.getChildren().add(imageView);
//        sroot.getChildren().add(rect);
//        sroot.getChildren().add(rec);
//
//
//
//        sroot.getChildren().add(sv1);
//        sroot.getChildren().add(sr2);
//
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        root.getChildren().add(r);
        root.getChildren().add(rect);

        root.getChildren().add(v1);

        Scene scene = new Scene(root, Double.MAX_VALUE, Double.MAX_VALUE);
        scene.getStylesheets()
                .add(this.getClass().getResource("style.css").toExternalForm());
//         root.setStyle("-fx-background-image:url('D:\\study\\207\\project\\src\\project\\back.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 500 500; -fx-background-position: center center;");
        Stage.setTitle("login");
        Stage.setScene(scene);
        Stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
