import java.util.*;

class StringBufferTest02{
	public static void main(String [] args){
		String str[]={
			"insert ",
			"into ",
			"member ",
			"values ",
			"(",
			"'tiger',",
			"20,",
			"'서울',",
			"'010-1234-5678'",
			")"
		};
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<str.length; i++){
			sb.append(str[i]);
		}
		System.out.println(sb);
	}
}
