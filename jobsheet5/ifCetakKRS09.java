package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("---Cetak KRS Siakad");
    System.err.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    
    }

    sc.close();
    
    
    }
    }  

   /*1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan 
operator relasional?*/ 
/*Karena variabel yang diperiksa bertipe boolean, yaitu hanya memiliki dua nilai: true atau false. 
Dalam tipe boolean, nilai true sudah cukup menjadi kondisi logika yang valid tanpa perlu operator relasional 
(seperti ==, >, <, dll). Misalnya: if (uktLunas) sudah setara dengan if (uktLunas == true) Namun, penulisan 
pertama lebih efisien dan sesuai praktik pemrograman yang baik.*/

/* 2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?*/
/*Jika pengguna memasukkan false, maka kondisi if (uktLunas) tidak terpenuhi. Akibatnya, 
blok perintah di dalam if tidak akan dijalankan, dan program tidak akan menampilkan pesan 
“KRS dapat dicetak”. Artinya, tidak ada keluaran (output) yang menunjukkan bahwa KRS berhasil dicetak.*/

/* 3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka 
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi 
program tersebut dengan menambahkan struktur ELSE!*/
/*Penambahan struktur else dilakukan agar program memberikan keluaran ketika kondisi utama tidak terpenuhi.
Dengan adanya else, sistem dapat menampilkan pesan penolakan dan memberikan informasi kepada pengguna secara jelas.
Hal ini membuat program menjadi lebih informatif dan interaktif, karena setiap kemungkinan kondisi (lunas atau belum) 
akan menghasilkan keluaran yang sesuai */