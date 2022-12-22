
package siddharthsbegbasic;
import java.util.Scanner;
public class Loop11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base, exponent, result;
        System.out.println("Enter the base : ");
        base = scn.nextInt();
        System.out.println("Enter the exponent : ");
        exponent = scn.nextInt();
        result = 1;
        for(int i=1;i<=exponent;i++){
            result = result * base;
        }
        System.out.println("Power of "+base+"^"+exponent+" is : "+result);
    }
}
