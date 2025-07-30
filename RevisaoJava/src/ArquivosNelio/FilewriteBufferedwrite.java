package ArquivosNelio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriteBufferedwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		
		String path = "C:\\Users\\Rodrigo\\Documents\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){//n recria o arquivo, acrescenta
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
