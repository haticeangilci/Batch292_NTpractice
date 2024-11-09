package day02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
       /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */

        //1. adım
        Scanner input=new Scanner(System.in);
        //2. adım
        System.out.println("Lütfen kontrol etmek istediginiz harfi giriniz : ");
        //3. adım
        String harf=input.nextLine().toLowerCase();

        //4. adım kontrol edicez!!!
        harf=harf.replaceAll("[^a-z]","*");
        harf=harf.replaceAll("[aeiou]","a");


        if (harf.contains("*")||harf.length()!=1){//--> kesinlikle harf dışında bir yapıdır
            System.out.println("Hatalıdır");//
        }else {
            //sesli mi sessiz mi diye kontrol edicem
            if (harf.equals("a")){
                System.out.println("Sesli harftir");
            }else {
                System.out.println("Sessiz harftir");
            }
        }

        //ternary'e cevirme

        String sonuc= (harf.contains("*")||harf.length()!=1)? ("Girdiginiz karakter gecersizdir") : (harf.equals("a") ?  "sesli harftir": "sessiz harftir");
        System.out.println("sonuc = " + sonuc);


    }
}
