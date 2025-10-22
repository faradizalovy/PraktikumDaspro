package jobsheet7;
import java.util.Scanner;

public class SiakadFor09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double nilai, tertinggi= 0, terendah = 100;
    System.out.println("===Program Nilai Mahasiswa (FOR)===");

    for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + i +":");
        nilai = sc.nextDouble();

    if (nilai > tertinggi) {
        tertinggi =  nilai;
    }
    if (nilai < terendah) {
        terendah = nilai;
    }
}

System.out.println("\nNilai tertinggi: " +tertinggi);
System.out.println("Nilai terendah: " +terendah);
    }
}

/*. 1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!*/
/*Jawaban: Komponen Perulangan FOR pada baris: for (int i = 1; i <= 10; i++)
- Inisialisasi: int i = 1, menetapkan nilai awal variabel penghitung.
- Kondisi: i <= 10, menentukan kapan perulangan berhenti.
- Update: i++, menaikkan nilai i setiap satu iterasi.*/

/*2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?*/
/*Jawaban: - Karena nilai mahasiswa berada pada rentang 0–100. Maka, tertinggi dimulai dari 0 agar 
bisa dibandingkan dengan nilai apa pun yang lebih tinggi, dan terendah dimulai dari 100 agar bisa dibandingkan dengan nilai yang lebih rendah.
Jika dibalik: Maka tertinggi (100) tidak akan berubah karena semua nilai lebih kecil dari 100,
dan terendah (0) juga tidak akan berubah karena semua nilai lebih besar dari 0.
Hasilnya akan salah.*/

/*3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!*/
/*Jawaban: Fungsinya untuk menentukan nilai tertinggi dan terendah dengan membandingkan setiap 
nilai baru yang dimasukkan dengan nilai sebelumnya*/

/*4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!*/
/*Jawaban: Modifikasi ada di file lainnya */