import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistinDB {
public static void main(String[] args) {
	Student1 s1= new Student1(1, "Student1");
	try {
		FileOutputStream fout= new FileOutputStream("Hello.txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("Object serialisation successful");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
