package com.dilara.soru3.entity;

import com.dilara.soru3.repository.ICanli;

public class Hayvan extends BaseEntity implements ICanli { //baseEntity'den miras aldı, ICanlı interface'ine implement etti.
    public String yasamAlani;
    public int yas;
    boolean evcilMi;
    public int yasamDongusu; //saat olarak hayvanın yaşam süresini ifade eder

    boolean yasiyorMu=true;
    boolean acMi;
    int aclikSuresi;

    /**
     * Hareket Durumu
     *  1-Uyuyor
     *  2-Hareket Halinde
     */
    int hareketDurumu;


    @Override
    public void yemekYe() {
        acMi = false;
        aclikSuresi = 0;
        System.out.println(getClass().getSimpleName()+" yemek yedi.");
    }

    @Override
    public void uyu() {
        if (hareketDurumu == 2)
            hareketDurumu = 1;
        System.out.println(getClass().getSimpleName()+" uyudu.");
    }

    @Override
    public void sesCikar() {

    }

    @Override
    public void uyan() {
        if (hareketDurumu == 1)
            hareketDurumu = 2;
        System.out.println(getClass().getSimpleName()+" uyandı.");
    }




    /**
     * 1 yaşam döngüsü -> 1 saatlik zaman dilimine denk gelir.
     * 24-> 1 güne denk gelir.
     */
    @Override
    public void zamanGecir() {
        if (yasamDongusu%24==0){
            System.out.println("Gün : "+(yasamDongusu/24));
        }
        if (yasiyorMu) {
            yasamDongusu++;
            aclikSuresi++;
            if (yasamDongusu % 12 == 0) {//her 12 saatte bir uyusun.
                System.out.println(getClass().getSimpleName()+" uyudu.");
                hareketDurumu = 1;
            }
            if (yasamDongusu % 12 == 2 && hareketDurumu == 1) {//hayvan uyuduktan sonra 2 saat geçtiyse ve hala uyuyprsa uyansın
                System.out.println(getClass().getSimpleName()+" uyandı.");
                hareketDurumu = 2;
            }
            if (yasamDongusu % 5 == 0) {
                if (aclikSuresi >= 25)
                    yasiyorMu = false;
                acMi = true;
            }
        }else {
            System.out.println(getClass().getSimpleName()+" artık yaşamıyor.");
        }
    }

    public Hayvan(String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        this.yasamAlani = yasamAlani;
        this.yas = yas;
        this.evcilMi = evcilMi;
        this.yasamDongusu = yasamDongusu;
        this.yasiyorMu = yasiyorMu;
        this.acMi = acMi;
        this.aclikSuresi = aclikSuresi;
        this.hareketDurumu = hareketDurumu;
    }

    public Hayvan(Long id, Long createAt, Long updateAt, int state, String yasamAlani, int yas, boolean evcilMi, int yasamDongusu, boolean yasiyorMu, boolean acMi, int aclikSuresi, int hareketDurumu) {
        super(id, createAt, updateAt, state);
        this.yasamAlani = yasamAlani;
        this.yas = yas;
        this.evcilMi = evcilMi;
        this.yasamDongusu = yasamDongusu;
        this.yasiyorMu = yasiyorMu;
        this.acMi = acMi;
        this.aclikSuresi = aclikSuresi;
        this.hareketDurumu = hareketDurumu;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isEvcilMi() {
        return evcilMi;
    }

    public void setEvcilMi(boolean evcilMi) {
        this.evcilMi = evcilMi;
    }

    public int getYasamDongusu() {
        return yasamDongusu;
    }

    public void setYasamDongusu(int yasamDongusu) {
        this.yasamDongusu = yasamDongusu;
    }

    public boolean isYasiyorMu() {
        return yasiyorMu;
    }

    public void setYasiyorMu(boolean yasiyorMu) {
        this.yasiyorMu = yasiyorMu;
    }

    public boolean isAcMi() {
        return acMi;
    }

    public void setAcMi(boolean acMi) {
        this.acMi = acMi;
    }

    public int getAclikSuresi() {
        return aclikSuresi;
    }

    public void setAclikSuresi(int aclikSuresi) {
        this.aclikSuresi = aclikSuresi;
    }

    public int getHareketDurumu() {
        return hareketDurumu;
    }

    public void setHareketDurumu(int hareketDurumu) {
        this.hareketDurumu = hareketDurumu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hayvan{");
        sb.append("yasamAlani='").append(yasamAlani).append('\'');
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




