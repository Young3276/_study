import java.util.*;

abstract class Book{
	protected int number;
	protected String title;
	protected String author;

	public abstract double getLateFees(int date);
	public boolean equals(Book ob){
		if(number == ob.getNumber())
			return true;
		else
			return false;
	}

	public Book(){
	}
	public Book(int number, String title, String author){
		this.number=number;
		this.title=title;
		this.author=author;
	}

	public String toString(){
		return number+","+title+","+author;
	}
	public int getNumber(){
		return number;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}

	public void setNumber(int number){
		this.number=number;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}

}

class Novel extends Book{
	public double getLateFees(int date){
		return date*300;
	}
	public Novel(int number, String title, String author){
		super(number,title,author);
	}
	public String toString(){
		return "책종류:Novel, "+super.toString();
	}
}

class Poet extends Book{
	public double getLateFees(int date){
		return date*200;
	}
	public Poet(int number, String title, String author){
		super(number, title, author);
	}
	public String toString(){
		return "책종류:Poet, " + super.toString();
	}
}
class ScienceFiction extends Book{
	public double getLateFees(int date){
		return date*600;
	}
	public ScienceFiction(int number, String title, String author){
		super(number, title, author);
	}
	public String toString(){
		return "책종류:ScienceFiction, "+super.toString();
	}
}
class Practice01{
	public static void main(String [] args){
		Book b1 = new Novel(100, "책제목", "저자");
		Book b2 = new Poet(200, "책제목2", "저자2");
		Book b3 = new ScienceFiction(300, "책제목3", "저자3");
		Novel b4 = new Novel(500, "책제목4", "저자4");
/*
		if(b1.equals(b2)){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
*/
		System.out.println(b1); 
		System.out.println(b2); 
		System.out.println(b3); 
		System.out.println(b4);
	}
} 
