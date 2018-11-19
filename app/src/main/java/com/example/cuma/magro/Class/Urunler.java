package com.example.cuma.magro.Class;

public class Urunler {
    private String urun_aciklama,urun_fiyat;
    private int urun_resim;

    public Urunler(String urun_aciklama, String urun_fiyat, int urun_resim) {
        this.urun_aciklama = urun_aciklama;
        this.urun_fiyat = urun_fiyat;
        this.urun_resim = urun_resim;
    }

    public String getUrun_aciklama() {
        return urun_aciklama;
    }

    public void setUrun_aciklama(String urun_aciklama) {
        this.urun_aciklama = urun_aciklama;
    }

    public String getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyat(String urun_fiyat) {
        this.urun_fiyat = urun_fiyat;
    }

    public int getUrun_resim() {
        return urun_resim;
    }

    public void setUrun_resim(int urun_resim) {
        this.urun_resim = urun_resim;
    }
}
