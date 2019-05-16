package Ex_2;

import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Client extends Application {
    // IO streams
    DataOutputStream toServer = null;
    DataInputStream fromServer = null;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
// Panel p to hold the label and text field
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a radius: "));
        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);
        BorderPane mainPane = new BorderPane();
// Text area to display contents
        TextArea ta = new TextArea();
        mainPane.setCenter(new ScrollPane(ta));
        mainPane.setTop(paneForTextField);
// Create a scene and place it in the stage
        Scene scene = new Scene(mainPane, 450, 200);
        primaryStage.setTitle("Client"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        tf.setOnAction(e -> {
            try {
// Get the radius from the text field
                double radius = Double.parseDouble(tf.getText().trim());
// Send the radius to the server
                toServer.writeDouble(radius);
                toServer.flush();
// Get area from the server
                double number = fromServer.readDouble();
                System.out.println(number);

                if(number==0){

                    ta.appendText("true"
                            + '\n');
                }else{
                    if(number==-1){
                        ta.appendText("baga"
                                + '\n');
                    }else{
                        ta.appendText("ih"
                                 +'\n');
                    }
                }

            }
            catch (IOException ex) {
                System.err.println(ex);
            }
        });
        try {

            Socket socket = new Socket("localhost", 8001);

            fromServer = new DataInputStream(socket.getInputStream());

            toServer = new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException ex) {
            ta.appendText(ex.toString() + '\n');
        }
    }
}