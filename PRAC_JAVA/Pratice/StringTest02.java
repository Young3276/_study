import java.util.*;

class StringTest02{
	public static void main(String [] args){
		String str=new String("hello java hello 2017");
		char ch=str.charAt(17);
		System.out.println((int)ch);
		str=ch+"";
		System.out.println(Integer.parseInt(str)+10);
/*
		System.out.println(str.charAt(0));
		System.out.println(str.concat(" melong"));

		System.out.println(str.hashCode());
		System.out.println(str.toUpperCase());	
*/
	}
}
