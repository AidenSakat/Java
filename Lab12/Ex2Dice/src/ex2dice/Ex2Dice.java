/*************************************************************************
Cuyamaca College CS-182
File name: Ex2Dice.java
Description: Lab #12, Exercise #2, the application should generate two random numbers, each in the range of 1 through 6, to represent the value of the dice.
total of all three amounts.
Developer: Aiden Sakat
*************************************************************************/
package ex2dice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Ex2Dice extends Application {
    
    @Override
    public void start(Stage primaryStage) 
       throws MalformedURLException, FileNotFoundException {
               
       Image d1Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die1.png"));
       Image d2Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die2.png"));
       Image d3Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die3.png"));
       Image d4Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die4.png"));
       Image d5Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die5.png"));
       Image d6Image = new Image (new FileInputStream("C:\\Labs\\Dice\\Die6.png"));

       ArrayList<Image> imageList = new ArrayList<Image>();
       
       imageList.add(d1Image);
       imageList.add(d2Image);
       imageList.add(d3Image);
       imageList.add(d4Image);
       imageList.add(d5Image);
       imageList.add(d6Image);
       
       ImageView leftDieIV = new ImageView();
       ImageView rightDieIV = new ImageView();
       leftDieIV.setFitWidth(200);
       leftDieIV.setFitHeight(200);
       rightDieIV.setFitWidth(200);
       rightDieIV.setFitHeight(200);
       HBox ivHBox = new HBox(10, leftDieIV, rightDieIV);
       
       Button tossButton = new Button("Toss");
       
       tossButton.setOnAction(e ->
       {
           Random rand = new Random();
           
           leftDieIV.setImage(imageList.get(rand.nextInt(imageList.size())));
           
           rightDieIV.setImage(imageList.get(rand.nextInt(imageList.size())));

       });

            VBox mainVBox = new VBox(10,ivHBox, tossButton);
            mainVBox.setAlignment(Pos.CENTER);
            mainVBox.setPadding(new Insets(10));
            
            Scene scene = new Scene(mainVBox);
            
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
    


