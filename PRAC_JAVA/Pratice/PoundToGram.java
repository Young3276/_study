import java.util.*;

class PoundToGram{
	public static void main(String [] args){
		double pound;
		double gram;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input your Weight(Pound) : ");
		pound=sc.nextDouble();
		gram=pound*454;
		if(gram>=1000){
			gram=gram/1000;
			System.out.println("your Weight(Gram) : " + gram +"kg");
		}else{
			System.out.println("your Weight(Gram) : " + gram +"g");
		}

	}
}
