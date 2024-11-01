import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int banyakNilai = 0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        banyakNilai = sc.nextInt();

        int[] arrNilai = new int[banyakNilai];
        for (int i = 1; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i+ " : ");
            arrNilai[i] = sc.nextInt();
        }
        int key, hasil = 0;
        System.out.print("Masukkan nilai yang dicari: ");
        key = sc.nextInt();

        for (int i = 1; i < arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }
         System.out.println();
         System.out.println("Nilai " +key+ " ketemu, merupakan nilai mahasiswa ke-" +hasil);
         System.out.println();
    }
}
