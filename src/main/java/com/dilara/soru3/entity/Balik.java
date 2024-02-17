package com.dilara.soru3.entity;

import com.dilara.soru3.repository.IYuzgecli;

public class Balik extends Hayvan implements IYuzgecli { //Hayvandan miras aldı, IYuzgecli interfaceine implement etti.
    public String cins;
    public String pulRengi;
    public int yasadigiDerinlik;

    public Balik(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(yasamAlani, yas, evcilMi, yasamDongusu, yasiyorMu, acMi, aclikSuresi, hareketDurumu);
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getPulRengi() {
        return pulRengi;
    }

    public void setPulRengi(String pulRengi) {
        this.pulRengi = pulRengi;
    }

    public int getYasadigiDerinlik() {
        return yasadigiDerinlik;
    }

    public void setYasadigiDerinlik(int yasadigiDerinlik) {
        this.yasadigiDerinlik = yasadigiDerinlik;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Balik{");
        sb.append("cins='").append(cins).append('\'');
        sb.append(", pulRengi='").append(pulRengi).append('\'');
        sb.append(", yasadigiDerinlik=").append(yasadigiDerinlik);
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
    public void yuz() {
        System.out.println(getClass().getSimpleName()+" yüzdü.");
    }
}
