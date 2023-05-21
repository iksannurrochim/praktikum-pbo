/**
 * File : Lingkaran2.java
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Nama : Iksan Nur Rochim
*/
public class Lingkaran2 extends BangunDatar2{
	private double jejari;

	public Lingkaran2 (double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}