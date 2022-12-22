
package siddharthsbegbasic;
import java.util.Scanner;
public class BegBasicSix {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = scn.nextInt();
        System.out.println("Enter second number : ");
        int second = scn.nextInt();
        
        int tempval;
        tempval = first;
        first = second;
        second = tempval;
        
        System.out.println("Swapped numbers are -->");
        
        System.out.println("First : "+first);
        System.out.println("Second : "+second);
    }
}
