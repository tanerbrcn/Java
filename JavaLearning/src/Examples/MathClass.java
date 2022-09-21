package Examples;

public class MathClass {

	public static void main(String[] args) {
		
		// Math sınıfı Metotları
		int x=2;
		int y=3;
		double z=3.4;
		int c=-10;
		
		System.out.println(Math.ceil(z)); //Yukarıya yuvarlar.
		System.out.println(Math.floor(z)); //Aşağıya yuvarlar.
		System.out.println(Math.cos(x)); //Cos değerini döndürür.
		System.out.println(Math.sin(x)); //Sin değerini döndürür.
		System.out.println(Math.max(x,y)); //Max değerini döndürür.
		System.out.println(Math.min(x,y)); //Min değerini döndürür.
		System.out.println(Math.pow(x,y)); //x üzeri y değerini döndürür.
		System.out.println(Math.random()); //1 ve 0 arasında rastgele değer döndürür.
		System.out.println(Math.round(y)); //Yakın olan tamsayı değerini döndürür.
		System.out.println(Math.abs(c)); //Mutlak değerini döndürür.
		
	}

}
