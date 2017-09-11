import java.util.*;

class Point{
	private int x;
	private int y;

	public void setY(int yCoord){
		y=yCoord;
	}
	public void setX(int xCoord){
		x=xCoord;
	}
}

class PointTest{
	public static void main(String []args){
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
	}
}
