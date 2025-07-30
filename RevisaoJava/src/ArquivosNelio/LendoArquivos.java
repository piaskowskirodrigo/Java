package ArquivosNelio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Rodrigo\\Documents\\in.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			if(scan != null) {
				scan.close();
			}
		}
	}

}
