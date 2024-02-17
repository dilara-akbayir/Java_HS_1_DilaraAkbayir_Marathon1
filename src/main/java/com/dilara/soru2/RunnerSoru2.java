package com.dilara.soru2;

public class RunnerSoru2 {
    public static void main(String[] args) {

        CustomStringTr customStringTr = new CustomStringTr();
        System.out.println("İfade: " +customStringTr.getIfade()); //ifadeyi yazdırıyorum

        System.out.println("----------------------");

        System.out.println("İfadenin uzunluğu: "+customStringTr.uzunluk()); //ifadenin uzunluğunu yazdırıyorum

        System.out.println("5. karakter: "+customStringTr.karakteriYazdir(5)); //ifadenin 5.karakterini yazdırıyorum

        System.out.println("String içinde nerede d var: "+customStringTr.enSonNeredeVar('d')); //son bulunduğu indexi verir

        System.out.println(customStringTr.tumKarakterlerKucukHarf()); //tüm karakterleri küçük yapar

        System.out.println(customStringTr.tumKarakterlerBuyukHarf()); //tüm karakterleri büyük yapar

        System.out.println(customStringTr.araliktakiKarakterleriYazdir(1,3)); // [1,3) indexlerindeki karakterleri yazdırır

        System.out.println(customStringTr.degistir("Java", "python")); //replace(oldValue,newValue)

        System.out.println(customStringTr.iceriyorMu("dil")); //içerip içermediğine bakar, true/false döner

        System.out.println(customStringTr.ileBasliyorMu("K")); //ifadenin hangi karakterle başladığına bakar, true/false döner

        System.out.println(customStringTr.tamamenAyniMi("Kodlama seviyorum.")); //girilen ifade ile tanımlanan ifadenin tamamen
        //aynı olup olmadığına bakar, true/false döner.

    }
}
