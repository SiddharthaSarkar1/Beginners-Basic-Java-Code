
package siddharthsbegbasic;
import java.util.Scanner;
public class String9 {
    public static String convert(String str){
        char[] ch;
        ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' '){
                if(ch[i]>='a' && ch[i]<='z'){
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + 'a' - 'A');
            }
        }
        String st = new String(ch);
        return st;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println("Enter a String : ");
        str = scn.nextLine();
        String result = convert(str);
        System.out.println("The converted String is : "+result);
    }
}
