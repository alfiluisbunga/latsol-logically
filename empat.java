
package latsol;
import java.util.Scanner;

/**
 *
 * @author Bunga Cantika
 */
public class empat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = input.nextInt();
        
        String nilai[]=new String[N];
        
        for(int i=0;i<nilai.length;i++)
        {
           System.out.print("Nilai ke "+(i+1)+" : ");
           nilai [i]=input.next();
        }
        
        System.out.println("nilai yang dimasukkan");
        for(int i=0;i<nilai.length;i++){
          System.out.print(nilai[i]);
            
            
        }
        
        
        
    }
    
}
