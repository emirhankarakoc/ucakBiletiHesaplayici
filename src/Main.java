import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
     Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
     Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara
     göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
        int mesafe,kisininYasi;
        byte yolculukTipi;
        System.out.println("Ucak Bileti Fiyatini Hesaplayan Programa Hosgeldiniz.");
        System.out.println("Uculacak mesafeyi km bazindan yaziniz: ");
        mesafe= scanner.nextInt();
        while (mesafe<0){
            System.out.println("Hatali veri girdiniz. Lutfen pozitif bir deger giriniz: ");
            mesafe = scanner.nextInt();
        }
        //
        System.out.println("Lutfen ucucak kisinin yasini giriniz: ");
        kisininYasi = scanner.nextInt();
        while (kisininYasi<=0){
            System.out.println("Hatali veri girdiniz. Lutfen pozitif bir deger giriniz: ");
            kisininYasi = scanner.nextInt();
        }
        //
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ).");
        yolculukTipi = scanner.nextByte();
        while (yolculukTipi!=2 && yolculukTipi!=1){
            System.out.println("Hatali veri girdiniz. Lutfen '1' veya '2' giriniz: ");
            yolculukTipi = scanner.nextByte();
        }
        //################################################################
        int normalTutar = mesafe/10;
        if(kisininYasi<12){
            //cocuk indirimi, %50
            normalTutar /= 2;

        }
        else if (kisininYasi>=12 && kisininYasi<=24){
            //genc indirimi.
            normalTutar = normalTutar *9/10;
        }
        else if (kisininYasi>=65){
            normalTutar = normalTutar*7/10;
        }
        else{}

        if (yolculukTipi==2){
            normalTutar = normalTutar*8/10;
        }


        System.out.println("Toplam odenicek fiyat :  "+normalTutar+"tl'dir, gecmis olsun.");














    }
}
