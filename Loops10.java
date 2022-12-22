
package siddharthsbegbasic;
import java.util.Scanner;
import java.lang.Math;
public class Loops10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double base, exponent, result;
        
        System.out.println("Enter the base : ");
        base = scn.nextInt();
        System.out.println("Enter the exponent : ");
        exponent = scn.nextInt();
        
        result = Math.pow(base, exponent);
        
        System.out.println("Power of "+base+"^"+exponent+" is : "+result);
        
    }
}
