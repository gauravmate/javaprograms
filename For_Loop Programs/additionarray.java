import java.util.Scanner;
public class additionarray {
    public static void main(String[] args) {
    int i;
    int[] arr={10,20,30,40,50} ; 
    int sum=0;
    System.out.println("your array")  ;
    for(i=0;i<5;i++){
        sum=sum+arr[i];
    }
    System.out.println("addition is"+sum);
    }
    
}
