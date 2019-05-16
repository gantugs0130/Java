package Ex_3;

import java.io.*;
import java.net.Socket;
public class MathClient {
    public static void main(String [] args){
        String hostname = "10.3.132.172";
        int port = 10000;
        if (args.length != 2) {
            System.out.println("Use the default setting...");
        }
        else {hostname = args[0];
            port = Integer.parseInt(args[1]);
        }
        try {
            // create a socket
            Socket socket = new Socket(hostname, port);
            // perform a simple math operation “12+21”
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            writer.write("+:12:21");
            writer.newLine();
            writer.flush();
            // get the result from the server
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
            reader.close();
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}