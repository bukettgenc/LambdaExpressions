package src;

import java.time.LocalDate;

public class Driver {
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
		System.out.println(topla.topla(3,5));
		
		Kisi kisi1=new Kisi("Ali can ",LocalDate.now(),"alican@example.com");
		Kisi kisi2=new Kisi("Seyhan çalışkan ",LocalDate.now(),"seyhancaliskan.com");
		Kisi kisi3=new Kisi("Tuğrul yılmaz ",LocalDate.now(),"tugrulyilmaz.com");
		
		//Burada yazılan toString methodu çalışır
		System.out.println(kisi1);
		System.out.println(kisi2);
		System.out.println(kisi3);
		
	}
}
