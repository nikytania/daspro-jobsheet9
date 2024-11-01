import java.util.Scanner;

public class Tugas1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        
        System.out.print("Masukkan nilai mahasiswa ke-1: ");
        nilaiMhs[0] = sc.nextInt();
        int tertinggi = nilaiMhs[0], terendah = nilaiMhs[0], totalNilai = nilaiMhs[0];

        for (int i = 1; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println();

        double rata2 = totalNilai / nilaiMhs.length;
        System.out.println();

        System.out.println("Daftar nilai mahasiswa: ");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        System.out.println();
        System.out.println("Rata-rata nilai mahasiswa: " + rata2);
        System.out.println("Nilai mahasiswa yang tertinggi: " + tertinggi);
        System.out.println("Nilai mahasiswa yang terendah: " + terendah); 
    
    }
}