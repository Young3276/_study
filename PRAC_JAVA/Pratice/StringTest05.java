import java.util.*;

class StringTest05{
	public static void main(String [] args){
		String line;
		int count=0;
		Scanner sc = new Scanner(System.in);
		line = sc.next();
		//System.out.println(line);
		char [] arr=line.toCharArray();
//		System.out.println(arr[0]);
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='A')
				count++;
		}
		System.out.println("A의 개수는 : " + count);
	}
}	
