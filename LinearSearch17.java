import java.util.Scanner;

public class LinearSearch17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Elemen Array : ");
        int jumlahElemen = sc.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan Elemen array ke-" +i+ ": ");
            arrayInt[i] = sc.nextInt();
            }
        System.out.println("Masukkan key yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("key anda ada di posisi index ke- " +hasil);
        }else{
            System.out.println("key tidak ditemukan");
        }
    }
}

