
package siddharthsbegbasic;
import java.util.Scanner;
public class BegBasicSeven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char mychar;
        int mycharAscii;
        System.out.println("Enter the character : ");
        mychar = scn.next().charAt(0);
        mycharAscii = (int)mychar;
        
        System.out.println("ASCII value of this character is : "+mycharAscii);
    }
}
