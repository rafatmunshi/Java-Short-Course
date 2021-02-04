
public class Interfaces {
	public static void main(String[] args) {
		Mercedes m = new Mercedes();
		m.stop();
	}
}

interface Vehicle3 {
	void start();

	void stop();

	void isWorking();

	default void defaultMethod() {
		System.out.println("a default method");
	}

	static int squareOf(int x) {
		System.out.println(x*x);
		return x*x;
	}
}

interface Car1 {
	void drive();
}

class Mercedes implements Car1, Vehicle3 {

	@Override
	public void start() {
		defaultMethod();
	}

	@Override
	public void stop() {
		Vehicle3.squareOf(3);
	}

	@Override
	public void isWorking() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

}