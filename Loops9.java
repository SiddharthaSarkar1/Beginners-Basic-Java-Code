
package siddharthsbegbasic;

import java.util.Scanner;

public class Loops9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rem, num, tempnum, sum = 0;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        tempnum = num;
        
        while(tempnum != 0){
            rem = tempnum % 10;
            sum = sum + rem;
            tempnum = tempnum / 10;
        }
        System.out.println("The digit sum of number "+num+" is : "+sum);
    }
}
