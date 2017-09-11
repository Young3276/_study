import java.util.*;

class CallByValueTest{
	public static void main(String [] args){
		int junAge=26;
		agePlus(junAge);
		System.out.println("age : " +junAge);
	}

	//나이를 전달받아 1증가한 값을 출력하는 메소드를 정의
	public static void agePlus(int age){
		age++;
		System.out.println("age : "+ age);
	}
}
