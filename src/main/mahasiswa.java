package main;


public class mahasiswa {
    String nama;
    int nim;
    int usia;
    int uts;
    int uas;
    int nilaiakhir;

    public mahasiswa(String nama, int nim, int usia, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    int nilaiakhir()
        {
            nilaiakhir=(uts+uas)/2;
            return nilaiakhir;
        }

    }
