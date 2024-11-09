package day02;

import java.util.Scanner;

public class C05_forloops {
    public static void main(String[] args) {
        /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 100'den kücük pozitif bir tamsayi giriniz");
        byte sayi=input.nextByte();//Byte wrapper class byte ise primitive data turudur
        if (sayi<0||sayi>100){
            System.out.println("lütfen 100'den kücük bir pozitif tamsayi giriniz");
        }
        else {
            //1.yol
           // for (byte i = 1; i <= sayi; i++) {
           //     if (i%3==0){
           //         System.out.print(i + " ");
           // }}

          // for (int i = 3; i <=sayi ; i+=3) {//3691215
          //     System.out.print(i+" ");
          // }
        }

        for (int i = 0; i < 255; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i = 37; i <65 ; i++) {
            System.out.print(i+" ");
        }








    }
}
