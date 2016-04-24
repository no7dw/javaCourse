import com.wade.thread.ReqHandler;

import java.net.*;
import java.io.*;

public class SimpleThreadServer {
    public static void main(String[] args)  {
         
        try {
            ServerSocket listener = new ServerSocket(8080);                 
            while (true) {
                Socket socket = listener.accept();
                System.out.println("new coming");//why print 3 times
                try {
                    ReqHandler.handleRequest(socket);
                } catch (IOException e) {
                    listener.close(); 
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
            
    }

}