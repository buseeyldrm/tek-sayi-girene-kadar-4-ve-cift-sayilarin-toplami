import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        int n ;
        int toplam=0;

        do {
            System.out.print("Sayı Giriniz: ");
            n= klavye.nextInt();
            if (n%2==0 && n%4==0){
                toplam+=n;

            }

        }


        while (n%2==0);

        System.out.println();
        System.out.println("Tek Sayı girene kadar cift ve 4'ün katı olan sayıların toplamı: " +toplam);

    }
}