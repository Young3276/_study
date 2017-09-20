import java.util.*;

interface Movable{
//	final int speed=100;
	public abstract void speedUp(int amout);
	public abstract void speedDown(int amout);
}

// Car is a Movable
class Car implements Movable{
	int speed=100;
	public void speedUp(int amount){
		this.speed+=amount;
		System.out.println("속도를 "+amount+"만큼 증가");
	}
	public void speedDown(int amount){
		this.speed-=amount;
		System.out.println("속도를 "+ amount+"만큼 감소");
	}
	public void printSpeed(){
		System.out.println("speed : " + speed);
	}	
	public void turnRight(){
		System.out.println("우회전합니다");
	}
	public void turnLeft(){
		System.out.println("좌회전 합니다");
	}
}
class InterfaceTest01{
	public static void main(String [] args){
		Movable c1 = new Car();
		c1.speedUp(100);
		((Car)c1).turnLeft();
		c1.speedDown(50);
		c1.speedDown(30);
		((Car)c1).printSpeed();
		
	}
}
