import java.util.*;
import java.io.IOException;

class MoumTest02{
	public static void main(String [] args) throws IOException{
		char ch;
		System.out.print("소문자를 입력하시오 : ");
		ch=(char)System.in.read();
		if(ch<97 || ch>122){
			System.out.println("소문자를 입력하시오");
			return;
		}
		if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)
			System.out.println("모음입니다");
		else
			System.out.println("자음입니다");
	}
}
