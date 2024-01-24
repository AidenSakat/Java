/*************************************************************************
Cuyamaca College CS-182
File name: Ex1TaxTipTotal.java
Description: Lab #12, Exercise #1, Write a program that lets the user enter the food charge for a meal at a restaurant. When a button is clicked, the
application should calculate and display the amount of an 18 percent tip on the total food charge, 7 percent sales tax, and the
total of all three amounts.
Developer: Aiden Sakat
*************************************************************************/

package ex1taxtiptotal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Ex1TaxTipTotal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create the controls for the meal charge.
        Label chargePrompt = new Label("Meal charge: ");
        TextField chargeTextField = new TextField();;
        HBox chargeHBox = new HBox(10, chargePrompt, chargeTextField);
        chargeHBox.setAlignment(Pos.CENTER);
        
        // Create the tip output labels.
        Label tipDescriptor = new Label("Tip: ");
        Label tipOutputLabel = new Label();
        HBox tipHBox = new HBox(10, tipDescriptor, tipOutputLabel);
        tipHBox.setAlignment(Pos.CENTER_LEFT);
        
        // Create the tax output labels.
        Label taxDescriptor = new Label("Tax: ");
        Label taxOutputLabel = new Label();
        HBox taxHBox = new HBox(10, taxDescriptor, taxOutputLabel);
        taxHBox.setAlignment(Pos.CENTER_LEFT);
        
        // Create the total output labels.
        Label totalDescriptor = new Label("Total: ");
        Label totalOutputLabel = new Label();
        HBox totalHBox = new HBox(10, totalDescriptor, totalOutputLabel);
        totalHBox.setAlignment(Pos.CENTER_LEFT);
        
        // Create the calcButton control.
        Button calcButton = new Button ("Calculate");
        HBox buttonHBox = new HBox (calcButton);
        buttonHBox.setAlignment(Pos.CENTER);
        
        // Register the event handler.
        calcButton.setOnAction (e ->
        {
            // Named constants or tip and tax
            final double TIP = 0.18;
            final double TAX = 0.07;
            
            // Get the meal charge.
            double charge = Double.parseDouble(chargeTextField.getText());
            
            // Calculate the tax, tip, and total.
            double tipAmount = charge * TIP;
            double taxAmount = charge * TAX;
            double totalAmount = tipAmount + taxAmount + charge;
            
            // Display the tax, tip, and total. 
            tipOutputLabel.setText(String.format("%,.2f", tipAmount));
            taxOutputLabel.setText(String.format("%,.2f", taxAmount));
            totalOutputLabel.setText(String.format("%,.2f", totalAmount));
        });
        
        // put everything into a VBox
        VBox mainVBox = new VBox(10, chargeHBox, tipHBox, taxHBox,
        totalHBox, buttonHBox);
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));
        
        // Add the main VBox to a scene
        Scene scene = new Scene(mainVBox);
        
        // Set the scenne to the stage and display it
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
