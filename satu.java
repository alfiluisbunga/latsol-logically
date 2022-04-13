
package latsol;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Bunga Cantika
 */
public class satu {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, hasil;

        System.out.print("Masukkan bilangan pertama = ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        bil2 = input.nextInt();
        
        hasil = Math.max(bil1, bil2);
        System.out.println("Angka yang lebih besar adalah: " + hasil);
    }
    
}
