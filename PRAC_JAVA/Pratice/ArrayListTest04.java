import java.util.*;

/* Comparator Redefined */
class Descending implements Comparator<Double>{
//	@Override
	public int compare(Double o1, Double o2){
		if(o1<o2)
			return 1;
		else if(o1==o2)
			return 0;
		else
			return -1;
	}
}

class ArrayListTest04{
	public static void main(String [] args){
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		/* Input Data */
		for(int i=0; i<10; i++){
			System.out.print("Input Score : " );
			list.add(new Double(sc.nextDouble()));
		}

		/* Max Score Delete */
		list.remove(selectMax(list));

		/* Min Score Delete */
		list.remove(selectMin(list));

		/* Score Sum */
		System.out.println("Sum : " + calSum(list));

		/* Sort1 - HowTo1*/
		Descending d1 = new Descending();
		list.sort(d1);

		/* Sort2 - HowTo2 */
//		Collections.reverse(list);

		/* Output */
		System.out.println(list);
	}


	public static int selectMax(ArrayList<Double> list){
		int idx=0;
		for(int i=1; i<list.size(); i++){
			if(list.get(idx)<list.get(i))
				idx=i;	
		}
		return idx;
	}

	public static int selectMin(ArrayList<Double> list){
		int idx=0;
		for(int i=1; i<list.size(); i++){
			if(list.get(idx)>list.get(i))
				idx=i;	
		}
		return idx;
	}
	
	public static double calSum(ArrayList<Double> list){
		double sum=0;
		for(int i=0; i<list.size(); i++)
			sum+=list.get(i);
		return sum;
	}
}
