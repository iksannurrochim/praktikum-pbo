/**
 Nama file	:BujurSangkar.java
 Tanggal	:21 Maret 2023
 Penulis	:Iksan Nur Rochim / 24060121130085
 Deskripsi	:Representasi dasar dari objek Bujur sangkar, turunan kelas poligon
**/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return (this.panjangSisi*this.panjangSisi);
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}