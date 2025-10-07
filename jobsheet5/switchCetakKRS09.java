package jobsheet5;
import java.util.Scanner;

public class switchCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.println("Masukkan semester saat ini");
        int semester = sc.nextInt();

        switch (semester){
            case  1:
            System.out.println("KRS Semester 1 ditampilkan");
            break;
            case 2:
            System.out.println("KRS Semester 2 ditampilkan");
            break;
            case 3:
            System.out.println("KRS Semester 3 ditampilkan");
            break;
            case 4:
            System.out.println("KRS Semester 4 ditampilkan");
            break;
            case 5:
            System.out.println("KRS Semester 5 ditampilkan");
            break;
            case 6:
            System.out.println("KRS Semester 6 ditampilkan");
            break;
            case 7:
            System.out.println("KRS Semester 7 ditampilkan");
            break;
            case 8:
            System.out.println("KRS Semester 8 ditampilkan");
            break;
            default:
            System.out.println("Semester tidak valid");
            
    }
    sc.close();
}

    /* 1. Apa fungsi dari sintaks break?*/
    /*Sintaks break berfungsi untuk menghentikan eksekusi pada suatu blok case di dalam 
    struktur switch. Tanpa break, program akan melanjutkan eksekusi ke case berikutnya 
    (dikenal sebagai fall-through). Oleh karena itu, break memastikan bahwa hanya blok kode 
    dari case yang sesuai saja yang dijalankan. */

    /* 2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?  */
    /*Bagian default berfungsi untuk menangani kondisi yang tidak sesuai dengan nilai-nilai case yang ada.
default bertindak sebagai opsi cadangan jika input tidak cocok dengan semua kemungkinan.
Dengan begitu, program tetap bisa memberikan tanggapan meskipun input yang dimasukkan tidak valid. */

    
}
