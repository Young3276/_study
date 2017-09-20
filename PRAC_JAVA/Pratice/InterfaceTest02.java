import java.util.*;

abstract class Vehicle{
	protected int speed;
	public void printSpeed(){
		System.out.println("현재속도 : " + speed);
	}
	private int seats;	//4, 6
	public abstract double getKilosPerLiter();
	public Vehicle(int seats){
		this.seats=seats;
	}
	public Vehicle(){};
}

interface Movable{
	public void speedUp(int amount);
	public void speedDown(int amount);
}

class Car extends Vehicle implements Movable{
	private String fuelType;	//LPG, 디젤, 휘발유, 전기
	private String gearType;	//자동, 수동
	public void speedUp(int amount){
		speed+=amount;
		System.out.println(amount+"만큼 속도 증가");
	}
	public void speedDown(int amount){
		speed-=amount;
		System.out.println(amount+"만큼 속도 감소");
	}
	public double getKilosPerLiter(){
		return 13.5;
	}
	public Car(int seats, String fuelType, String gearType){
		super(seats);
		this.fuelType=fuelType;
		this.gearType=gearType;
	}
	public Car(){};
	
}
class InterfaceTest02{
	public static void main(String [] args){
		//Movable c1=new Car(100);		
		Car c1 = new Car(4, "전기", "자동");
		c1.speedUp(100);
		c1.speedUp(200);
		c1.speedDown(50);
		c1.printSpeed();
	}
}
