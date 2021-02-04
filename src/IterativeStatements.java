
public class IterativeStatements {
public static void main(String[] args) {
//	// initialisation
//	int a=3;
//	//condition checking
//	while(a>0) {
//		System.out.println("a is greater than 0");
//		//updation
//		a--;
//	}
//	for(int a=9, b=4; a>0&&b>0; a--, b--) 
//		System.out.println("a is greater than 0");
// do while loop
//	do {
//		System.out.println("runs atleast once, this is post test loop");
//		a--;
//	} while(a>0);
	//enhanced for loop, for in loop
	String a []= {"Yourname", "Hello", "World" };
	label1:
	for(String temp: a) {

		System.out.println(temp);
		for (int i=0; i<3; i++) {
			System.out.println("This is nested loop running");
//			continue label1;
		}
		if(temp=="Hello")
			return;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
