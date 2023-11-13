import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata2Lulus,rata2TidakLulus, totalLulus = 0, totalTidakLulus =0;
        int jmlMahasiswa, lulusCount=0, tidakLulusCount=0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jmlMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jmlMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke- "+ (i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] >70) {
                totalLulus += nilaiMhs[i];
                lulusCount++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulusCount++;
            }
        }
        rata2Lulus = totalLulus / lulusCount;
        rata2TidakLulus = totalTidakLulus / tidakLulusCount;
        System.out.println("rata2 nilai lulus = " + rata2Lulus);
        System.out.println("rata2 nilai tidak lulus = " + rata2TidakLulus);
    }
}
