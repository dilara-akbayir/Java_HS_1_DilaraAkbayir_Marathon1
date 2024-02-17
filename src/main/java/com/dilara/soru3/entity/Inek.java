package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;
import com.dilara.soru3.repository.IInek;

public class Inek extends Hayvan implements IAyakli, IInek { //çoklu implement etme
    public final int ayakSayisi=4; //final kullanarak sınıfa ait ayak sayısını sabitledim

    public Inek(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
        //super keyword'ü miras aldığı sınıfın parametrelerini sağlıyor.
    }

    public int getAyakSayisi() { //final değer olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return ayakSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inek{");
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

    @Override
    public void sesCikar() {
        System.out.println("Möö mööö");
    }
    @Override
    public void suIc() {
        System.out.println(getClass().getSimpleName()+" su içti.");//Koyun sınıfı aynı zamanda kuzu classının parent'ı
    }                                                              //olduğu için Koyun yerine getClass.getSimpleName
                                                                   //kullanmak en doğrusu.


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

    @Override
    public void sutVer() {
        System.out.println(getClass().getSimpleName()+" süt verdi.");
    }
}
