package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner B = new Scanner(System.in);
       int Pilihan;

       Scanner inputUser = new Scanner(System.in);
       System.out.println("Input Data=======");
       System.out.print("Nama   :");
       String nama = inputUser.nextLine();

       System.out.print("Nim    :");
       int nim = inputUser.nextInt();

       System.out.print("Usia   :");
       int usia = inputUser.nextInt();

       System.out.print("Nilai UTS  : ");
       int uts = inputUser.nextInt();

       System.out.print("Nilai UAS  :");
       int uas = inputUser.nextInt();

       mahasiswa mahasiswa = new mahasiswa(nama, nim, usia, uts, uas);
        System.out.println("");
        System.out.println("");

    do  
    {  
        System.out.println("Opsi=======");
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Edit data");
        System.out.println("3. Exit");
        System.out.println("Masukkan Pilihan : "); Pilihan = B.nextInt();
            switch(Pilihan)
            {
                case 1:
                    System.out.println("Perkenalkan nama saya " + mahasiswa.nama + " NIM " + mahasiswa.nim);
                    System.out.println("Usia : " + mahasiswa.usia);
                    System.out.println("Nilai Akhir  : " + mahasiswa.nilaiakhir());
                    break;

                case 2:
                    System.out.println("=======Input Data=======");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Nama   :");
                    mahasiswa.nama = input.nextLine();

                    System.out.print("Nim    :");
                    mahasiswa.nim = input.nextInt();

                    System.out.print("Usia   :");
                    mahasiswa.usia = input.nextInt();

                    System.out.print("Nilai UTS  : ");
                    mahasiswa.uts = input.nextInt();

                    System.out.print("Nilai UAS  :");
                    mahasiswa.uas = input.nextInt();
                    break;

                case 3:
                    break;
            }
    }while(Pilihan != 3);
    }
}