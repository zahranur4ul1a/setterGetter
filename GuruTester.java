//Driver Class

import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println("Masukkan Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Masukkan Status : ");
        String status = input.nextLine();
        System.out.println("Masukkan NIP : ");
        int nip = input.nextInt();
        input.close();

        Guru guru = new Guru(nip, nama, mapel, status);
        System.out.println("--------");
        guru.print();
        System.out.println("--------");

    }
}
