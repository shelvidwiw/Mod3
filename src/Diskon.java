import java.util.Scanner;

/**
 * Program sederhana untuk menghitung diskon belanja.
 * @author Shelvi Dwi 
 *
 */
public class Diskon{
    /**
     * Fungsi utama program. Program akan meminta input jumlah total belanja,
     * menghitung diskon berdasarkan aturan yang diberikan, dan menampilkan hasilnya.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean selesai = false;
        while (!selesai) {
            // Input jumlah total belanja
            System.out.print("Masukkan jumlah total belanja: Rp.");
            double totalBelanja = input.nextDouble();

            // Inisialisasi variabel diskon
            double diskon = 0.0;

            // Hitung diskon berdasarkan jumlah total belanja
            if (totalBelanja >= 100000) {
                diskon = totalBelanja * 0.1; // Diskon 10% jika total belanja >= 100000
            } else if (totalBelanja >= 50000) {
                diskon = totalBelanja * 0.05; // Diskon 5% jika total belanja >= 50000
            }

            // Hitung jumlah yang harus dibayar setelah diskon
            double totalSetelahDiskon = totalBelanja - diskon;

            // Tampilkan hasil
            System.out.println("Total belanja sebelum diskon: Rp." + totalBelanja);
            System.out.println("Diskon: Rp." + diskon);
            System.out.println("Total setelah diskon: Rp." + totalSetelahDiskon);

            // Tanyakan kepada pengguna apakah ingin melanjutkan
            System.out.print("Apakah ingin menghitung diskon lagi? (ya/tidak): ");
            String jawaban = input.next();

            if (!jawaban.equalsIgnoreCase("ya")) {
                selesai = true;
            }
        }

        // Tutup scanner
        input.close();
    }
}
