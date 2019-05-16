package Ex_2;

import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MultiThreadServer extends Application {
    // Text area for displaying contents
    private TextArea ta = new TextArea();
    // Number a client
    private int clientNo = 0;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
// Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        primaryStage.setTitle("MultiThreadServer"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        new Thread( () -> {
            try {

                ServerSocket serverSocket = new ServerSocket(8001);
                ta.appendText("MultiThreadServer started at "
                        + new Date() + '\n');
                while (true) {

                    Socket socket = serverSocket.accept();

                    clientNo++;
                    Platform.runLater( () -> {

                        ta.appendText("Starting thread for client " + clientNo +
                                " at " + new Date() + '\n');

                        InetAddress inetAddress = socket.getInetAddress();
                        ta.appendText("Client " + clientNo + "'s host name is "
                                + inetAddress.getHostName() + "\n");
                        ta.appendText("Client " + clientNo + "'s IP Address is "
                                + inetAddress.getHostAddress() + "\n");
                    });
// Create and start a new thread for the connection
                    new Thread(new HandleAClient(socket)).start();
                }
            }
            catch(IOException ex) {
                System.err.println(ex);
            }
        }).start();
    }
    // Define the thread class for handling new connection
    class HandleAClient implements Runnable {
        private Socket socket; // A connected socket
        /** Construct a thread */
        public HandleAClient(Socket socket) {
            this.socket = socket;
        }
        /** Run a thread */
        public void run() {
            try {
                DataInputStream inputFromClient = new DataInputStream(
                        socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(
                        socket.getOutputStream());

                while (true) {
                    double number = inputFromClient.readDouble();

                    if(20.0==number){
                        outputToClient.writeDouble(0.0);
                        Platform.runLater(() -> {
                            ta.appendText("number received from client: " +
                                    number + '\n');
                            ta.appendText("number found: " + number + '\n');

                        });
                    }else {
                        if(number<20){
                            outputToClient.writeDouble(-1.0);
                            Platform.runLater(() -> {
                                ta.appendText("number received from client: " +
                                        number + '\n');
                                ta.appendText("baga " + number + '\n');
                            });
                        }else {
                            outputToClient.writeDouble(1.0);
                            Platform.runLater(() -> {
                                ta.appendText("number received from client: " +
                                        number + '\n');
                                ta.appendText("ih " + number + '\n');
                            });
                        }

                    }

                }
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//31.3 31.5






