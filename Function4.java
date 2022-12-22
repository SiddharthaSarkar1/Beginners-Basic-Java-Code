
package siddharthsbegbasic;
import java.util.Scanner;
public class Function4 {
    public static void decimalToBinary(int n){
        int num = n;
        int[] binaryNum = new int[1000];
        int i = 0;
        
        while(num > 0){
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }
        System.out.print("Binary form of Decimal number "+n+" is : ");
        for(int j = i-1;j>=0;j--){
            System.out.print(binaryNum[j]);
        }
        System.out.println("");
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inpNum;
        System.out.println("Enter a decimal number : ");
        inpNum = scn.nextInt();
        decimalToBinary(inpNum);
    }
    
}
