package com.mi.e020320052.nurannisa.resepmasakan_homework;

public class Resep {
    private String nama, deskripsi, NamaResep, Bahan, CaraPembuatan;
    private int foto, PotoResep;

    public Resep(String seblak, String deskripsi, int seblak1, String bahan, String caraPembuatan, int seblak2) {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNamaResep() {
        return NamaResep;
    }

    public void setNamaResep(String namaResep) {
        NamaResep = namaResep;
    }

    public String getBahan() {
        return Bahan;
    }

    public void setBahan(String bahan) {
        Bahan = bahan;
    }

    public String getCaraPembuatan() {
        return CaraPembuatan;
    }

    public void setCaraPembuatan(String caraPembuatan) {
        CaraPembuatan = caraPembuatan;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getPotoResep() {
        return PotoResep;
    }

    public void setPotoResep(int potoResep) {
        PotoResep = potoResep;
    }

    public Resep(String nama, String deskripsi, String namaResep, String bahan, String caraPembuatan, int foto, int potoResep) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        NamaResep = namaResep;
        Bahan = bahan;
        CaraPembuatan = caraPembuatan;
        this.foto = foto;
        PotoResep = potoResep;
    }
}
