package jobsheet7;
import java.util.Scanner;

public class KafeDoWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

    do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();
    
    if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan.");
        break;
    }

    System.out.print("Jumlah kopi yang dibeli: ");
    kopi = sc.nextInt();
    System.out.print("Jumlah teh yang dibeli: ");
    teh = sc.nextInt();
    System.out.print("Jumlah roti yang dibeli: ");
    roti = sc.nextInt();

    int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
    System.out.println("Total harga pembelian: Rp " + totalHarga);

    sc.nextLine();
} while (true);
}
}

/*1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, 
maka berapa kali perulangan dilakukan?*/
/*Jawaban: Maka perulangan tetap dijalankan satu kali, karena do-while selalu menjalankan blok perintah 
minimal satu kali sebelum mengecek kondisi*/

/*2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!*/
/*Jawaban: Kondisi Berhenti Perulangan berhenti saat namaPelanggan.equalsIgnoreCase("batal") terpenuhi
atau bernilai benar*/

/*3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?*/
/*Jawaban: true membuat perulangan berjalan tanpa batas (infinite loop), dan hanya bisa dihentikan 
menggunakan break.*/

/*4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?*/
/*Jawaban: Karena DO-WHILE tidak bergantung pada variabel penghitung(seperti i), melainkan dikendalikan oleh 
kondisi logika internal (if dan break). Sehingga meskipun tidak ada inisialisasi/update, perulangan tetap 
berfungsi selama kondisinya true. */