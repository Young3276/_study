import java.util.*;
import java.io.IOException;

class MoumTest{
	public static void main(String [] args) throws IOException{
		System.out.print("문자를 입력하세요: ");
		char c = (char) System.in.read();

		switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.printf("입력된 문자 %c는 모음입니다\n", c);
				break;
			default:
				System.out.printf("입력된 문자 %c는 자음입니다\n", c);
				break;
		}
	}
}
