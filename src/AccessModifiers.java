
public class AccessModifiers {
public static void main(String[] args) {
//	A a= new A();
//	System.out.println(a.x);
	B b= new B();
	b.printSomething();
//	b.printSomething();
}
}
class A{
	private Integer x;

	public Integer getX() {
		return x;
	}
	protected void printSomething() {
		System.out.println("This is protected");
	}
}
class B extends A{
	Integer y;
	public void getx() {
		System.out.println(getX());
		printSomething();
	}
}