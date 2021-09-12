package day35_encapsulation;

public class C02_Book {
	/*
	 * TODO Book class'ı verilmiştir. İki tane attributes oluşturunuz. bookName ve
	 * authorName (String ile) Book class'ını kapsülleyin. (Encapsulate) Main
	 * class'ın içine object oluşturun ve sonucu yazdırınız.
	 * 
	 * todo "Book name is BOOKNAME and Author is AUTHORNAME"
	 */
	private String bookname;
	private String authorName;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}
