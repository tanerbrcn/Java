package EncapsulationExample;

public class Book {
	
	//Kodumuzdaki kapsülleme mantığını numberOfPage değişkeni üzerinden anlatacak olursak.
	//numberOfPage değişkenini private tanımlayarak başka classlardan erişimini engelledik.
	//Constructor'dan parametre üzerinden numberOfPage değişkenine değer gönderdik ve aynı Constructor içinde kontrol ettirdik.
	//numberOfPage değerini pageSize() metodu sayesinde dışarıdaki classlara sunduk.
	//Yani numberOfPage değişkenini dışardan erişime kapalı halde kullanarak koruduk. Bu koruma durumuna sarmalama, kapsülleme denir.
	
	
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
	
	public void pageSize() {
		System.out.println(numberOfPage);
	}

}
