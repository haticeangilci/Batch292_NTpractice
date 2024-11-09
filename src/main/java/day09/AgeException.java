package day09;

public class AgeException extends RuntimeException {
    //paramsiz cons.
    public AgeException(){
        super("Eğer bu değer çağrılıyorsa demek ki yaşınız tutmuyor demektir.");
        System.out.println("detay...");

    }
    public AgeException(String message){
        super(message);
    }

}
