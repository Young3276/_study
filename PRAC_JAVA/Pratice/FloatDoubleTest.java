import java.util.*;

class FloatDoubleTest{
	public static void main(String [] args){
		float a = 15.2183791284792183109238178123f;
		double b = 15.12893712984719287410247217040;

		System.out.format("%.2f\n", a);
		System.out.format("%.2f\n", b);

		System.out.format("%.20f\n", a);
		System.out.format("%.20f\n", b);
	}
}
