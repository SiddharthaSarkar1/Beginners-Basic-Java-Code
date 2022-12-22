
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num,rem,tempnum, revnum = 0;
        System.out.println("Enter a number : ");
        num = scn.nextInt();
        tempnum = num;
        
        while(tempnum != 0){
            rem = tempnum % 10;
            revnum = revnum*10 + rem;
            tempnum = tempnum / 10;
        }
        System.out.println("The reverse of the number "+num+" is : "+revnum);
    }
}
