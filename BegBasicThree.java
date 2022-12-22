
package siddharthsbegbasic;

import java.util.Scanner;

public class BegBasicThree {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = scn.nextInt();
        System.out.println("Enter the second number : ");
        int second = scn.nextInt();
        int result = first+second;
        System.out.println("Addition of two given number is :"+result);
    }
}
