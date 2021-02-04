import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DepersistfromDB {
public static void main(String[] args) {
	try {
		ObjectInputStream in= new ObjectInputStream(new FileInputStream("Hello.txt"));
		Student1 s1= (Student1) in.readObject();
		System.out.println(s1.id+" "+s1.name);
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
