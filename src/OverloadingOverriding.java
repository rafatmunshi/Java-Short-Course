
public class OverloadingOverriding {
public static void main(String[] args) {
//	A1 a= new A1();
//	Integer d=5;
//	String s= "Some string";
//	a.print(s);
	final double PI= 3.14;
	B1 b= new B1();
//	b.print();
}
}
class A1{
	A1(){
		System.out.println("Constructor A1");
	}
	A1(String s){
		
	}
	A1(Integer i){}
	A1(int a, int ab){
		
	}
	// final methods cannot be overriden
	protected final void print() {
		System.out.println("method print in A1");
	}
	// Overloading
	void print(Integer a) {
		System.out.println("Method with a parameter, integer "+a);
	}
	void print(String s) {
		System.out.println("String method parameter "+s);
	}
}
class B1 extends A1{
	B1(){
		System.out.println("Constructor B1");
	}
	// Overriding
//	public void print() {
//		System.out.println("method print in B1");
//	}
	void anotherm() 
	{
		super.print();
	}
}