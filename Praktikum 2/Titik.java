//Nama file 	: Titik.java
//Pembuat	: Iksan Nur Rochim
//Tanggal	: 22 Maret 2023
//Deskripsi	: Kelas yang berisi program utama untuk membuat titik
class Titik {
	//atribut
	protected double absis;
	protected double ordinat;
	private static int counterTitik;

	//metode
	public Titik(){
	Titik.counterTitik++;
	}
	public Titik(double a, double o){
		absis = a;
		ordinat = o;
	Titik.counterTitik++;
	}
	public double getAbsis() {
		return absis;
	}
	public double getOrdinat() {
		return ordinat;
	}
	public void setAbsis(double a) {
		absis = a;
	}
	public void setOrdinat(double o) {
		ordinat = o;
	}
	public static int getCounterTitik(){
		return counterTitik;
	}
}


	