
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, count=0;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        
        for(int i=2;i*i<=num;i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("The number "+num+" is a prime number.");
        }else{
            System.out.println("The number "+num+" is not a prime number.");
        }
    }
}
