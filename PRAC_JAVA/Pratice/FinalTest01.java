import java.util.*;

class A{
	public void pro(){
		System.out.println("A의 pro입니다");
	}
}

class B extends A{
	public void pro(){
		System.out.println("B의 pro입니다");
	}
}

class FinalTest01{
	public static void main(String [] args){
		B ob = new B();
		ob.pro();
	}
}
