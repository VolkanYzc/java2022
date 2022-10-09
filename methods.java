package javaHelloWorld;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 4;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			mesajVer("Sayı Mevcuttur: " + aranacak);
			;
		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
