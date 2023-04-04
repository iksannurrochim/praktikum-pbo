/**
 * File	: AngkaSialException.java
 * Deskripsi	: Program penggunaan exception buatan sendiri
 *		  Pengenalan klausa 'throw' dan 'throws'
 * Iksan Nur Rochim    29/3/2023
*/
public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+ "bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(12);
			as.cobaAngka(13);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

//Baris ke-12 pada program AngkaSial tersebut tidak akan dieksekusi 
//karena ketika program mengeksekusi baris ke-11, yaitu throw new AngkaSialException();, 
//maka program langsung melompat ke blok catch tanpa mengeksekusi baris selanjutnya pada metode cobaAngka().

//Baris ke-21 pada program AngkaSial akan dieksekusi 
//jika eksepsi terjadi pada salah satu dari dua pemanggilan pertama cobaAngka, 
//yaitu saat memanggil cobaAngka(10) atau cobaAngka(12). 
//Jika eksepsi terjadi pada pemanggilan terakhir cobaAngka(13), 
//program akan langsung melompat ke blok catch pada baris ke-21. Jika tidak ada eksepsi yang terjadi, 
//program akan mengeksekusi baris ke-15 setelah menjalankan ketiga pemanggilan cobaAngka.
