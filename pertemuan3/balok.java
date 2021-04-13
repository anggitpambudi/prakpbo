/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Acer
 */
public class balok extends persegipanjang implements permukaanvolume {
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        int p = this.panjang;
        int l = this.lebar;
        int t = this.tinggi;
        return 2 * ((p * l) + (p * t) + (l * t)) ;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
}