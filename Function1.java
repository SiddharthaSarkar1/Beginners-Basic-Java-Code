
package siddharthsbegbasic;
import java.util.Scanner;
public class Function1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two positive integer : ");
        n1 = scn.nextInt();
        n2 = scn.nextInt();
        
        if(n1>n2){
            n1 = n1+n2;
            n2 = n1-n2;
            n1 = n1-n2;
        }
        
        isPrimeCheck(n1,n2);
    }
    
    public static void isPrimeCheck(int n1, int n2){
        int count;
        System.out.println("Prime numbers between "+n1+" and "+n2+" is : ");
        for(int i=n1;i<=n2;i++){
            count = 0;
            if(i==0 || i==1){
                count++;
            }else{
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            }
            if(count == 0){
                System.out.print(i+" ");
            }
            
            
        }
    }
}
