
package siddharthsbegbasic;
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String lineStr;
        int length;
        System.out.println("Enter a String : ");
        lineStr = scn.nextLine();
        
        length = lineStr.length();
        System.out.println("Length of the string is : "+length);
    }
}
