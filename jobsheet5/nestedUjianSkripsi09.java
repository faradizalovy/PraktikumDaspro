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
/* 1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? 
Mengapa demikian?*/
/*Jika mahasiswa menjawab “No”, berarti ia belum bebas kompen, sehingga tidak memenuhi 
syarat awal untuk mendaftar ujian skripsi. Akibatnya, sistem langsung menolak pendaftaran 
dan tidak melanjutkan ke pemeriksaan log bimbingan. Hal ini karena pada nested if, kondisi 
pertama berfungsi sebagai gerbang utama yang harus dipenuhi terlebih dahulu. */

/* 2. Jelaskan maksud dari potongan kode berikut! if (bimbinganP1 >= 8 && bimbinganP2 >= 4) { */
/*Potongan kode if (bimbinganP1 >= 8 && bimbinganP2 >= 4) digunakan untuk memeriksa dua syarat 
sekaligus, yaitu apakah mahasiswa telah melakukan bimbingan dengan Pembimbing 1 minimal 8 kali 
dan dengan Pembimbing 2 minimal 4 kali. Operator logika && (AND) berarti kedua kondisi tersebut 
harus terpenuhi agar pernyataan if bernilai benar. Jika salah satu syarat tidak terpenuhi, maka 
program tidak akan menjalankan perintah di dalam blok if dan akan menampilkan pesan bahwa syarat 
bimbingan belum mencukupi. */

/* 3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara 
runtut untuk semua kondisi! */
/*Berikut alurnya secara runtut:
a. Sistem meminta input status kompen. Jika jawabannya "Tidak", sistem langsung menolak pendaftaran. 
Jika "Ya", pemeriksaan lanjut ke tahap berikutnya
b. Sistem memeriksa jumlah log bimbingan Pembimbing 1 (bimbinganP1). Harus minimal 8 kali.
c. Jika syarat pertama terpenuhi, sistem memeriksa log bimbingan Pembimbing 2 (bimbinganP2). 
Harus minimal 4 kali.
d. Jika kedua syarat bimbingan terpenuhi, sistem menampilkan pesan bahwa mahasiswa berhak mendaftar 
ujian skripsi. Jika salah satu tidak terpenuhi, sistem memberikan alasan spesifik (misalnya: “Bimbingan 
dengan pembimbing 1 belum cukup”). Alur ini memastikan bahwa setiap syarat administratif dan akademik 
diperiksa secara berurutan dan logis. */
