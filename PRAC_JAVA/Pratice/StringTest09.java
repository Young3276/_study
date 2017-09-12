import java.util.*;

class StringTest09{
	public static void main(String [] args){
		String str="                     Hello Java hello Korea                 ";
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("Java"));
		str=str.trim();
		System.out.println(str);
		System.out.println(str.substring(6,10));
	}
}
