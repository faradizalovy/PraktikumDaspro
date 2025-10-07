package jobsheet5;
import java.util.Scanner;

public class wifiKampus09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Sistem Akses WiFi Kampus---");
        System.out.println("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = sc.next().trim().toLowerCase();

    if (jenisPengguna.equals("dosen")) {
        System.out.println("Akses wifi diberikan (dosen)");
    } else if (jenisPengguna.equals("mahasiswa")) {
        System.out.println("Masukkan jumlah SKS: ");
        int sks = sc.nextInt();

    if (sks >= 12) {
        System.out.println("Akses wifi diberikan (mahasiswa aktif)");
    } else {
        System.out.println("Akses ditolak, SKS kurang dari 12");
    }
} else {
    System.out.println("Akses ditolak");
}
sc.close();
    }
    
}
