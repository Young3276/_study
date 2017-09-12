import java.util.*;

class StringTest10{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		String line=sc.next();
		System.out.println("Id : " + line.substring(0,line.indexOf("@")));
	}
}
