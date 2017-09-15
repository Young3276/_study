import java.util.*;

class ArraysTest04{
	public static void main(String [] args){
		int a[]={33, 9, 13, 26, 39, 8};
		Arrays.sort(a);
/*
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
*/
		/* BinarySearch를 사용할 시, 무조건 정렬 후 사용한다 */
		int idx= Arrays.binarySearch(a, 8);
		System.out.println("idx : " + idx);
		idx=Arrays.binarySearch(a,22);
		System.out.println("idx : " + idx);
	}
}
