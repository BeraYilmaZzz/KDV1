import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar, kdvoranı1 = 0.18, kdvoranı2 = 0.08 , kdvli, kdvli2  ;
        Scanner input  = new Scanner (System.in) ;
        System.out.print("Para tutarınızı giriniz : ") ;
        tutar = input.nextDouble() ;
        kdvli = tutar + tutar * kdvoranı1 ;
        kdvli2 = tutar + tutar * kdvoranı2 ;
        if (tutar <=1000)
            System.out.println("KDV dahil tutarınız : " + kdvli);
        if ( tutar >1000) {
            System.out.println("KDV ahil tutarınız : " + kdvli2);
        }
    }
}