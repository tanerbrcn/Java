package OOP_Example;

public class Main {

	public static void main(String[] args) {

		//CallVariableFromClass() metodunu burada çağırdık. Bu sayede içerisindeki kodları çalıştırmış olduk.
		CallVariableFromClass();

	}
	
	
	//Kodlarımızın düzenli olması ve diğer yapacağımız örneklerde main metodumuzu doldurmamak için CallVariableFromClass() adında bir metot
	//oluşturup kodlarımızı bu metot içerisine yazdık. Main metodu içerisinde ise bu metotu çağırarak kodumuzu çalıştırmış olduk.
	
	//CallVariableFromClass şeklinde isimlendirdiğim metodun Türkçe olarak karşılığı "class sınıfındaki değişkenleri çağır" şeklindedir.
	public static void CallVariableFromClass() { 
		
		//Class.java adındaki Class'tan yeni bir nesne üretiyoruz.
		Class user =new Class();
		
		//Ürettiğimiz bu nesne sayesinde Class.java'da tanımladığımız userName ve parola değişkenlerine erişiyoruz. Ve ekrana çıktı veriyoruz.
		System.out.println(user.userName);
		System.out.println(user.password);
		
	}

}
