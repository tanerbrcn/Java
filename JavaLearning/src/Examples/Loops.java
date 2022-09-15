package Examples;

public class Loops {

	public static void main(String[] args) {

		// For Döngüsü
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tüm Sayılar : "+ i);
		}
		
		for (int i = 1; i <= 10; i+=2) {
			System.out.println("Tek Sayılar : "+ i);
		}
		
		for (int i = 2; i <= 10; i+=2) {
			System.out.println("Çift Sayılar : "+ i);
		}
		System.out.println("Döngü Bitti");

	}

}
