
package siddharthsbegbasic;

import java.util.Scanner;

public class BegBasicFour {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int divisor, dividend, quotient, remainder;
        System.out.println("Enter the divisor : ");
        divisor = scn.nextInt();
        System.out.println("Enter the dividend : ");
        dividend = scn.nextInt();
        
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        
        System.out.println("The quotient is : "+quotient);
        
        System.out.println("The remainder is : "+remainder);
        
        
    }
}
