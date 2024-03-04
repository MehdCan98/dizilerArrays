import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sayilar[] = new int[10];

        int tumToplam =0;
        int ilkToplam=0;

        for (int i =0; i<sayilar.length; i++){

            System.out.println("değer giriniz: ");
            sayilar[i]= input.nextInt();
            tumToplam += sayilar[i];
        }
        ilkToplam = sayilar[0] + sayilar[1];

        double ortalama = tumToplam /ilkToplam;

        System.out.println("tüm değerler toplamı: "+tumToplam);
        System.out.println("--------------------------------------");
        System.out.println("ilk değerler toplamı: "+ilkToplam);
        System.out.println("-------------------------------------------");
        System.out.println("değerler ortalaması: "+ortalama);
    }
}