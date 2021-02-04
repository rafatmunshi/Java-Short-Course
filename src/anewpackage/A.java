package anewpackage;

public class A {
	private Integer x;
	public void thisisDefault() {
		System.out.println("This is having default access specifier");
	}
	public Integer getX() {
		return x;
	}
	protected void printSomething() {
		System.out.println("This is protected");
	}
}
