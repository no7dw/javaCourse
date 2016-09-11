package actvity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class nameList {
	private ArrayList namelist;
	private String defaultFilePath = "/Users/dengwei/projects/github/javacourse/actvity/src/actvity/name"; 
	public nameList(){
		this.namelist = new ArrayList();
		try{
			this.namelist = this.initFromFile(defaultFilePath);
			System.out.printf("line total :%d\n", this.namelist.size());
			if( 0 == this.namelist.size()){
				this.namelist.add("Momo");
				this.namelist.add("Manty");
				this.namelist.add("Rain");
				this.namelist.add("Shelly");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			this.addOne("Error - Wade");
		}				
	}
	
	public ArrayList<String> getNameList(){
		return this.namelist;
	}
	public void addOne(String name){
		this.namelist.add(name);		
	}
	public void removeOne(String name){
		this.namelist.remove(name);
	}
	private ArrayList<String> initFromFile(String filepath) throws IOException{
		//read
		File file = new File(filepath);
		InputStream in = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(in,Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
		String line ;
		while((line = br.readLine())!= null ){
			this.namelist.add(line);
		}
		br.close();
		//for loop add
		return this.namelist;
	}
	public void SaveList(ArrayList<String> saveList) throws IOException{
		this.namelist = saveList;
		BufferedWriter bw = new BufferedWriter( new FileWriter(defaultFilePath));
		//write to file
		for(int i=0; i< saveList.size(); i++)
			bw.write(saveList.get(i)+"\n");
		bw.close();
	}
}
