package Lesson2Examples.ReCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		FourTransactions fourTransactions = new FourTransactions();
		int sonuc=fourTransactions.toCollect(10, 15); //Toplama
		System.out.println(sonuc);
		
		sonuc=fourTransactions.takeOut(15, 10); //Çıkartma
		System.out.println(sonuc);
		
		sonuc=fourTransactions.divide(150, 15); //Bölme
		System.out.println(sonuc);
		
		sonuc=fourTransactions.bump(10, 15); //Çarpma
		System.out.println(sonuc);
		
	}

}
