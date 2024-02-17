package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;

public class Buzagi extends Inek implements IAyakli { //Buzağı inek yavrusu olduğundan parent'ı inek oldu, ondan miras aldı.
                                                      // IAyakli interface'ini implement etti
    public final static String className = "Buzagi (İnek yavrusu)"; //final kullanarak sınıfın adını sabitledim

    public Buzagi(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
        //super keyword'ü miras aldığı sınıfın parametrelerini sağlıyor
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buzagi{");
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
}
