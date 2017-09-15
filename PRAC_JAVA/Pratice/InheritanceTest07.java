class A{
	String title;
	public A(){
		System.out.println("A의 생성자");
	}
}

class B extends A{
	int year;
	public B(String title, int year){
		//super();
		this.title=title;
		this.year=year;
	}
	public B(){
	}
	public void info(){
		System.out.println(title+", " + year);
	}
}

class InheritanceTest07{
	public static void main(String [] args){
		B ob = new B("Hello", 2017);
		
	}
}
