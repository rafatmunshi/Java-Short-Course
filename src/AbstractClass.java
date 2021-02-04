
public class AbstractClass {
	public static void main(String[] args) {
//		Vehicle2 v= new Vehicle2();
		Bike b= new Bike();
		b.start();
	}
}
// abstract class cannot be instantiated
abstract class Vehicle2 {
	abstract void start();
	void ride() {
		System.out.println("Riding the bike");
	}
//	abstract void stop();
//	abstract void isWorking();
}

class Bike extends Vehicle2 {
	void start() {
		ride();
	}
	void ride() {
		System.out.println("Riding the bike");
	}
}
