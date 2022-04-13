
package latsol;
import java.util.Scanner;

/**
 *
 * @author Bunga Cantika
 */
public class tiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = 1;
        System.out.print("Masukan nilai N = ");
        int nilai = input.nextInt();
        int total = 0;
        
        System.out.print("Total bilangan = ");
        while (awal <= nilai) {
            System.out.print(awal + " + ");
            total += awal;
            awal++;      
        }
        System.out.println("= " + total);
    
}
}
