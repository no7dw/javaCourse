public static ExecutorService newBoundedFixedThreadPool(int nThreads,int capacity){
        return new ThreadPoolExecutor(nThreads,nThreads,
        0L,TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>(capacity),
        new ThreadPoolExecutor.DiscardPolicy());
        }

public class ThreadPoolQueue  {
//    public static void main(String[] args) {
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
}
