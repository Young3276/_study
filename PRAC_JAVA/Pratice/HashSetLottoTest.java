import java.util.*;

class HashSetLottoTest{
	public static void main(String [] args) throws InterruptedException{
		HashSet lotto = new HashSet();
		Random r = new Random();
		
		while(true){
			lotto.add(r.nextInt(45)+1);
			if(lotto.size()==7)
				break;
		}
		System.out.println(lotto);
	}
}
