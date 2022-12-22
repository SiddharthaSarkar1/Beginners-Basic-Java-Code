
package siddharthsbegbasic;
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String lineStr, tempStr = "";
        System.out.println("Enter a line : ");
        lineStr = scn.nextLine();
        
        for(int i=0;i<lineStr.length();i++){
            if((lineStr.charAt(i) >= 'a' && lineStr.charAt(i) <= 'z') || (lineStr.charAt(i) >= 'A' && lineStr.charAt(i) <= 'Z')){
            tempStr = tempStr + lineStr.charAt(i);
            }
        }
        System.out.println("The String is : "+tempStr);
    }
}
