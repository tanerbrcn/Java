package EncapsulationExample;

public class Main {

	public static void main(String[] args) {

		Book book1=new Book("Harry Potter","Yazar Rowling","Kodlama Yayın Evi",400);
		
		//getNumberOfPage Book classındaki numberOfPage değerini getirdi ve değer ekrana basıldı. Ekrana basılan numberOfPage değeri = 400
		System.out.println(book1.getNumberOfPage()); 
		
		////setNumberOfPage Book classındaki değerini parametre gönderilerek değiştirdi. Yeni değeri 250 oldu.
		book1.setNumberOfPage(250);
		
		//getNumberOfPage Book classındaki değeri getirildi ve ekrana basıldı. Ekrana basılan numberOfPage değeri = 250
		System.out.println(book1.getNumberOfPage()); 

	}

}
