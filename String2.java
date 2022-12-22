
package siddharthsbegbasic;
import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int vowel, consonent, digit, whiteSpace;
        vowel = consonent = digit = whiteSpace = 0;
        System.out.println("Enter a line : ");
        String line = scn.nextLine();
        
        for(int i=0;i<line.length();i++){
            if(line.charAt(i) == 'a' ||line.charAt(i) == 'e' ||line.charAt(i) == 'i' ||line.charAt(i) == 'o' ||line.charAt(i) == 'u' ||line.charAt(i) == 'A' ||line.charAt(i) == 'E' ||line.charAt(i) == 'I' ||line.charAt(i) == 'O' ||line.charAt(i) == 'U'){
                vowel++;
            }else if((line.charAt(i) > 'a' && line.charAt(i) < 'z') || (line.charAt(i) > 'A' && line.charAt(i) < 'Z')){
                consonent++;
            }else if(line.charAt(i) > 0 && line.charAt(i) < 9){
                digit++;
            }else if(line.charAt(i) == ' '){
                whiteSpace++;
            }
        }
        System.out.println("Number of Vowel is : "+vowel);
        System.out.println("Number of Consonent is : "+consonent);
        System.out.println("Number of Digit is : "+digit);
        System.out.println("Number of White Space is : "+whiteSpace);
    }
}
