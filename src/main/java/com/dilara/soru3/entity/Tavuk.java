package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;

public class Tavuk extends Hayvan implements IAyakli { //Hayvandan miras aldı, IAyakli interface'ini implement etti.
    public final int ayakSayisi=2;

    public Tavuk(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public int getAyakSayisi() { //final olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return ayakSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tavuk{");
        sb.append("ayakSayisi=").append(ayakSayisi);
        sb.append(", yasamAlani='").append(yasamAlani).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", evcilMi=").append(evcilMi);
        sb.append(", yasamDongusu=").append(yasamDongusu);
        sb.append(", yasiyorMu=").append(yasiyorMu);
        sb.append(", acMi=").append(acMi);
        sb.append(", aclikSuresi=").append(aclikSuresi);
        sb.append(", hareketDurumu=").append(hareketDurumu);
        sb.append('}');
        return sb.toString();
    }

    public void sesCikar() {
        System.out.println("Ööröhhöö");
    }

    @Override
    public void suIc() {
        System.out.println("Tavuk su içti.");
    }

    @Override
    public void yuru() {
        System.out.println("Tavuk yürüdü.");
    }

    @Override
    public void kos() {
        System.out.println("Tavuk koştu.");
    }

    @Override
    public void zipla() {
        System.out.println("Tavuk zıpladı.");
    }

    public static void yumurtla() { //static method kullanıldı.
        System.out.println("Tavuk yumurtladı.");
    }
}
