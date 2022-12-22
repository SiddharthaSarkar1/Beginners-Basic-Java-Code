
package siddharthsbegbasic;
import java.util.Scanner;
public class Loops14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start, end, count;
        System.out.println("Enter the starting number : ");
        start = scn.nextInt();
        System.out.println("Enter the ending number : ");
        end = scn.nextInt();
        
        for(int i=start; i<=end; i++){
            count = 0;
            if(i == 0 || i == 1){
             count++;   
            }else{
            for(int j=2;j*j<=i;j++){
                if(i % j == 0){
                    count++;
                    break;
                }
            }
            }
            if(count == 0){
            System.out.println(i+" ");
            }
        }
        
    }
}
