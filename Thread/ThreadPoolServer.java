import com.wade.thread.*;

import java.net.*;
// import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolServer {
    public static void main(String[] args) {
        try{
            ServerSocket listener = new ServerSocket(8080);
            ExecutorService executor = Executors.newFixedThreadPool(4);
            try {
                while (true) {
                    Socket socket = listener.accept();
                    executor.submit(new HandleRequestRunnable(socket));
                }
            } finally {
                listener.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}