class Movie{
	private String title;
	private String director;
	private String company;
	/* 
		Point> 생성자가 하나라도 있을경우, 자동으로 생성되는 생성자는 없다
		Point> 생성자는 상속되지 않는다. 오버라이딩 대상이 될수도 없다
		Point> 따라서 생성자는 메소드가 아니다
	*/
	public Movie(){
		this.title="a";
		this.director="b";
		this.company="c";
	}	

	public Movie(String title, String director, String company){
		this.title=title;
		this.director=director;
		this.company=company;
	}
	public String getTitle(){
		return title;
	}
	public String getDirector(){
		return director;
	}
	public String getCompany(){
		return company;
	}
}

class MovieTest{
	public static void main(String [] args){
		Movie m1 = new Movie();
		Movie m2 = new Movie("aaaa","bb","cc");
		System.out.println(m2.getTitle());
		System.out.println(m2.getDirector());
		System.out.println(m2.getCompany());
	}
}
