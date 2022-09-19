package OOP_Example;

public class Class {

	// Bu Class'ta değişken üretip Main Class'ında o değişkeni çağırıp kullanacağız.
	// Bu Class'ı bir login Class olarak düşünerek kullanıcı adı ve parola adında
	// iki değişken oluşturduk.

	String userName = "admin";
	String password = "adminPassword";

	// ------------------------------------------------------------------------------

	//Constructor
	//Class'tan bir nesne üretildiğinde ilk çalışan kısım burasıdır. İçerisinde parametre yoksa burası çalışır.
	Class() {
	}

	//Class içerisinde parametre varken ise burası çalışır. 
	//Parametreden gelen değerleri burada kullanabilmek için aynı isimdeki değişkenlere atadık.
	//Değişkenlerin ve parametreden gelen değerlerin adı aynı olduğu için birbirinden ayırmamız gerekiyor.
	//Bu ayırma işlemi için parametreden gelen değerleri this komutu kullanarak parametreden gelen değer olduğunu ifade ediyoruz.
	Class(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

}
