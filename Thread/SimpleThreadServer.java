import com.wade.thread.ReqHandler;

public class SimpleThreadServer {
    public static void main(String[] args) {
        ServerSocket listener = new ServerSocket(8080);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    ReqHandler.handleRequest(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            listener.close();
        }
    }

}