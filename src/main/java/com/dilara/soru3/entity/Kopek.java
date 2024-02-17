package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IAyakli;

public class Kopek extends Hayvan implements IAyakli { //Hayvandan miras aldı, IAyakli interfaceine implement etti.
    public String cins;
    public String kurkRengi;
    public int kuyrukUzunlugu;
    public final int ayakSayisi=4; //final kullanarak sınıfa ait ayak sayısını sabitledim

    public Kopek(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getKurkRengi() {
        return kurkRengi;
    }

    public void setKurkRengi(String kurkRengi) {
        this.kurkRengi = kurkRengi;
    }

    public int getKuyrukUzunlugu() {
        return kuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(int kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    public int getAyakSayisi() { //final olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return ayakSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kopek{");
        sb.append("cins='").append(cins).append('\'');
        sb.append(", kurkRengi='").append(kurkRengi).append('\'');
        sb.append(", kuyrukUzunlugu=").append(kuyrukUzunlugu);
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

    public void sesCikar() {
        System.out.println("Hav hav");
    }

    @Override
    public void suIc() {
        System.out.println("Köpek su içti.");
    }

    @Override
    public void yuru() {
        System.out.println("Köpek yürüdü.");
    }

    @Override
    public void kos() {
        System.out.println("Köpek koştu.");
    }

    @Override
    public void zipla() {
        System.out.println("Köpek zıpladı.");
    }
}
