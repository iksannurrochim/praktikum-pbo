/*
* Nama File	: Manajer.java
* Penulis	: Iksan Nur Rochim
* NIM		: 24060121120013
* Tanggal	: 3 Mei 2023
* Deskripsi	: kelas manajer
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}