
package siddharthsbegbasic;
import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1, s2, addedStr;
        System.out.println("Enter the first string : ");
        s1 = scn.nextLine();
        System.out.println("Enter the second string : ");
        s2 = scn.nextLine();
        
        addedStr = s1.concat(s2);
        System.out.println("The Concatinated string is : "+addedStr);
    }
}
