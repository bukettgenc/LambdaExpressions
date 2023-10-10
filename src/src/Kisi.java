package src;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

	private String isim;
	private LocalDate dogumTarihi;
	private String emailAdresi;

	public Kisi() {
	}

	public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi) {
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
		this.emailAdresi = emailAdresi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getEmailAdresi() {
		return emailAdresi;
	}

	public void setEmailAdresi(String emailAdresi) {
		this.emailAdresi = emailAdresi;
	}

	@Override
	public int hashCode() {
		return isim.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		Kisi kisi = (Kisi) o;
		return this.isim.equals(kisi.isim);
	}

	@Override
	public String toString() {
		return "Isim:" + isim + "Doğum Tarihi:" + dogumTarihi.toString();
	}
}
