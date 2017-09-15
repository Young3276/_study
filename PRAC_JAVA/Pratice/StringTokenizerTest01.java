import java.util.*;

class StringTokenizerTest01{
	public static void main(String [] args){
		String name="조새움, 김진숙, 강한빛, 강성구, 송기범, 황이성";
		StringTokenizer st = new StringTokenizer(name, ",");
		int count=st.countTokens();
		System.out.println("Count : " + count);

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken().trim());
		}
	}
}
