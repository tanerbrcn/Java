package Examples;

public class Vowels {

	public static void main(String[] args) {

		// Sesli harfler

		char harf = 'e';
		switch (harf) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
		{
			System.out.println(harf +" harfi kalın sesli harftir.");
			break;
		}
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
		{
			System.out.println(harf +" harfi ince sesli harftir.");
			break;
		}
		default:
			System.out.println(harf +" bir sesli harf değildir.");
		}

	}

}
