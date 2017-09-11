import java.util.*;

class CallByValueReference{
	public static void main(Sring [] args){

	}

	//나이가 담긴 1차원 배열을 매개변수로 전달받아
	//모두 1씩 증가하여 출력하는 메소드를 정의
	public static void main(int []arr){
		for(int i=0; i<arr.length; i++){
			arr[i]++;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
