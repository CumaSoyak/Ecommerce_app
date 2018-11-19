package com.example.cuma.magro.Class;

public class Sepet {
    private int urun_resim_sepet;
    private String urun_isim_sepet;
    private String beden_sepet;
    private String renk_sepet;
    private String fiyat_sepet;

    public Sepet(int urun_resim_sepet, String urun_isim_sepet, String beden_sepet, String renk_sepet, String fiyat_sepet) {
        this.urun_resim_sepet = urun_resim_sepet;
        this.urun_isim_sepet = urun_isim_sepet;
        this.beden_sepet = beden_sepet;
        this.renk_sepet = renk_sepet;
        this.fiyat_sepet = fiyat_sepet;

    }

    public int getUrun_resim_sepet() {
        return urun_resim_sepet;
    }

    public void setUrun_resim_sepet(int urun_resim_sepet) {
        this.urun_resim_sepet = urun_resim_sepet;
    }

    public String getUrun_isim_sepet() {
        return urun_isim_sepet;
    }

    public void setUrun_isim_sepet(String urun_isim_sepet) {
        this.urun_isim_sepet = urun_isim_sepet;
    }

    public String getBeden_sepet() {
        return beden_sepet;
    }

    public void setBeden_sepet(String beden_sepet) {
        this.beden_sepet = beden_sepet;
    }

    public String getRenk_sepet() {
        return renk_sepet;
    }

    public void setRenk_sepet(String renk_sepet) {
        this.renk_sepet = renk_sepet;
    }

    public String getFiyat_sepet() {
        return fiyat_sepet;
    }

    public void setFiyat_sepet(String fiyat_sepet) {
        this.fiyat_sepet = fiyat_sepet;
    }
}
