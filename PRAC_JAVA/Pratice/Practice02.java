import java.util.*;

abstract class Vehicle{
	protected int speed;
	public void printSpeed(){
		System.out.println("현재속도 : " + speed);
	}
	public abstract double getKilosPerLiter();
}

class Car extends Vehicle{
	public double getKilosPerLiter(){
		return 4.25;
	}
	
}
class Practice02{
	public static void main(String [] args){
		Vehicle v = new Car();
		v.printSpeed();
		System.out.println(v.getKilosPerLiter());
	}	
}
