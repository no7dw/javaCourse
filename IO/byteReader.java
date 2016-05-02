import java.io.*;
import java.io.FileInputStream;
import java.lang.String;

public class byteReader {
	public static void main(String[] args){
		String file = "/Users/dengwei/hosts";
		try {
			byte[] buffer = new byte[1000];
			FileInputStream inputStream = new FileInputStream(file);
			int total = 0;
			int nRead = 0;
			while ((nRead = inputStream.read(buffer)) != -1) {
				System.out.println(new String(buffer));
				total += nRead;
			}
			inputStream.close();
			System.out.println("read " + total + " bytes" );
		}
		catch(FileNotFoundException fe){
			System.out.println("Not found " + file);
		}
		catch(IOException ioe){
			System.out.println("Err while reading file " + file);
			ioe.printStackTrace();
		}
	}
}