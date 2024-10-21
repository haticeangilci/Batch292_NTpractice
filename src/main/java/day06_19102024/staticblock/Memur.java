package day06_19102024.staticblock;

public class Memur {
    public int id;
    public Memur(){
        id=sayac;
        sayac++;
    }
    private static int sayac;

    static {
        sayac=3568;
    }
}