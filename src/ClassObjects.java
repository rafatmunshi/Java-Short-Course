
public class ClassObjects {
// object- entity/instance of the class
	public static void main(String[] args) {
		Vehicle car= new Vehicle();
		car.color= "White";
		car.speed=200;
		System.out.println(car.getColor());
		System.out.println(car.getSpeed());
//		car.start();
//		car.stop();
	}
}

//class Vehicle{
//	// 1. variables- data members
//	// 2. methods- member functions
//	public String color;
//	public Integer speed;
//	//getters and setters
//	public String getColor() {
//		return color;
//	}
//	public Integer getSpeed() {
//		return speed;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public void setSpeed(Integer speed) {
//		this.speed = speed;
//	}
//	public void start(){
//		System.out.println("I am in motion");
//	}
//	public void stop() {
//		System.out.println("I have stopped");
//	}
//}
