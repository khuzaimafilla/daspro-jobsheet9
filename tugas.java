import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahElemen;
        double rata2;

        System.out.print("Masukkan Jumlah Elemen Array : ");
        jumlahElemen = sc.nextInt();

        int[] array = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan elemen ke- " +(i+1)+ ": ");
            array[i] = sc.nextInt();
        }

        int nilaiTertinggi = array[0], nilaiTerendah = array[0], total = array[0];
        
        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            else if (array[i] > nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }
        rata2 = (double) total / jumlahElemen;
        System.out.println("Nilai tertinggi : "+nilaiTertinggi);
        System.out.println("Nilai Terendah : "+nilaiTerendah);
        System.out.println("Rata : "+rata2);
    }
}
