
package siddharthsbegbasic;

import java.util.Scanner;
public class Loops6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, gcd;
        gcd = 1;
        System.out.println("Enter two numbers : ");
        a = scn.nextInt();
        b = scn.nextInt();
        
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is : "+gcd);
    }
}
