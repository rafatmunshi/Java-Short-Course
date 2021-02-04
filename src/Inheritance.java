
public class Inheritance {
public static void main(String[] args) {
	Car mercedes= new Car();
	mercedes.model="Mercedes-Benz";
	mercedes.color= "Black";
	mercedes.speed= 300;
	mercedes.drive();
	System.out.println("Driving at speed- "+mercedes.getSpeed());
	System.out.println(Car.vehicleCount);
}
}
//car, bike, train, boat... (color, speed, ....) Vehicle
// is a relationship 
// extends
class Vehicle {
	public String color;
	public Integer speed;
	public static Integer vehicleCount=0;
	public int x=0;
	Vehicle(){
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
}

class Car extends Vehicle{
	public String model;
	public int x=1;
	Car(){
		super.vehicleCount++;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void drive() {
		System.out.println("I am driving the car. X is  "+ super.x);
	}
}

// class bike extends Vehicle. ride()
// class boat extends Vehicle. sail()
// class train extends Vehicle. pullout() pullin()