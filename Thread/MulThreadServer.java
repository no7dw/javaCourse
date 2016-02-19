public static class HandleRequestRunnable implements Runnable {

    final Socket socket;

    public HandleRequestRunnable(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            handleRequest(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class MulThreadServer {
    public static void main(String[] args) {
        ServerSocket listener = new ServerSocket(8080);
        try {
            while (true) {
                Socket socket = listener.accept();
                new Thread(new HandleRequestRunnable(socket)).start();
            }
        } finally {
            listener.close();
        }
    }
}