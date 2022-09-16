package Examples;

public class FindNumber {

	public static void main(String[] args) {

		// Sayı Bulma

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 7;
		boolean varMi = false;

		for (int number : numbers) {
			if (number == findNumber) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
