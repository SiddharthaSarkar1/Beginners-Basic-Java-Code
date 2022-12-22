
package siddharthsbegbasic;
import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        
        if(num % 2 == 0){
            System.out.println("The number "+num+" is EVEN.");
        }else{
            System.out.println("The number "+num+" is ODD.");
        }
    }
}
