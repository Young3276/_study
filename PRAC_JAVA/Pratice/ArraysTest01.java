import java.util.*;

class ArraysTest01{
	public static void main(String [] args){
		String name[]=new String[10];
		Arrays.fill(name,"홍길동");

		Arrays.fill(name,2,6,"임꺽정");		
		for(String n : name){
			System.out.println(n);
		}
	}
}
