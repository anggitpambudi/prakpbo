/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
import pertemuan3.balok;
import pertemuan3.kerucut;

/**
 *
 * @author Acer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ulang = false;
        Scanner input;
        input = new Scanner(System.in);
        
        do{
            System.out.println("\nINPUT");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");

            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
		
            if(pilih==1){
            bagianBalok(input);
            }
            else if(pilih==2){
            bagianKerucut(input);
            }
            else if(pilih==3){
            ulang = true;
            }
        }while(!ulang);
    }
    
    public static void bagianBalok(Scanner input){
	int panjang,lebar,tinggi;

        System.out.print("\nINPUT\n");
        System.out.print("  Panjang : ");
        panjang = input.nextInt();
        System.out.print("  Lebar : ");
        lebar = input.nextInt();
        System.out.print("  Tinggi : ");
        tinggi = input.nextInt();
        balok balok = new balok(panjang,lebar,tinggi);

        System.out.println("\nOUTPUT\n");
        System.out.println("Luas Persegi = " + balok.luas());
        System.out.println("Keliling Persegi = " + balok.keliling());
        System.out.println("Volume Balok = " + balok.volume());
        System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());

    }
    
    public static void bagianKerucut(Scanner input){
	int tinggi,jari2;

        System.out.print("INPUT\n\n");
        System.out.print("  Jari - jari : ");
        jari2 = input.nextInt();
        System.out.print("  Tinggi : ");
        tinggi = input.nextInt();
        kerucut kerucut;
        kerucut = new kerucut(jari2,tinggi);

        System.out.println("OUTPUT");
        System.out.println("Luas Lingkaran = " + kerucut.luas());
        System.out.println("Keliling Lingkaran = " + kerucut.keliling());
        System.out.println("Volume Kerucut = " + kerucut.volume());
        System.out.println("Luas Permukaan Kerucut = " + kerucut.luasPermukaan());
    }
}
