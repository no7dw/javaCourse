import java.io.*;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class byteWriter {
	public static void main(String[] args){
		String file = "/Users/dengwei/hosts1";
		try {
			String bytes = "Hello world";
			byte[] buffer = bytes.getBytes();
			FileOutputStream outputStream = new FileOutputStream(file);
			outputStream.write(buffer);

			outputStream.close();
			System.out.println("wrote " + buffer.length + " bytes");
		}
		catch(IOException ioe){
			System.out.println("Err while writing file " + file);
			ioe.printStackTrace();
		}
	}
}