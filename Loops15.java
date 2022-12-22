
package siddharthsbegbasic;
import java.util.Scanner;
import java.lang.Math;
public class Loops15 {
    public static void main(String[] args) {
        int num, rem, tempnum, digits, sum;
        Scanner scn = new Scanner(System.in);
        digits = sum = 0;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        tempnum = num;
        while(tempnum > 0){
            tempnum = tempnum / 10;
            digits++;
        }
        tempnum = num;
        while(tempnum > 0){
            rem = tempnum % 10;
            sum = sum + (int)(Math.pow(rem, digits));
            tempnum = tempnum / 10;
        }
        
        if(sum == num){
            System.out.println("The number "+num+" is a Armstrong number.");
        }else{
            System.out.println("The number "+num+" is not a Armstrong number.");
        }
        
    }
}
