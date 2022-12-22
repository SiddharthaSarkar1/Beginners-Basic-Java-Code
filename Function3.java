
package siddharthsbegbasic;
import java.util.Scanner;
public class Function3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inpNum, result;
        System.out.println("Enter a number : ");
        inpNum = scn.nextInt();
        result = binaryToDecimal(inpNum);
        System.out.println("The Decimal value of Binary number "+inpNum+" is : "+result);
    }
    
    public static int binaryToDecimal(int n){
        int num = n;
        int base = 1;
        int decVal = 0;
        int temp = num;
        while(temp>0){
            int rem = temp % 10;
            temp = temp / 10;
            decVal = decVal + (rem * base);
            base = base * 2;
        }
        return decVal;
    }
}
