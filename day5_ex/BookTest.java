package day5_ex;

class Book {
	String title;
	String author;
	int price;

	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	Book() {
//		this.title = "혼자 공부하는 자바";
//		this.author = "신용권";
//		this.price = 24000;
		this("혼자 공부하는 자바", "신용권", 24000);
	}
	
	String getBookInfo() {
		return title + "  " + author + "  " + price;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book();
		Book book1 = new Book("고래", "천명관", 14850);
		Book book2 = new Book("파과", "구병모", 12600);
		Book book3 = new Book("몬테크리스토 백작", "알렉상드르 뒤마", 32400);
		Book book4 = new Book("피로사회", "한병철", 10800);

//		System.out.println(b.getBookInfo());
//		System.out.println(b1.getBookInfo());
//		System.out.println(b2.getBookInfo());
//		System.out.println(b3.getBookInfo());
//		System.out.println(b4.getBookInfo());
		
		Book[] ary =  new Book[5];
		ary[0] = book;
		ary[1] = book1;
		ary[2] = book2;
		ary[3] = book3;
		ary[4] = book4;		
		
		for (Book obj : ary)
			System.out.println(obj.getBookInfo());
		
		System.out.println("---------------------------------");
		
		Book[] ary2 = {book, book1, book2, book3, book4};
		
		for (int i = 0; i < ary2.length; i++)
			System.out.println(ary[i].getBookInfo());
		
	}

}
