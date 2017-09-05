import java.util.*;

class Sales{
	public static void main(String [] args){
		int sales[][]=new int[5][4];
		Scanner sc = new Scanner(System.in);

		/* INPUT DATA */
		for(int i=0; i<sales.length; i++){
			for(int j=0; j<sales[i].length; j++){
				System.out.print((i+1)+"부서의"+(j+1)+"분기 매출액");
				sales[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		/* 분기별 부서별 매출액 출력 */
		Function1(sales);		
		System.out.println("");		
		/* 분기별 회사전체 매출액 */
		Function2(sales);
		System.out.println("");
		/* 분기별 회사전체의 평균 매출액 */
		Function3(sales);
		System.out.println("");
		/* 특정분기에 최고의 매출을 올린 부서 출력 */
		Function4(sales);
		System.out.println("");
	}

	public static void Function1(int sales[][]){
		int sum[]=new int[5];
		System.out.println("**** 분기별 부서별 매출액 ****");
		System.out.println("\t1분기\t2분기\t3분기\t4분기");
		/* OUTPUT DATA */
		for(int i=0; i<sales.length; i++){
			System.out.print((i+1)+"부서\t");
			for(int j=0; j<sales[i].length; j++){
				System.out.print(sales[i][j]+"\t");
			}
			System.out.println("");
		}
/*
		for(int i=0; i<sales.length; i++){
			for(int j=0; j<sales[i].length; j++){
				sum[i]+=sales[i][j];
			}
		}
		for(int i=0; i<sum.length; i++){
			System.out.print(sum[i]+"\t");
		}
*/
		System.out.println("");
	}

	public static void Function2(int sales[][]){
		int sum[]=new int[4];
		System.out.println("**** 회사 분기별 매출액 ****");
		System.out.println("1분기\t2분기\t3분기\t4분기");
		for(int i=0; i<sales.length; i++){
			for(int j=0; j<sales[i].length; j++){
				sum[j]+=sales[i][j];
			}
		}
		for(int i=0; i<sum.length; i++){
			System.out.print(sum[i]+"\t");
		}
		System.out.println("");
	}

	public static void Function3(int sales[][]){
                int avg[]=new int[4];
                System.out.println("**** 회사 분기별 평균매출액 ****");
                System.out.println("1분기\t2분기\t3분기\t4분기");
                for(int i=0; i<sales.length; i++){
                        for(int j=0; j<sales[i].length; j++){
                                avg[j]+=(sales[i][j]/5);
                        }
                }
                for(int i=0; i<avg.length; i++){
                        System.out.print(avg[i]+"\t");
                }
                System.out.println("");
	}
	public static void Function4(int sales[][]){
		int dept=0;
		int num;
		Scanner sc=new Scanner(System.in);
                System.out.println("**** 특정분기 판매최고 부서 ****");
		System.out.print("분기 입력 : ");
		num=sc.nextInt();
		if(num<1 || num>4){
			System.out.println("Input Error!");
			return;
		}
		num--;
		for(int i=0; i<sales.length; i++){
			if(sales[dept][num] <sales[i][num])
				dept=i;
		}
		System.out.print(num+1+"분기의 최고판매 부서 : ");
		System.out.println((dept+1)+"부서");
	}
}
