import java.util.*;

class StringBufferTest03{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("hello java");
		sb.delete(0,6);
		System.out.println(sb);
	}
}
