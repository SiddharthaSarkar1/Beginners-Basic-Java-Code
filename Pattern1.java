
package siddharthsbegbasic;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the value of m : ");
        m = scn.nextInt();
        System.out.println("Enter the value of n : ");
        n = scn.nextInt();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
