package siddharthsbegbasic;

import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter the value of n : ");
        n = scn.nextInt();
        
        for(int i=0;i<=n;i++){
            sum = sum + n;
        }
        System.out.println("Sum of natural numbers up to "+n+" is : "+sum);
    }
}
