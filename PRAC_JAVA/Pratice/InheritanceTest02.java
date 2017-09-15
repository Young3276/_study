import java.util.*;

class Book{
	private String title;
	private int page;
	private String author;

	/* Constructor */
	public Book(String title, int page, String author){
		this.title=title;
		this.page=page;
		this.author=author;
	}
	public Book(){}

	/* getter & setter */
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public int getPage(){
		return this.page;
	}
	public void setPage(int page){
		this.page=page;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
}

class Magazine extends Book{
	private String rlsDate;
	/* Constructor */
	public Magazine(String title, int page, String author, String rlsDate){
		setTitle(title);
		setAuthor(author);
		setPage(page);
		this.rlsDate=rlsDate;
	}
	public Magazine(){

	}
	/* getter & setter */
	public void setRlsDate(String rlsDate){
		this.rlsDate=rlsDate;
	}
	public String getRlsDate(){
		return this.rlsDate;
	}
}		


class InheritanceTest02{
	public static void main(String [] args){
		/* 냉 무 */	
	}
}
