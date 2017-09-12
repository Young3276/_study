import java.util.*;

class Family
{
	String name;
	int age;
	public Family(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	static void pro(){
		System.out.println(addr);
	}
	static String addr;
}

class FamilyTest
{
	public static void main(String []args)
	{
		
		/*Family.name = "홍길동";
		FamilyTest.java:19: error: non-static variable name cannot be referenced from a static context
                Family.name = "홍길동";
				
				static 맴버만이 클래스명으로 접근할 수있다!!!!!!!
				
		*/
		Family.addr = "서울시 마포구 신수동";
		Family.pro();		
/*
		Family f1 = new Family("김진수",26);
		Family f2 = new Family("김진숙",24);
		
		System.out.println(f1.name);
		System.out.println(f2.name);
		
		System.out.println(f1.addr);
		System.out.println(f2.addr);
		
		f1.addr = "서울시 강남구 서초동";
		System.out.println(f1.addr);
		System.out.println(f2.addr);
		
		System.out.println(Family.addr);
*/		
	}
}






















