
public class Polymorphism {
public static void main(String[] args) {
	Shape s= new Shape();
//	s.print(5, 3);
	Circle c= new Circle();
//	c.print();
	// upcasting
	Shape s1= new Circle();
//	s1.print();
	Rectangle r= new Rectangle();
//	shapeChecker(r);
	// downcasting
//	Shape s2= someMethodWhichReturnsASpecificShape(); // We dont know what shape it is returning
//	if(s2 instanceof Circle) {
//	Circle c2 = (Circle) s2;
//	c2.print();
//	}
//	if(s2 instanceof Rectangle) {
//		Rectangle r1 = (Rectangle) s2;
//		r1.print();
//	}
}
public static void shapeChecker(Shape shape){
	 shape.print();
}
}
class Shape{

	protected void print() {
		System.out.println("method print in Shape");
	}
	// Overloading
	void print(Integer a) {
		System.out.println("Method with a parameter, integer "+a);
	}
	void print(String s) {
		System.out.println("String method parameter "+s);
	}
}
class Circle extends Shape{
//	Circle(){
//		System.out.println("Constructor Circle");
//	}
	// Overriding
	public void print() {
		System.out.println("method print in Circle");
	}
	void anotherm() 
	{
		super.print();
	}
}
class Rectangle extends Shape{
	public void print() {
		System.out.println("method print in Rectangle");
	}
}