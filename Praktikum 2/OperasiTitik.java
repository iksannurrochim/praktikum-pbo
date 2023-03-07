//Nama file 	: OperasiTitik.java
//Pembuat	: Iksan Nur Rochim
//Tanggal	: 1 Maret 2023
//Deskripsi	: Kelas yang berisi program utama untuk melakukan operasi dari kelas titik

class OperasiTitik1{
	public void refleksiSumbuX(Titik T1){
		double ordinat = T1.getOrdinat();
		ordinat = ordinat * -1;
		T1.setOrdinat(ordinat);
	}
	public void refleksiSumbuY(Titik T1){
		double absis = T1.getAbsis();
		absis = absis * -1;
		T1.setAbsis(absis);
	}
}

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}

	public Titik refleksiX(Titik titik){
		Titik T4 = new Titik(titik.getAbsis(), titik.getOrdinat()); 
		refleksiSumbuX(T4);
		return T4;
	}

	public Titik refleksiY(Titik titik){
		Titik T4 = new Titik(titik.getAbsis(), titik.getOrdinat());
		refleksiSumbuY(T4);
		return T4;
	}
}
