import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int k;

        System.out.print("Sayı giriniz:");
        k = reader.nextInt();

        int toplam =0 ;
        int sayi = 0 ;

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i%4 == 0) {
                toplam += i ;
                sayi++;
            }        
        }
        double ortalama = toplam /sayi;

        
        System.out.println(ortalama);








    }
}
