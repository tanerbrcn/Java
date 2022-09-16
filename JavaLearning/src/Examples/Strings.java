package Examples;

public class Strings {

	public static void main(String[] args) {
		// Stringler ile çalışmak

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı = " + mesaj.length());
		System.out.println("5.Eleman = " + mesaj.charAt(4)); 		// 0,1,2,3,4 - 5.Eleman = 4 olur.
		System.out.println(mesaj.concat(" Yaşasın!"));				// Mesaj değişkeni içerisindeki text ile Yaşasın! textini
																	// birleştirir.
		System.out.println(mesaj.startsWith("B"));					// Cümle B harfi ile başladığında True aksi halde False döndürür
		System.out.println(mesaj.endsWith("."));					// Cümle . ile bitiyorsa True aksi halde False döndürür
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); 						// 0 dan başlayarak 5 karakteri karakterler dizisine 0 numaralı indexten
																	// başlayarak aktarır.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); 					// Metin içinde bulduğu a harfinin index numarasını verir.
																	// İlk bulduğunu yazıp işlemini bitirir.
		
		System.out.println(mesaj.lastIndexOf('a')); 				// Metin içinde bulduğu a harfinin index numarasını verir.
																	// İlk bulduğunu yazıp işlemini bitirir. Aramaya tersten başlar.
		System.out.println(mesaj.replace(" ", "-"));				// Boşluk karakterini - ile değiştirir.
		System.out.println(mesaj.substring(2));                     // Metni ikinci indexten itibaren gösterir.
		System.out.println(mesaj.substring(2,5));                   // Metni ikinci indexten itibaren beşinci indexe kadar gösterir.
		
		for(String kelime:mesaj.split(" ")) 						// Cümleyi kelimelere ayırır.
		{System.out.println(kelime);}
		
		
		System.out.println(mesaj.toLowerCase());	                // Tüm harfleri küçük harf haline getirir.
		System.out.println(mesaj.toUpperCase());	                // Tüm harfleri büyük harf haline getirir.
		System.out.println(mesaj.trim());	                        // Cümle başındaki ve sonundaki boşlukları siler.
		
	}

}
