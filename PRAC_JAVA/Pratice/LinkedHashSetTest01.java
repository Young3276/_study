import java.util.*;


class LinkedHashSetTest01{
	public static void main(String [] args){
		LinkedHashSet set= new LinkedHashSet();
		set.add("돈까스");
		set.add("육회");
		set.add("카레");
		set.add("삼겹살");
		set.add("냉면");
		set.add("시레기국");
		boolean f = set.add("떡볶이");
		boolean g = set.add("시레기국");
		System.out.println(set);
		System.out.println(f);
		System.out.println(g);

		System.out.println("Count : " + set.size());
	}
}
