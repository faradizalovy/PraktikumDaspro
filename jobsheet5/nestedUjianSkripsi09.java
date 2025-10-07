package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = "";

        System.out.println("=== Pemeriksaan Syarat Ujian Skripsi ===");
        System.out.println("Apakah Mahasiswa sudah bebas kompen? (Ya/Tidak)");
        String bebasKompen = sc.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
        System.out.println("Masukkan jumlah bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bimbinganP1 >= 8) {
        if (bimbinganP2 >= 4) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else {
            pesan = "Gagal! Bimbingan dengan Pembimbing 1 belum cukup (minimal 8 kali)";
        }
        } else {
            pesan = "Gagal! Bimbingan dengan Pembimbing 2 belum cukup (minimal 4 kali)";
        }
    } else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
    System.out.println(pesan);
    sc.close();


    }
    
}
