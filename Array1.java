import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        double sum = 0;
        double[] myArray = new double[100];
        System.out.println("Enter the number of elements : ");
        num = scn.nextInt();
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<num;i++){
            myArray[i] = scn.nextDouble();
        }
        
        for(int i=0;i<num;i++){
            sum = sum + myArray[i];
        }
        System.out.println("The avarage of elements of given array is : "+sum/num);
    }
}
