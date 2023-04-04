/**
 * File	: Asersi2.java
 * Deskripsi	: Program untuk menunjukkan asersi
 * Iksan Nur Rochim    29/3/2023
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}

	public double hitungKeliling(){
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main (String[] args){
		double jariJari = 0;
		assert (jariJari > 0): "jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}	
}

//Program Asersi2 kurang tepat 
//karena variabel jariJari memiliki nilai awal 0, 
//sehingga assertion jariJari > 0 akan gagal 
//dan menghasilkan pesan kesalahan. 
//Padahal, dalam pembuatan lingkaran, jari-jari haruslah memiliki nilai yang lebih besar dari nol. 
//Oleh karena itu, nilai awal jariJari harus diatur ke suatu nilai yang valid sebelum digunakan dalam pembuatan objek Lingkaran.