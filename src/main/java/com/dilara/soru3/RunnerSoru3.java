package com.dilara.soru3;

import com.dilara.soru3.entity.*;

public class RunnerSoru3 {
    public static void main(String[] args) {
        Hayvan koyun1 = new Koyun("Kara",5,false,12,
                false,true,1,2); //polimorhism yapıldı

        System.out.println(koyun1.isAcMi());
        koyun1.yemekYe();
        System.out.println(koyun1.isAcMi());

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        Balik balik1 = new Balik("Su", 2, false,5,
                true,false,0,1);

        System.out.println(balik1.getHareketDurumu());
        balik1.uyan();
        System.out.println(balik1.getHareketDurumu());
        balik1.yuz();

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        Hayvan tavuk1 = new Tavuk("Kara", 2,false,4,
                true,false, 1, 2); //polimorphism yapıldı.

        tavuk1.sesCikar();

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        for (int i = 0; i < 50; i++) {
            try{
                Thread.sleep(200); //istediğimiz hızda kod akışını yavaşlatarak yaşam döngüsünü izleyebiliriz
                                         //Thread.sleep'in çalışması için try catch kullanılmıştır.
            }catch (Exception exception){}
            if (i%6==0)
                tavuk1.yemekYe();
            tavuk1.zamanGecir();
        }

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        Kus kus1 = new Kus("Kara", 1,true,7,
                true,false, 1,2);
        kus1.kanatCirp();
        kus1.uc();
        kus1.uyu();

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        Buzagi buzagi1 = new Buzagi("Kara", 4, false,7,true,
                true,20,2);
        buzagi1.uyu();
        buzagi1.uyan();
        buzagi1.sesCikar();
        buzagi1.sutVer();
        buzagi1.yuru();

        System.out.println("-------------------"); //kodu rahat okumak için ayırdım

        Kopek kopek1 = new Kopek("Kara", 7, true,10,true,
                false,1,1);
        System.out.println(kopek1.isEvcilMi());
        kopek1.suIc();


    }
}
