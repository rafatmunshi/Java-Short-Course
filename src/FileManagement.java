import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
// System.out
// System.in 
// System.err 

	public static void main(String[] args) {
//		File dir = new File("test");
//		dir.mkdirs();
		File file1 = new File("Hello.txt");
//			file1.createNewFile();
//			boolean exists = file1.exists();
//			if (exists == true) {
//				System.out.println("Can be executed? "+file1.canExecute());
//				System.out.println("Can be read? "+file1.canRead());
//				System.out.println("Can be write? "+file1.canWrite());
//				file1.setWritable(false);
//				System.out.println("Can be write? "+file1.canWrite());
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
				bw.write("This is a test file writing");
				bw.newLine();
				bw.write("Writing complete");
				bw.newLine();
				System.out.println("Writing to file is done successfully");
			} catch (IOException e) {
				System.out.println("Writing to file is unsuccessful");
				e.printStackTrace();
			}
//			}
			
			try {
				BufferedReader br= new BufferedReader(new FileReader(file1));
				String contents;
				while((contents=br.readLine()) !=null) {
					System.out.println(contents);
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Scanner sc= new Scanner(file1);
				String contents;
				while(sc.hasNext()) {
					contents= sc.nextLine();
					System.out.println(contents);
				}
				sc.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(file1.delete()) {
				System.out.println("File is deleted successfully");
			}
			else
			{
				System.out.println("Error while deleting");
			}

	}
}
