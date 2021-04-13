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
public class lingkaran implements luaskeliling {
    double jari2;

    public lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }

    @Override
    public double luas() {
        return 22/7 * this.jari2 * this.jari2; 
    }

    @Override
    public double keliling() {
        return 22/7 * this.jari2 * 2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
}