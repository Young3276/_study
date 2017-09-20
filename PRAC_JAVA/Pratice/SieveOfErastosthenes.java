import java.util.*;
class Initial implements Collection{
	public Iterator<Integer> iterator(){

	}
}
class SieveOfErastosthenes{
	public static void main(String [] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		int rst;

		/* Initialized LinkedList */
		for(int i=2; i<=100; i++){
			list.add(i);
		}

		/* Seive */
		int num=2;
		while(num<8){
			for(int i=2*num; i<=100; i+=num){
				list.set(i-2, 0);
			}
			num++;
		}
		
		/* Iterator */
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()){
			rst=it.next();
			if(rst != 0)
			System.out.print(rst+" ");
		}
		System.out.println("");
	}
}
