package EncapsulationExample;

public class Book {
	
	//Kodumuzdaki kapsülleme mantığını numberOfPage değişkeni üzerinden anlatacak olursak.
	//numberOfPage değişkenini private tanımlayarak başka classlardan erişimini engelledik.
	//Constructor'dan parametre üzerinden numberOfPage değişkenine değer gönderdik ve aynı Constructor içinde kontrol ettirdik.
	//numberOfPage değerini getter metodu ile başka classlara sunduk. Setter metodu ile dışarıdaki classlardan değerini değiştirdik.
	//Yani numberOfPage değişkenini dışardan direk erişime kapalı halde kullanarak koruduk. Bu koruma durumuna sarmalama, kapsülleme denir.
	
	
	public String name, author, publisher; // adı,yazarı,yayıncı
	private int numberOfPage;

	Book(String name, String author, String publisher, int numberOfPage) {

		this.name = name;
		this.numberOfPage = numberOfPage;
		this.author = author;
		this.publisher = publisher;
		
		if (this.numberOfPage < 1) {
			System.out.println("Kitap sayısı 0 ve altında değer alamaz. Bu nedenden dolayı geçici olarak 1 değeri atandı.");
			this.numberOfPage = 1;
		} else {
			this.numberOfPage = numberOfPage;
		}

	}

	//Değeri başka classlara sunan getir metodu
	public int getNumberOfPage() {
		return numberOfPage;
	}
	
	//Değeri başka classlardan parametre aracılığı ile değiştirebilen set metodu
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	
	


}
