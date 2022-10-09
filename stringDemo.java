package javaHelloWorld;

public class stringDemo {

	public static void main(String[] args) {

		String mesaj = "     Bugün hava çok güzel.    ";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı : " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!"));
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf('o'));
		 * System.out.println(mesaj.lastIndexOf("e"));
		 */

		String yeniMesaj = mesaj.replace(' ', '-'); // Yazı içerisinde değişiklikleri yapmaya yarıyor.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5)); // Yazı içerisinde ki istediğimiz bölümü yazdırabiliyor
		for (String kelime : mesaj.split(" ")) { // For döngüsü ile yazıyı kelimeleri bölmemize yarıyor. Harf harf de
													// bölünebilir.
			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase()); // Tüm harfleri küçük yapıyor
		System.out.println(mesaj.toUpperCase()); // Tüm harfleri büyük yapıyor.
		System.out.println(mesaj.trim()); // Başında ki ve sonundaki boşlukları alıyor
	}

}
