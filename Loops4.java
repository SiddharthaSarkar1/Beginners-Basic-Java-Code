
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first,second, num, fiboNum;
        first = 0;
        second = 1;
        System.out.println("Enter the number of numbers you want : ");
        num = scn.nextInt();
        
        if(num==0){
            System.out.println("Enter a positive Integer value.");
        }else if(num == 1){
            System.out.print(first+"\t");
        }else{
        System.out.println("Fibonicci Series is : ");
        System.out.print(first+"\t");
        System.out.print(second+"\t");
        
       
        for(int i=3;i<=num;i++){
            fiboNum = first+second;
            System.out.print(fiboNum+"\t");
            first = second;
            second = fiboNum;
            
        }
        }
    }
}
