import java.util.Optional;

public class OptionalUse {
public static void main(String[] args) {
	String user[]= new String[5];
	Optional<String> empty= Optional.empty();
//	System.out.println(empty.isPresent());
	String name="name1";
//	Optional<String> name1= Optional.of(name);
	String name1= (String) Optional.ofNullable(null).orElse("null"); //orElseGet(()->"null")
//	if(name1.isPresent()) { //  or use isEmpty
//		String valueofOptional=name1.get();
		System.out.println(name1);
//	}
//	else {
//		System.out.println("null");
//	}
//	System.out.println(name1);
//	if(user[2]!=null)
//	System.out.println(user[2].charAt(0));
}
}
