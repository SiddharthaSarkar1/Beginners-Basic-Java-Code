
package siddharthsbegbasic;
import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char mychar;
        System.out.println("Enter a character : ");
        mychar = scn.next().charAt(0);
        
        switch (mychar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The Character "+mychar+" is a VOWEL.");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The Character "+mychar+" is a VOWEL.");
                break;
            default:
                System.out.println("The Character "+mychar+" is a CONSONANT.");
                break;
        }
    }
}
