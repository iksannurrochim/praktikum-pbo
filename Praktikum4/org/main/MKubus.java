/**
 Nama file	:MPoligon.java
 Tanggal	:21 Maret 2023
 Penulis	:Iksan Nur Rochim / 24060121130085
 Deskripsi	:driver class untuk kubus
**/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar BJ = new BujurSangkar(4);
		Kubus K = new Kubus(BJ);
		
		System.out.println("Volume Kubus = "+K.hitungVolume());
		System.out.println("Luas Permukaan Kubus = "+K.hitungLuasAlas());
	}
}