import java.io.*;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket client;

        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        try{
            server = new ServerSocket(portnumber);
        }catch (IOException e){
            System.out.println("Cannot open socket." +ie);
            System.exit(1);
        }
        System.out.println("Serversocket is created." +server);

        while (true){
            try{
                System.out.println("Waiting for connect request...");
                client = server.accept();
            }
        }
    }
}