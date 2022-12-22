package siddharthsbegbasic;

import java.util.Scanner;
public class IfElse6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, sum;
        sum = 0;
        System.out.println("Enter the n value : ");
        n = scn.nextInt();
        
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        
        System.out.println("The sum is : "+sum);
    }
}
