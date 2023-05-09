/*
* Nama File	: Programmer.java
* Penulis	: Iksan Nur Rochim
* NIM		: 24060121120013
* Tanggal	: 3 Mei 2023
* Deskripsi	: kelas programmer
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}