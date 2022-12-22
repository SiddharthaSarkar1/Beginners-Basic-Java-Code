
package siddharthsbegbasic;
import java.util.Scanner;
public class String8 {
    static final int OUT = 0;
    static final int IN = 1;
    
    public static int checkWords(String str){
        int state = OUT;
        int wc = 0;
        int i = 0;
        
        while(i < str.length()){
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t'){
                state = OUT;
            }else if(state == OUT){
                state = IN;
                ++wc;
            }
            ++i;
        }
        return wc;
        
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = scn.nextLine();
        int result = checkWords(str);
        System.out.println("The word count is : "+result);
    }
}
