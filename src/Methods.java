
public class Methods {
	public static int sum(int a, int [] b) {
		int sum= a+b[0];
		a=5;
		b[0]=4;
		return sum;
	}
	public static void announce() {
		System.out.println("announcement");
	}
public static void main(String[] args) {
	int a=2;
	int b[]= {3};
	System.out.println(sum(a, b));
	System.out.println(b[0]);
//	announce();
//	System.out.println(sum(4, 5));
	
}
}
