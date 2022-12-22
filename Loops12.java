
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, rem, tempnum, result = 0;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        tempnum = num;
        
        while(tempnum != 0){
            rem = tempnum % 10;
            result = result*10 + rem;
            tempnum = tempnum / 10;
        }
        
        if(result == num){
            System.out.println("The number "+num+" is a palindrome number.");
        }else{
            System.out.println("The number "+num+" is not a palindrome number.");
        }
        
    }
}
