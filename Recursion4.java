
package siddharthsbegbasic;
import java.util.Scanner;
public class Recursion4 {
    public static int power(int b, int e){
        if(e == 0){
            return 1;
        }else{
            return b*power(b,e-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base, exponent, result;
        System.out.println("Enter the base : ");
        base = scn.nextInt();
        System.out.println("Enter the exponent : ");
        exponent = scn.nextInt();
        result = power(base, exponent);
        System.out.println("Power of "+base+"^"+exponent+" is : "+result);
    }
}
