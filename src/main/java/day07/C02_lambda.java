package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_lambda {
    public static void main(String[] args) {
        //2) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,23,8));
        rakamlarinKareleri(mylist);
    }
    public static void rakamlarinKareleri(List<Integer>mylist){
        mylist.stream().filter(t->t<10).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //toplamı alsaydık
        //int sum1= mylist.stream().filter(t->t<10).map(t->t*t).reduce(0, Integer::sum);
        //int sum2= mylist.stream().filter(t->t<10).map(t->t*t).reduce(0,(t,u)->t+u);
        //System.out.println("sum = " + sum);
    }
}
