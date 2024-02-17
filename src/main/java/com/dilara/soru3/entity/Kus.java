package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IKanatli;

public class Kus extends Hayvan implements IKanatli { //Hayvandan miras aldı, IKanatli interfaceine implement etti.
    public int yasadigiYukseklik;
    public String tuyRengi;
    public final int ayakSayisi=2; //final kullanarak sınıfa ait ayak sayısını sabitledim

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kus{");
        sb.append("yasadigiYukseklik=").append(yasadigiYukseklik);
        sb.append(", tuyRengi='").append(tuyRengi).append('\'');
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

    public Kus(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public int getYasadigiYukseklik() {
        return yasadigiYukseklik;
    }

    public void setYasadigiYukseklik(int yasadigiYukseklik) {
        this.yasadigiYukseklik = yasadigiYukseklik;
    }

    public String getTuyRengi() {
        return tuyRengi;
    }

    public void setTuyRengi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    public int getAyakSayisi() { //final olduğu için sadece getter kullanıyoruz. Zaten sabitlediğimiz bir ifade.
        return ayakSayisi;
    }

    public void sesCikar() {
        System.out.println("Cik cik");
    }

    @Override
    public void suIc() {
        System.out.println("Kuş su içti.");
    }

    @Override
    public void uc() {
        System.out.println("Kuş uçtu.");
    }

    @Override
    public void kanatCirp() {
        System.out.println("Kuş kanat çırptı.");
    }

    @Override
    public void dalaKon() {
        System.out.println("Kuş dala kondu.");
    }
}
