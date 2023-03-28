/**
* MLingkaran.java 25/3/2023
* Penulis : Iksan Nur Rochim
* Deskripsi : implementasi cara menghitung luas lingkaran
*
*/

import java.util.Scanner;

public class MLingkaran {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jejari lingkaran: ");
    double jejari = scan.nextDouble();
    Lingkaran lingkaran = new Lingkaran(jejari);
    System.out.println("Luas lingkaran dengan jejari " + jejari + 
                       " satuan adalah " + lingkaran.hitungLuas());
  }
}