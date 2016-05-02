import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO{
	public static void main(String[] args){
		String file = "/Users/dengwei/hosts";
		String line = null;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
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