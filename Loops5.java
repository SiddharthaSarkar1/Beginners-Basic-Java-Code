
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first, second, fibonum, num;
        System.out.println("Enter how many fibonicci numbers do you want : ");
        num = scn.nextInt();
        first = 0;
        second = 1;
        System.out.print(first+"\t");
        System.out.print(second+"\t");
        
        fibonum = first + second;
         
        while(fibonum<=num){
            System.out.print(fibonum+"\t");
            first = second;
            second = fibonum;
            fibonum = first + second;
        }
    }
}
