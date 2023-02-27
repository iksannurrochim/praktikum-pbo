/*Nama file	: Titik.java*/
/*Tanggal	: 22 Februari 2023*/
/*Penulis	: Iksan Nur Rochim*/
/*Deskripsi	: kelas yang berisi konstruktor dan mutator untuk membuat titik*/
class Titik {
	//atribut
	double absis;
	double ordinat;
	static int counterTitik;

	//metode
	Titik(){
	Titik.counterTitik++;
	}
	Titik(double a, double o){
		absis = a;
		ordinat = o;
	Titik.counterTitik++;
	}
	double getAbsis() {
		return absis;
	}
	double getOrdinat() {
		return ordinat;
	}
	void setAbsis(double a) {
		absis = a;
	}
	void setOrdinat(double o) {
		ordinat = o;
	}
	static int getCounterTitik(){
		return counterTitik;
	}
}


	
