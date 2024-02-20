import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int yariCap, a;
        double pi = 3.14, alan, cevre, daireDilim;

        // Scanner nesnemiz projemize dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan yaricap bilgisi alindi ve ilgili degiskene atandi.
        System.out.print("Merhabalar.\nLutfen alani ve cevresini hesaplayacagimiz cemberin yaricap bilgisini gir:");
        yariCap = input.nextInt();

        // Alan ve cevre icin gerekli matematiksel islemler yapildi ve bu bilgiler kullanici ile paylasildi.
        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;
        System.out.print("Yaricapini belirtmis oldugun cemberin alani: " + alan + "\nCevresi : " + cevre);

        // Dilim alani icin kullanicidan aci bilgisi alindi. Ayrica maksimum girdi 360'a sabitlendi.
        System.out.print("\nCemberin belli bir diliminin alanini bulabilmem icin lutfen merkez aci bilgisini gir(Max 360 girebilirsin): ");
        a = input.nextInt();
        a = (a > 360) ? 360 : a;

        // Dilim alani icin gerekli matematiksel islem gerceklestirildi.
        daireDilim = (pi * (yariCap * yariCap) * a) / 360;

        // Sonuc kullanici ile paylasildi.
        System.out.print("Acisi belirtilen dilim dairenin alani: " + daireDilim);
    }
}