package jobsheet5;
import java.util.Scanner;

public class ifElseGenapGanjil09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Program Menentukan Bilangan Genap atau Ganjil---");
        System.out.println("Masukkan sebuang angka: ");
        int angka = sc.nextInt();

        if (angka %2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
        sc.close();
    }
    
}
