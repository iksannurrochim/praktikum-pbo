/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : mian class untuk generic bangun datar
 * Nama : Iksan Nur Rochim
 */
public class BangunDatarGenericTest {
	public static void main(String[] args) {
		Lingkaran2 l = new Lingkaran2(2);
		BangunDatarGeneric<Lingkaran2> bdg =
			new BangunDatarGeneric<Lingkaran2>();
		bdg.set(l);
		System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
		System.out.println("tipe generic : " +bdg.get().getClass().getName());
	}
}