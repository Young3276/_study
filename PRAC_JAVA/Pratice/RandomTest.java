import java.util.*;

class RandomTest{
	public static void main(String [] args) throws InterruptedException{
		Random r =new Random();
		int n;
		for(int i=0; i<100000; i++){
			n=r.nextInt();
			System.out.println("n : " + n);
			Thread.sleep(500);
		}
	}
}
