import java.util.*;
import java.util.regex.*;
class StringTest08{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your Email : ");
		String line=sc.next();
	
		//Regix Expression
		//https://tuwlab.com/ece/25809
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[com|net|co.kr]$");
		Matcher m = p.matcher(line);
		if(m.find())
			System.out.println("aaaa");
		else
			System.out.println("bbb");		
/*
		int flag=0;
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i)=='@')
				flag++;
		}
		if(flag==1)
			System.out.println("올바른 이메일");
		else
			System.out.println("이메일 형식이 아님");
*/
	}
}
