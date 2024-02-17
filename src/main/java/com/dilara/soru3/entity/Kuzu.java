package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;

public class Kuzu extends Koyun implements IAyakli { //Kuzu, koyun yavrusu olduğundan parent'ı Koyun oldu, ondan miras aldı.
    public final String className = "Kuzu (Koyun yavrusu)"; //final kullanarak sınıfın adını sabitledim.

    public Kuzu(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public String getClassName() { //final olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return className;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kuzu{");
        sb.append("className='").append(className).append('\'');
        sb.append(", ayakSayisi=").append(ayakSayisi);
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
}
