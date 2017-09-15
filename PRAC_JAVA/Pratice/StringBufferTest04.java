import java.util.*;

class StringBufferTest04{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb=new StringBuffer(sc.next());
		String str=sb.reverse().toString();
		char []b=sb.reverse().toString().toCharArray();
		System.out.println(str);
		System.out.println(b[0]);

	}
}
