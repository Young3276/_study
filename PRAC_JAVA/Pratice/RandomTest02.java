import java.util.*;

class RandomTest02{
	public static void main(String [] args) throws InterruptedException{
		String []name={"강성구","강한빛","김건우", "김예연", "김주완", "김진수", "김진숙", "김혜민", "박광규", "박창호","박현준","서범석","송기범","오동영",
				"윤성천","윤주용","이민주","장하연","정재형","조새움","조윤주","최은정","황이성","황정민"};
		int i,n;
		for(i=0; i<100; i++){
			System.out.print(name[i%name.length]);
			Thread.sleep(80);
			System.out.print("\b\b\b\r");
		}
		Random r = new Random();
		n=r.nextInt(name.length);
		System.out.println("당첨자 : " + name[n]);
	}
}
