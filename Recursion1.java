
package siddharthsbegbasic;
import java.util.Scanner;
public class Recursion1 {
    public static int recSum(int n){
        if(n == 1){
            return 1;
        }
        return n + recSum(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scn.nextInt();
        int result = recSum(num);
        System.out.println("Sum of "+num+" natural numbers is : "+result);
    }
}
