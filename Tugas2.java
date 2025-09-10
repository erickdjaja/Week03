package Week3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();

        int pilihan;
        do {
            System.out.println("\n----------------------------");
            System.out.println("String anda : " + nama);
            System.out.println("1. charAt");
            System.out.println("2. length");
            System.out.println("3. substring(n)");
            System.out.println("4. substring(m,n)");
            System.out.println("5. contains");
            System.out.println("6. concat");
            System.out.println("7. replace");
            System.out.println("8. split");
            System.out.println("9. lowerCase");
            System.out.println("10. upperCase");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buffer

            switch (pilihan) {
                case 1:
                    System.out.println("-----charAt-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    int idx = sc.nextInt();
                    System.out.println("Hasil : " + nama.charAt(idx));
                    break;

                case 2:
                    System.out.println("-----length-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.length());
                    break;

                case 3:
                    System.out.println("-----substring(n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    int start = sc.nextInt();
                    System.out.println("Hasil : " + nama.substring(start));
                    break;

                case 4:
                    System.out.println("-----substring(m,n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input mulai : ");
                    int m = sc.nextInt();
                    System.out.print("Input akhir : ");
                    int n = sc.nextInt();
                    System.out.println("Hasil : " + nama.substring(m, n));
                    break;

                case 5:
                    System.out.println("-----contains-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String kata = sc.nextLine();
                    System.out.println("Hasil : " + nama.contains(kata));
                    break;

                case 6:
                    System.out.println("-----concat-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String tambahan = sc.nextLine();
                    System.out.println("Hasil : " + nama.concat(" " + tambahan));
                    break;

                case 7:
                    System.out.println("-----replace-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input kata yang diganti : ");
                    String lama = sc.nextLine();
                    System.out.print("Input kata pengganti : ");
                    String baruStr = sc.nextLine();
                    System.out.println("Hasil : " + nama.replace(lama, baruStr));
                    break;

                case 8:
                    System.out.println("-----split-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String delimiter = sc.nextLine();
                    String[] hasilSplit = nama.split(delimiter);
                    for (String s : hasilSplit) {
                        System.out.println("Hasil : " + s);
                    }
                    break;

                case 9:
                    System.out.println("-----lowerCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toLowerCase());
                    break;

                case 10:
                    System.out.println("-----upperCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toUpperCase());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
