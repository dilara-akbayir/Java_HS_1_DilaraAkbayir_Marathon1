package com.dilara.soru1;

public class SayiDizisi {
    public int[] sayilar;
    public int elemanSayisi =0;

    public void add(int sayi){ //yeni eleman ekler
        elemanSayisi++;
        if(elemanSayisi ==1){
            sayilar = new int[1];    //İlk defa sayı tanımlandığı için
            sayilar[0]=sayi;
        }else{     // sayı eklemelerinde geçici diziye kayıtları taşıyarak işlem yapar.
            int[] geciciDizi = new int[elemanSayisi];

            for (int i = 0; i < sayilar.length ; i++) {
                geciciDizi[i]= sayilar[i];
            }
            geciciDizi[elemanSayisi-1] = sayi;
            sayilar = geciciDizi;
        }
    }

    public void remove(int index) { //diziden istenilen elemanı siler
        elemanSayisi--;
        int[] geciciDizi = new int[elemanSayisi];
        int deger = 0 ;
        for(int i = 0; i< sayilar.length; i++){
            if(i==index){
                deger ++;
                continue;
            }
            geciciDizi[i-deger]= sayilar[i];
        }
        sayilar =geciciDizi;
    }

    public void print(){
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(sayilar[i]);
        }
    }


    public void add(int index, int sayi){ //mevcut liste içinde istenilen yere yeni bir sayı ekler
        elemanSayisi++;
        int count = 0;
        int[] temp = new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {

            if (i==index) {
                temp[i]=sayi;
                count--;

            }else if (1<index) {
                temp[i] = sayilar[i];

            }else {
                temp[i] = sayilar[i+count];
            }
        }
        sayilar = temp;
    }

    public int[] listele(){ //array'in kendisini dönen method
        return sayilar;
    }

}
