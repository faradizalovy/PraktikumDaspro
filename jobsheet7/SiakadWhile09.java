package jobsheet7;

import java.util.Scanner;

public class SiakadWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int nilai, jml, i = 0;

    System.out.println("===Program Kategori Nilai (WHILE)===");
    System.out.print("Masukkan jumlah mahasiswa: ");
    jml = sc.nextInt();

    while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" +(i + 1)+": ");
        nilai = sc.nextInt();

    if (nilai < 0 || nilai > 100) {
        System.out.println("Nilai tidak valid! Masukkan nilai yang valid");
        continue;
    }

    if (nilai > 80 && nilai <= 100) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah A");
    } else if (nilai > 73 && nilai <= 80) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah B+");
    } else if (nilai > 65 && nilai <= 73) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah B");
    } else if (nilai > 60 && nilai <= 65) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah C+");
    } else if (nilai > 50 && nilai <= 60) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah C");
    } else if (nilai > 39 && nilai <= 50) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) +" adalah D");
    } else {
        System.out.println("Nilai mahasiswa ke-" +" adalah E");
    }

    i++;
}
    }    
}

/*1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: 
a. nilai < 0 || nilai > 100 
b. continue*/
/*Jawaban: a. Nilai < 0 || nilai > 100 artinya jika nilai lebih kecil dari 0 atau lebih besar dari 100.
Kondisi ini digunakan untuk menolak input yang tidak valid.
b. continue: digunakan untuk melewati sisa blok perulangan saat ini dan langsung melanjutkan ke iterasi berikutnya.
Dalam konteks ini, ketika nilai tidak valid, program langsung meminta input baru tanpa memproses kategori huruf*/

/*2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya 
dituliskan di awal perulangan WHILE?*/
/*Jawaban: Posisi i++ diletakkan di akhir agar penambahan variabel penghitung dilakukan setelah proses input dan 
pengecekan nilai selesai. Jika  i++ diletakkan di awal, maka variabel penghitung akan bertambah sebelum input, 
sehingga jumlah mahasiswa yang dimasukkan menjadi berkurang*/

/*3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?*/
/*Jawaban: Jika jumlah mahasiswa = 19, maka perulangan berjalan sebanyak 19 kali, karena kondisi i < jml terpenuhi 
mulai dari i = 0 hingga i = 18 */

/*4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan 
tambahan "Bagus, pertahankan nilainya"!*/
/*Jawaban: Kode program modifikasi ada di file lainnya*/