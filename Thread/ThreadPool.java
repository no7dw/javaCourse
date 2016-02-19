
public class ThreadPoolServer {
    public static void main(String[] args) {
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
}