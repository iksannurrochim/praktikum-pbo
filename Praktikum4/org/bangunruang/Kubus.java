/**
 Nama file	:Kubus.java
 Tanggal	:21 Maret 2023
 Penulis	:Iksan Nur Rochim / 24060121130085
 Deskripsi	:Representasi dasar dari objek kubus, turunan kelas bujur sangkar
**/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		return (permukaan.getPanjangSisi() * permukaan.getPanjangSisi() * permukaan.getPanjangSisi());
	}
	
	public double hitungLuasAlas(){
		return (permukaan.getPanjangSisi() * permukaan.getPanjangSisi());
	}
	
}