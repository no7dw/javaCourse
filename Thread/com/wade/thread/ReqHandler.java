package com.wade.thread;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ReqHandler {
    //throws IOException
    public static void handleRequest(Socket socket) throws IOException {
        final String response = "HTTP/1.0 200 OK\r\n" + "Content-type:text/plain\r\n" + "\r\n" + "Hello World\r\n";
        // Read the input stream, and return "200 OK"
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // log.info(in.readLine());
            System.out.println("Hello");
            OutputStream out= socket.getOutputStream();
            out.write(response.getBytes(StandardCharsets.UTF_8));
        }
        finally{
            socket.close();
        }
    }
}
