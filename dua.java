
package latsol;
import java.util.Scanner;

/**
 *
 * @author Bunga Cantika
 */
public class dua {
            
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int angka = input.nextInt();

            if(angka % 2 == 1){
                System.out.println(angka + "angka ganjil");
            } else {
                System.out.println(angka + "angka genap");
            }
            
        }
        
        
    }
    
