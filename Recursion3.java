
package siddharthsbegbasic;
import java.util.Scanner;
public class Recursion3 {
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a>b){
            return gcd(a-b, b);
        }
        return gcd(a, b-a);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, result;
        System.out.println("Enter two number : ");
        a = scn.nextInt();
        b = scn.nextInt();
        result = gcd(a, b);
        System.out.println("GCD of "+a+" and "+b+" is : "+result);
    }
}
