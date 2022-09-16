package Examples;

public class PerfectNumber {

	public static void main(String[] args) {
		// Mükemmel sayı = Kendinden başka pozitif tüm tam bölenlerin toplam sayısı
		// kendisine eşit olan sayıdır.
		// Örnek 6 --> 1,2,3 bölenlerdir. 1+2+3=6 mükemmel sayıdır.

		int number = 6;
		int total = 0;
		for (int i = 1; i < number; i++) {

			if(number%i==0) {
				total=total+i;
			}
			
		}
		
		if(total==number) {
			System.out.println(number +" Mükemmel sayıdır.");
		}else {
			System.out.println(number +" Mükemmel sayı değildir.");
		}

	}

}
