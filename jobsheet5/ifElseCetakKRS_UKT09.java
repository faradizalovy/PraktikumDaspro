package jobsheet5;
import java.util.Scanner;

public class ifElseCetakKRS_UKT09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("KRS dapat dicetak");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
    }
    String pesan = (uktLunas)
    ? "Registrasi berhasil,silahkan cetak KRS"
    : "Registrasi ditolak, silakan lunasi UKT terlebi dahulu";

    System.out.println("[Ternary]:" +pesan);
    sc.close();
}
    
}
