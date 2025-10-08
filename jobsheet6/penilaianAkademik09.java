package jobsheet6;
import java.util.Scanner;

public class penilaianAkademik09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama :");
        String nama = sc.nextLine();
        System.out.print("NIM :");
        String nim = sc.nextLine();

        System.out.println("\n---- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.println("Nilai UTS :");
        double utsAlgo = sc.nextDouble();
        System.out.println("Nilai UAS :");
        double uasAlgo = sc.nextDouble();
        System.out.println("Nilai Tugas :");
        double tugasAlgo = sc.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.println("Nilai UTS :");
        double utsStruk = sc.nextDouble();
        System.out.println("Nilai UAS :");
        double uasStruk = sc.nextDouble();
        System.out.println("Nilai Tugas :");
        double tugasStruk = sc.nextDouble();

        double nilaiAkhirAlgo = (0.3 * utsAlgo) + (0.4 * uasAlgo) + (0.3 * tugasAlgo);
        double nilaiAkhirStruk = (0.3 * utsStruk) + (0.4 * uasStruk) + (0.3 * tugasStruk);

        String hurufAlgo = konversiNilaiHuruf(nilaiAkhirAlgo);
        String hurufStruk = konversiNilaiHuruf(nilaiAkhirStruk);

        String statusAlgo = (nilaiAkhirAlgo >= 60)? "LULUS":"TIDAK LULUS";
        String statusStruk = (nilaiAkhirStruk >= 60)? "LULUS":"TIDAK LULUS";

        double rataRata = (nilaiAkhirAlgo + nilaiAkhirStruk) / 2;
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusStruk.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS (Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama :" +nama);
        System.out.println("NIM :" +nim);

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilaiHuruf\tStatus");

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", utsAlgo, uasAlgo,tugasAlgo,nilaiAkhirAlgo, hurufAlgo, statusAlgo); 
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", utsStruk, uasStruk, tugasStruk, nilaiAkhirStruk, hurufStruk, statusStruk);

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester:" +statusSemester);

        sc.close();
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <= 80) return "B+";
        else if (nilai > 65 && nilai <= 73) return "B";
        else if (nilai > 60 && nilai <= 65) return "C+";
        else if (nilai > 50 && nilai <= 60) return "C";
        else if (nilai > 39 && nilai <= 50) return "D";
        else return "E";
    }
    
}
