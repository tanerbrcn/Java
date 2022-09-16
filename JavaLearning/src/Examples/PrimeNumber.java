package Examples;

public class PrimeNumber {

	public static void main(String[] args) {

		// Asal sayı mı?

		int number = 2;
		int remainder = number % 2; // Remainder=Kalan
		boolean isPrime = true; // isPrime = Asal mı?
		
		if(number==1) {
			System.out.println("Sayı Asal Sayı Değildir.");
			return; //İşlemi bitirir ve fonksiyondan çıkar.
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı.");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		
		if(isPrime) {
			System.out.println("Sayı Asal Sayıdır.");
		}else {
			System.out.println("Sayı Asal Sayı Değildir.");
		}

	}

}
