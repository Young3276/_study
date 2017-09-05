import java.util.*;

class MatrixTest04{
	public static void main(String [] args){
		String name[]=new String[5];
		String [] subject={"국어", "영어", "수힉"};
		int intTable[][]=new int[5][5];

		Scanner sc=new Scanner(System.in);

		for(int i=0; i<intTable.length; i++){
			System.out.print("Name : ");
			name[i]=sc.nextLine();
			for(int j=0; j<3; j++){
				System.out.print(subject[j]+"점수 입력 : ");
				intTable[i][j]=sc.nextInt();
				sc.nextLine();
				intTable[i][3]+=intTable[i][j];
				intTable[i][4]+=(intTable[i][j]/3);
			}
		}	

		/* OUTPUT DATA */
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		for(int i=0; i<intTable.length; i++){
			System.out.print(name[i]+"\t");
			for(int j=0; j<intTable[i].length; j++){
				System.out.print(intTable[i][j]+"\t");
			}
			System.out.println("");
		}	

	}
}
