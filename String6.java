package siddharthsbegbasic;
import java.util.Scanner;
public class String6 {
    public static StringBuilder changeChar(String str){
        int char_code;
        StringBuilder mySb = new StringBuilder(str);
        for(int i=0;i<mySb.length();i++){
            char_code = (int)mySb.charAt(i);
            if(char_code == 122){
                mySb.setCharAt(i, (char)97);
            }else if(char_code == 90){
                mySb.setCharAt(i, (char)65);
            }else if((char_code >= 65 && char_code <= 90) || (char_code >= 97 && char_code <= 122)){
                mySb.setCharAt(i, (char)(char_code + 1));
            }
        }
        return mySb;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String myStr;
        System.out.println("Enter a string : ");
        myStr = scn.nextLine();
        
        StringBuilder result = changeChar(myStr);
        System.out.println("Output string is : "+result);
    }
}
