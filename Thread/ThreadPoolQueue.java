import com.wade.thread.*;

import java.net.*;
import java.io.*;
import java.util.concurrent.*;

// import java.util.concurrent.TimeUnit;
// import java.util.concurrent.ThreadPoolExecutor;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

public class ThreadPoolQueue  {
    public static ExecutorService newBoundedFixedThreadPool(int nThreads,int capacity){
    return new ThreadPoolExecutor(nThreads,
        nThreads,
        0L,
        TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>(capacity),
        new ThreadPoolExecutor.DiscardPolicy());
    }
    public static void boundedThreadPoolServerSocket() throws IOException {
        ServerSocket listener = new ServerSocket(8080);
        ExecutorService executor = newBoundedFixedThreadPool(4, 16);
        try {
            while (true) {
                Socket socket = listener.accept();
                executor.submit(new HandleRequestRunnable(socket));
            }
        } finally {
            listener.close();
        }
    }
    public static void main(String[] args) {
        try{
            boundedThreadPoolServerSocket();    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
