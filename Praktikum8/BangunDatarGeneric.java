/**
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * Nama : Iksan Nur Rochim
 */
public class BangunDatarGeneric<T1 extends BangunDatar2>{
	private T1 bangunDatar;

	public void set (T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T1 get() {
		return bangunDatar;
	}

	public double hitungKeliling() {
		return bangunDatar.hitungKeliling();
	}

}

//Dengan mengganti 'T' dengan karakter yang berbeda seperti 'T1', 'T2', atau 'T1234' dalam 
//kelas BangunDatarGeneric, hal tersebut sebenarnya membuat parameter tipe yang berbeda untuk 
//kelas generik tersebut. Setiap parameter tipe mewakili tipe spesifik yang merupakan 
//turunan dari kelas BangunDatar2.