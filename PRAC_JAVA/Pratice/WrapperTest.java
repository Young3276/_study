import java.util.*;

class WrapperTest{
	public static void main(String [] args){
		Vector v = new Vector();
		int age=20;
		double height=175.7;
		/* Old Version */
//		v.add(new Integer(age));
//		v.add(new Double(height));
		v.add(age);
		v.add(height);
		System.out.println(v);
		
	}
}
