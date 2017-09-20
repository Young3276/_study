import java.util.*;

class Student{
	private String name;
	private String addr;
	private String tel;
	public Student(String name, String addr, String tel){
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}
	public Student(String name){
		this.name=name;
	}
	public Student(){};
	public String getName(){return this.name;}
	public String getAddr(){return this.addr;}
	public String getTel(){return this.tel;}
	public String toString(){return "name : " + name;}
	public String getInfo(){return "name : " + name + "\naddr : " + addr + "\ntel : " +tel;}
}

class ArrayListTest03{
	public static void main(String [] args){
		ArrayList<Student> list= new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int flag;
		boolean swit=true;
		String name, addr, tel;
		while(swit){
			System.out.println("********Menu********");
			System.out.println("1.추가  2.검색  3.삭제  4.종료");
			System.out.print("Input Number : " );
			flag=sc.nextInt();
			if(flag<1 && flag>4){
				System.out.println("Input Error!");
			}
			switch(flag){
				case 1:	//추가
					list.add(plusStudent());
					System.out.println(list);
					break;
				case 2:	//검색
					System.out.print("Input name : " );
					name=sc.next();
					Student s1 = list.get(searchStudentName(list, name));
					System.out.println("********Info**********");
					System.out.println(s1.getInfo());
					break;
				case 3:	//삭제
					System.out.print("Input name : ");
					name=sc.next();
					int temp=searchStudentName(list,name);
					if(temp ==-1)
						System.out.println("학생 없음");
					else
						list.remove(temp);
					System.out.println(list);
					break;
				case 4:	//종료
					swit=false;
					break;
			}		
		}
	}
	public static Student plusStudent(){
		String name, addr, tel;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Name : " );
		name=sc.next();
		System.out.print("Input Addr : ");
		addr=sc.next();
		System.out.print("Input Tel : ");
		tel=sc.next();
		return new Student(name, addr, tel);	
	}
	public static int searchStudentName(ArrayList<Student> list, String name){
		Student s1;
		int i;
		boolean flag=true;
		for(i=0; i<list.size(); i++){
			s1=list.get(i);
			if(name.equals(s1.getName())){
				flag=true;
				break;
			}
		}
		if(flag==true)
			return i;
		else
			return -1;
	}
}
