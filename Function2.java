
package siddharthsbegbasic;
import java.util.Scanner;
public class Function2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        boolean flag = false;
        for(int i=2;i<=num/2;i++){
            if(checkPrime(i)){
                if(checkPrime(num-i)){
                    System.out.println(num+" = "+i+" + "+(num-i));
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Cannot be expressed as the sum of two prime numbers.");
        }
    }
    public static boolean checkPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
