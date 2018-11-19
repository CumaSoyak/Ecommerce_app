package com.example.cuma.magro.Class;

public class Kategoriler {
    private int kategori_resim;
    private  String kategori_isim;

    public Kategoriler(int kategori_resim, String kategori_isim) {
        this.kategori_resim = kategori_resim;
        this.kategori_isim = kategori_isim;
    }

    public int getKategori_resim() {
        return kategori_resim;
    }

    public void setKategori_resim(int kategori_resim) {
        this.kategori_resim = kategori_resim;
    }

    public String getKategori_isim() {
        return kategori_isim;
    }

    public void setKategori_isim(String kategori_isim) {
        this.kategori_isim = kategori_isim;
    }
}
