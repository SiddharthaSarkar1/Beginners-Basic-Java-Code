
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops16 {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int num;
        System.out.println("Enter a  number : ");
        num = scn.nextInt();
        
        System.out.println("The Factors of "+num+" is : ");
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
