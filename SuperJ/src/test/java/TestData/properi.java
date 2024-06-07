package TestData;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.IOExceptionList;

public class properi {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
				

		FileReader fr = new FileReader("C:\\Users\\Rajes\\Documents\\SuperJ\\src\\test\\java\\TestData\\DataFile");		
		Properties p = new Properties();
		p.load(fr);
		

	}

	
}
