package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisi.getCinsiyet().equals(cinsiyet)) {
				System.out.println(kisi);
			}
		}
	}

	public static void yasaGoreFiltrele(List<Kisi> kisiler, int yas) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisi.getYas() >= yas) {
				System.out.println(kisi);
			}
		}
	}

	public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if (kisiFiltresi.filtrele(kisi)) {
				System.out.println(kisi);
			}
		}
	}

	public static void main(String[] args) {
//		SayiOlustur sayiOlustur=new SayiOlustur() {
//			
//			@Override
//			public double olustur() {
//				// TODO Auto-generated method stub
//				return 15.0;
//			}
//		};

		// Lambda ile ifade edilmesi
		// Parantezin içinin boş olma sebebi olustur() methodunun parametresiz olması
		// 15.0 olmasının sebebi ise methodun dönüş tipinin double olması
		SayiOlustur sayiOlustur = () -> 15.0;
		System.out.println(sayiOlustur.olustur());

		Merhaba merhaba = () -> "Selam";
		System.out.println(merhaba.selam());

		Merhaba2 merhaba2 = (isim) -> "Selam " + isim;
		System.out.println(merhaba2.selam("Buket"));

		Topla topla = (sayi1, sayi2) -> sayi1 + sayi2;
		System.out.println(topla.topla(3, 5));

		Kisi kisi1 = new Kisi("Ali can ", LocalDate.parse("1990-03-23"), "alican@example.com", Kisi.Cinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("Seyhan çalışkan ", LocalDate.parse("1998-01-02"), "seyhancaliskan.com",
				Kisi.Cinsiyet.KADIN);
		Kisi kisi3 = new Kisi("Tuğrul yılmaz ", LocalDate.parse("2013-07-04"), "tugrulyilmaz.com", Kisi.Cinsiyet.ERKEK);

		ArrayList<Kisi> kisiler = new ArrayList<Kisi>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);

		// Burada yazılan toString methodu çalışır
//		System.out.println(kisi1);
//		System.out.println(kisi2);
//		System.out.println(kisi3);

//		cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.ERKEK);

//		yasaGoreFiltrele(kisiler, 11);

//		kisiFiltrele(kisiler, new KisiFiltresi() {
//			
//			@Override
//			public boolean filtrele(Kisi kisi) {
//				// TODO Auto-generated method stub
//				return kisi.getYas()>15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
//			}
//		});
//		Anonim class yerine lambda expression kullanılabilir
		kisiFiltrele(kisiler, (k) -> k.getYas() > 15 && k.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK));
	}
}
