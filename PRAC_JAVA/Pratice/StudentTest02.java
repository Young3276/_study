import java.util.*;

class Student{
	String name;
	int kor, eng, math, tot, avg;
	
}

class StudentTest02{
	public static void main(String [] args){
		//Student s=new Student();	//참조변수는 객체를 생성하고 사용해야 한다.
		Student []s=new Student[5];	//자료형 선언
		/*
			//객체 생성
			Student s[0]=new Student();
			Student s[1]=new Student(); 
		*/
		for(int i=0; i<s.length; i++){
			s[i]=new Student();
		}
		input(s);
		sort(s);
		printStudent(s);			
	}

	public static void input(Student s[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<s.length; i++){
			System.out.print((i+1)+"번째 학생 이름 : ");
			s[i].name=sc.next();
			System.out.print((i+1)+"번째 학생의 국어점수 : ");
			s[i].kor=sc.nextInt();
			System.out.print((i+1)+"번째 학생의 영어점수 : ");
			s[i].eng=sc.nextInt();
			System.out.print((i+1)+"번째 학생의 수학점수 : ");
			s[i].math=sc.nextInt();
			System.out.print((i+1)+"번째 학생의 총점 : ");
			s[i].tot=s[i].kor+s[i].eng+s[i].math;
			System.out.print((i+1)+"번째 학생의 평균 : ");
			s[i].avg=s[i].tot/3;
			//System.out.print
		}
	}

	public static void sort(Student s[]){
		for(int i=0; i<s.length-1; i++){
			for(int j=i+1; j<s.length; j++){
				if(s[i].tot <s[j].tot){
					Student temp;
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	public static void printStudent(Student s[]){
		System.out.println("이름 \t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<s.length; i++){
			System.out.print(s[i].name+"\t");
			System.out.print(s[i].kor+"\t");
			System.out.print(s[i].eng+"\t");
			System.out.print(s[i].math+"\t");
			System.out.print(s[i].tot+"\t");
			System.out.print(s[i].avg+"\t");
			System.out.println();
		}
	}
}
