import java.io.*;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileWriter {
	public static void main(String[] args){
		String file = "/Users/dengwei/hosts1";
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write("Hello world\n");
			bufferedWriter.write("2016-05-02\n");

			bufferedWriter.close();
		}

		catch(IOException ioe){
			System.out.println("Err while writing file " + file);
			ioe.printStackTrace();
		}
	}
}