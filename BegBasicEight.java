
package siddharthsbegbasic;
import java.util.Scanner;
public class BegBasicEight {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double firstno, secondno, resno;
        System.out.println("Enter the first decimal no : ");
        firstno = scn.nextDouble();
        System.out.println("Enter the second decimal no : ");
        secondno = scn.nextDouble();
        
        resno = firstno * secondno;
        System.out.println("Result of multiplication is : "+resno);
        
        
    }
}
