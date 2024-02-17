package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;

public class Koyun extends Hayvan implements IAyakli { //Hayvandan miras aldı, IAyakli interfaceine implement etti.
    public final int ayakSayisi=4; //final kullanarak sınıfa ait ayak sayısını sabitledim

    public Koyun(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public int getAyakSayisi() { //final olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return ayakSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Koyun{");
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
        System.out.println("Meeee meeee meee");
    }


    @Override
    public void suIc() {
        System.out.println(getClass().getSimpleName()+" su içti."); //Koyun sınıfı aynı zamanda kuzu classının parent'ı
                                                                    //olduğu için Koyun yerine getClass.getSimpleName
                                                                    //kullanmak en doğrusu.
    }

    @Override
    public void yuru() {
        System.out.println(getClass().getSimpleName()+" yürüdü.");
    }

    @Override
    public void kos() {
        System.out.println(getClass().getSimpleName()+" koştu.");
    }

    @Override
    public void zipla() {
        System.out.println(getClass().getSimpleName()+" zıpladı.");
    }
}
