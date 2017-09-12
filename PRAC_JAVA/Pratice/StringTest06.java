import java.util.*;

class StringTest06{
	public static void main(String [] args){
		String line;
		int count=0;
		Scanner sc = new Scanner(System.in);
		line=sc.next();
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i)=='A')
				count++;
		}
		System.out.println("A의 개수 : " + count);
	}
}
