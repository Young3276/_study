import java.util.*;

class StringTest12{
	public static void main(String [] args){
		String a = new String("hello");
		String b = new String("hello");
		String c = "hello";
		String d = "hello";
		
		if(a == b)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(c==d)
			System.out.println("같음");
		else
			System.out.println("다름");

		if(a.equals(b))
			System.out.println("같음");
		else
			System.out.println("다름");
	}
}
