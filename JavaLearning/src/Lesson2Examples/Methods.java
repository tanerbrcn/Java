package Lesson2Examples;

public class Methods {

	public static void main(String[] args) {

		findNumber();
	}

	public static void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 6;
		boolean isThere = false; // varmı?

		for (int number : numbers) {
			if (number == findNumber) {
				isThere = true;
				break;
			}

		}
		if (isThere) {
			Message("Sayı mevcut " + findNumber);

		} else {
			Message("Sayı mevcut değil " + findNumber);
		}

	}

	public static void Message(String message) {
		System.out.println(message);
	}

}
