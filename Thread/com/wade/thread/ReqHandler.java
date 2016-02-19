final static String response=
        “HTTP/1.0 200OK/r/n” +
        “Content-type:text/plain/r/n” +
        “/r/n” +
        “Hello World/r/n”;

public static void handleRequest(Socket socket)throws IOException{
        // Read the input stream, and return “200 OK”
        try{
        BufferedReader in=new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
        log.info(in.readLine());

        OutputStream out=socket.getOutputStream();
        out.write(response.getBytes(StandardCharsets.UTF_8));
        }finally{
        socket.close();
        }
        }