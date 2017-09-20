import java.util.*;

class Shape{

}

/* 2차원 도형 정의 */
class TwoDimShape extends Shape{
	protected double area;
	public double getArea(){
		return area;
	}
}

/* 2차원 도형들 */
class Circle extends TwoDimShape{
	private double r;
	private final double pi=3.14;
	public Circle(double r){
		this.r=r;
		this.area=r*r*pi;
	}
}

class Rectangle extends TwoDimShape{
	private double width;
	private double height;
	public Rectangle(double width, double height){
		this.width=width;
		this.height=height;
		this.area=width*height;
	}
}

class Triangle extends TwoDimShape{
	private double width;
	private double height;
	public Triangle(double width, double height){
		this.width=width;
		this.height=height;
		this.area=width*height/2;
	}
}

/* 3차원 도형 정의 */
class ThreeDimShape extends Shape{
	protected double volume;
	public double getVolume(){
		return volume;	
	}
}

/* 3차원 도형들 */
class Shpere extends ThreeDimShape{
	private double r;
	private double pi=3.14;
	public Shpere(double r){
		this.r=r;
		this.volume=pi*r*r*r*4/3;
	}
}

class Cube extends ThreeDimShape{
	private double width;
	private double depth;
	private double height;
	public Cube(double width, double depth, double height){
		this.width=width;
		this.depth=depth;
		this.height=height;
		this.volume=width*depth*height;
	}
}

class Cylinder extends ThreeDimShape{
	private double r;
	private double height;
	private double pi=3.14;
	public Cylinder(double r, double height){
		this.r=r;
		this.volume=r*r*pi*height;
	}
}

class InterfaceTest04{
	public static void main(String [] args){
		Shape sp[]=new Shape[6];
		Shape cube1 =new Cube(3,5,7);
		Shape rec1 = new Rectangle(5,6);
		Shape tri1 = new Triangle(4,5);
		Shape cir1 = new Circle(7);
		Shape shpere1= new Shpere(8);
		Shape cylin1 = new Cylinder(9,10);
		sp[0]=cube1;
		sp[1]=rec1;
		sp[2]=cir1;
		sp[3]=tri1;
		sp[4]=shpere1;
		sp[5]=cylin1;
		for(int i=0; i<sp.length; i++){
			if(sp[i] instanceof ThreeDimShape){
				System.out.println("3차원 도형 : " + ((ThreeDimShape)sp[i]).getVolume());
			}else{
				System.out.println("2차원 도형 : " + ((TwoDimShape)sp[i]).getArea());
			}
		}
	}
}
