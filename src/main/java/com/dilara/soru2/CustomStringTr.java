package com.dilara.soru2;

public class CustomStringTr {
    private String ifade = "Kodlamayı seviyorum. Java dilinde yazıyorum.";
    public int uzunluk(){
        return getIfade().length();
    }

    public char karakteriYazdir(int index){
        return getIfade().charAt(index);
    }

    public int enSonNeredeVar (char ch){
        return getIfade().lastIndexOf(ch);
    }

    public String tumKarakterlerKucukHarf(){
        return getIfade().toLowerCase();
    }

    public String tumKarakterlerBuyukHarf(){
        return getIfade().toUpperCase();
    }

    public String araliktakiKarakterleriYazdir(int baslangic, int bitis){
        return getIfade().substring(baslangic, bitis);
    }

    public String degistir(String eski, String yeni){
        return getIfade().replace(eski, yeni);
    }
    public boolean iceriyorMu(String ifadeParcasi){
        return getIfade().contains(ifadeParcasi);
    }

    public boolean ileBasliyorMu(String harf){
        return getIfade().startsWith(harf);
    }

    public boolean tamamenAyniMi (String ifade){
        return getIfade().equals(ifade);
    }



    public CustomStringTr() {
    }

    public String getIfade() {
        return ifade;
    }

    public void setIfade(String ifade) {
        this.ifade = ifade;
    }
}
