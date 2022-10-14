import java.util.Scanner;
public class luas_dan_keliling_lingkaran {
    public static void main(String[] args) {
        float a,b;
        double hasilx;
        double hasilxx,hsk1,hsk2;
        Scanner v = new Scanner(System.in);
        System.out.print("Luas: ");
        a = v.nextFloat();
        System.out.print("keliling: ");
        b = v.nextFloat();

        hasilx = 22 * a * a / 7;
        hasilxx = 3.14 * a * a;
        hsk1 = 22 * b / 7;
        hsk2 = 3.14 * b;
        System.out.println("note: hasil luas lingkaran: hasil1 = kelipatan 7 dan hasil2 = bukan kelipatan 7\n");
        System.out.println("Hasil luas1: "+hasilx+"\nHasil luas2: "+hasilxx+"\n");
        System.out.println("note: hasil keliling lingkaran: hasil1 = kelipatan 7 dan hasil2 = bukan kelipatan 7\n");
        System.out.println("hasil keliling lingkaran1: "+hsk1+"\nhasil keliling lingkaran2: "+hsk2+"\n");

    }
}
