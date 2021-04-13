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
public class kerucut extends lingkaran implements permukaanvolume {
    private int tinggi;

    public kerucut(int tinggi, double jari2) {
        super(jari2);
        this.tinggi = tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public double volume() {
        return ((double)1/3) * this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        double r = this.jari2;
        int t = this.tinggi;
        double s = Math.sqrt((r*r)+(t*t));
        return 22/7 * r * (r + s);
    }
}