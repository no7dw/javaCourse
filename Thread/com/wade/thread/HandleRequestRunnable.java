package com.wade.thread;

import com.wade.thread.ReqHandler;
import java.io.*;
import java.net.*;

public class HandleRequestRunnable implements Runnable {

 final Socket socket;

 public HandleRequestRunnable(Socket socket) {
   this.socket = socket;
 }

 public void run() {
   try {
     ReqHandler.handleRequest(socket);
   } catch (IOException e) {
     e.printStackTrace();
   }
 }
}