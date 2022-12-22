
package siddharthsbegbasic;
import java.util.Scanner;
public class Recursion2 {
    public static int recFact(int n){
        if(n==0){
            return 1;
        }
        return n * recFact(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, result;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        result = recFact(num);
        System.out.println("Factorial of "+num+" is : "+result);
    }
}
