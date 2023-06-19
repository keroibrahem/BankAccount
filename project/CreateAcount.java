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
public class CreateAcount extends Application {

    private Connection coun = null;
    private ResultSet res = null;
    private PreparedStatement pst = null;
    private ObservableList<sinup> data;
    private TableView<sinup> s1;

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
        Rectangle r = new Rectangle();

        r.setWidth(400);
        r.setHeight(500);
        r.setStroke(Color.WHEAT);
        r.setFill(Color.rgb(255, 255, 255, 0.7));
        r.setArcHeight(30);
        r.setArcWidth(30);

        Text st1 = new Text("SignUp");
        st1.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 50));
        st1.setFill(Color.GOLD);
        st1.setStroke(Color.GRAY);

        Button sb1 = new Button("Back");
        Button sb2 = new Button("                   SignUp                    ");
        TextField st2 = new TextField();
        st2.setPromptText("Full Name");
        Text st3 = new Text("Your name");
        st3.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        st3.setFill(Color.GOLD);
        st3.setStroke(Color.GRAY);
        TextField st7 = new TextField();
        st7.setPromptText("Ueser Name");
        Text st6 = new Text("Ueser Name");
        st6.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        st6.setFill(Color.GOLD);
        st6.setStroke(Color.GRAY);
        PasswordField st4 = new PasswordField();
        st4.setPromptText("password");
        Text st5 = new Text("password");
        st5.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        st5.setFill(Color.GOLD);
        st5.setStroke(Color.GRAY);
        TextField st8 = new TextField();
        st8.setPromptText("Number card");
        Text st9 = new Text("Number card");
        st9.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        st9.setFill(Color.GOLD);
        st9.setStroke(Color.GRAY);
        PasswordField st10 = new PasswordField();
        st10.setPromptText("password");
        Text st11 = new Text("password");
        st11.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        st11.setFill(Color.GOLD);
        st11.setStroke(Color.GRAY);

        sb1.setStyle("-fx-background-color: gray;-fx-text-fill:gold;");

        sb2.setStyle("-fx-background-color: gray;-fx-text-fill:gold;");
        GridPane sr1 = new GridPane();
        sr1.add(st3, 1, 0);
        sr1.add(st2, 2, 0);
        sr1.add(st6, 1, 1);
        sr1.add(st7, 2, 1);
        sr1.add(st5, 1, 2);
        sr1.add(st4, 2, 2);
        sr1.add(st9, 1, 3);
        sr1.add(st8, 2, 3);
        sr1.add(st11, 1, 4);
        sr1.add(st10, 2, 4);
        sr1.setVgap(20);
        sr1.setHgap(10);
        sr1.setAlignment(Pos.CENTER);
        VBox sv1 = new VBox(st1, sr1, sb2, sb1);
        sv1.setMargin(st1, new Insets(0, 0, 50, 0));
        sv1.setMargin(sb2, new Insets(50, 0, 0, 0));
        sv1.setMargin(sb1, new Insets(25, 0, 0, 0));
        sv1.setAlignment(Pos.CENTER);

        sv1.setFillWidth(true);
        s1 = new TableView<>();
        //GridPane sr2 = new GridPane(sb1);
        //GridPane sr2 = new GridPane();
        //sr2.add(, 1, 0);
        Alert a=new Alert(Alert.AlertType.ERROR);
        StackPane sroot = new StackPane();

        sroot.getChildren().add(imageView);
        sroot.getChildren().add(rect);
        sroot.getChildren().add(r);

        sroot.getChildren().add(sv1);
        //sroot.getChildren().add(s1);
        //sroot.getChildren().add(sr2);
        sb1.setOnAction(e -> {
            try {
                
                new Project().start(new Stage());
                Stage.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateAcount.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        sb2.setOnAction(e -> {
            
            String name=st2.getText();
                String userName=st7.getText();
                String password=st4.getText();
                String card=st8.getText();
                String passCard=st10.getText();
                String sql="Insert into sinup(user_name,name,password,card,password_card) values(?,?,?,?,?)";
                if(name.isEmpty()&&userName.isEmpty()&&password.isEmpty()&&card.isEmpty()&&passCard.isEmpty()){
                    a.setContentText("complete the data");
                    a.show();
                }else{
                    coun= DB.DBConnection();
                try {
                    pst=coun.prepareStatement(sql);
                    pst.setString(1,userName );
                    pst.setString(2,name);
                    pst.setString(3,password);
                    pst.setString(4,card);
                    pst.setString(5,passCard);
                    int i=pst.executeUpdate();
                    if(i==1){
                        System.out.println("data is inserted");
                        pst.close();
                        coun.close();
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CreateAcount.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            try {
                new Project().start(new Stage());
                Stage.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateAcount.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });

        Scene ss = new Scene(sroot, Double.MAX_VALUE, Double.MAX_VALUE);
        Stage.setTitle("creating account");
        Stage.setScene(ss);
        Stage.show();

//        StackPane root = new StackPane();
//        root.getChildren().add(imageView);
//        root.getChildren().add(r);
//        root.getChildren().add(rect);
//
//        root.getChildren().add(sv1);
//
//        Scene scene = new Scene(root, Double.MAX_VALUE, Double.MAX_VALUE);
//        scene.getStylesheets()
//                .add(this.getClass().getResource("style.css").toExternalForm());
////         root.setStyle("-fx-background-image:url('D:\\study\\207\\project\\src\\project\\back.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 500 500; -fx-background-position: center center;");
//        Stage.setTitle("login");
//        Stage.setScene(scene);
//        Stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
