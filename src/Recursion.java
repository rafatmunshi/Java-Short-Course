
public class Recursion {
	public static void recursive(int a) {
		a--;
		System.out.println(a);
		if(a>0)
		recursive(a);
	}
public static void main(String[] args) {
	int a=3;
	recursive(a);
	//...
}
}
