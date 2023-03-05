//Nama file 	: MOperasiTitik.java
//Pembuat	: Iksan Nur Rochim
//Tanggal	: 1 Maret 2023
//Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas titik

class MOperasiTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;

		t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		t2 = new Titik();
		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		Titik t3 = new Titik(5.0, 6.0);

		System.out.println("Jumlah Titik : "+Titik.getCounterTitik());
		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");

		OperasiTitik op = new OperasiTitik();
		Titik T4 = op.refleksiX(t1);
		System.out.println("T4 adalah t1 setelah refleksi terhadap X("+ T4.getAbsis()+", "+T4.getOrdinat()+")");
		//System.out.println("T4.x setelah refleksi x = "+ T4.getAbsis());
		//System.out.println("T4.y setelah refleksi y = "+ T4.getOrdinat());


		//OperasiTitik op = new OperasiTitik();
		Titik T5 = op.refleksiY(t1);
		System.out.println("T5 adalah t1 setelah refleksi terhadap Y("+ T5.getAbsis()+", "+T5.getOrdinat()+")");
		//System.out.println("T5.x setelah refleksi x = "+ T5.getAbsis());
		//System.out.println("T5.y setelah refleksi y = "+ T5.getOrdinat());\
	}	
}