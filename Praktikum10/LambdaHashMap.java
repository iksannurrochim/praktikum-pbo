 /**
 * Nama File : Lambda Hash Map
 * Deskripsi : Implementasi lambda pada hash map
 * Nama : Iksan Nur Rochim
 * tanggal : 6 Juni 2023
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060121120013", "Iksan Nur Rochim");

        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
