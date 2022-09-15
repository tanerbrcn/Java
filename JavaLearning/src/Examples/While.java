package Examples;

public class While {

	public static void main(String[] args) {
		// While
		// Şart sağlanmaz ise hiçbir zaman döngü çalışmaz.
		int i = 1;
		while (i <= 10) {
			System.out.println("While Döngüsü : " + i);
			i++;
		}

		System.out.println("-------------");

		// Do-While
		// Şart sağlanırsa while ile aynı işlemi yapar. Şart sağlanmasa bile döngü bir kez çalışır.
		// Aşağıdaki örnek şartın sağlamadığı durumdur.
		int j = 15;
		do {
			System.out.println("Do-While Döngüsü : " + j);
			j++;
		} while (j <= 10);

	}
}
