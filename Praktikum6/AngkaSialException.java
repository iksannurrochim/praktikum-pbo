/**
 * File	: AngkaSialException.java
 * Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
 * Iksan Nur Rochim    29/3/2023
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!!!");
	}
}
