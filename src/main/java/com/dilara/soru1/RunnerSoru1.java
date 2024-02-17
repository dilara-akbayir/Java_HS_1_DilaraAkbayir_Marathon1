package com.dilara.soru1;

public class RunnerSoru1 {
    public static void main(String[] args) { //deneme amaçlı main methodu açtım
        SayiDizisi sayiDizisi = new SayiDizisi();
        sayiDizisi.add(5); //yeni eleman ekledim
        sayiDizisi.add(10); //yeni eleman ekledim
        sayiDizisi.add(20); //yeni eleman ekledim
        System.out.println("----------------");
        for (int i = 0; i < sayiDizisi.elemanSayisi; i++) { //elemanları listeledim, dizi olduğundan for döngüsü ile
                                                            //elemanları gezerek yazdırma işlemi yaptım
            System.out.println(sayiDizisi.listele()[i]);
        }
        System.out.println("----------------");
        sayiDizisi.add(1,7); //index 1'e 7 sayısını ekledim (sonraki elemanların index sayısını 1 arttırır)
        for (int i = 0; i < sayiDizisi.elemanSayisi; i++) {
            System.out.println(sayiDizisi.listele()[i]);
        }
        System.out.println("----------------");
        sayiDizisi.remove(2); //index 2'yi sildim
        for (int i = 0; i < sayiDizisi.elemanSayisi; i++) {
            System.out.println(sayiDizisi.listele()[i]);
        }

    }
}
