import java.util.Scanner;
    public class loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
           sum=sum*i/2;
        }
        System.out.println("addition is"+sum);
    }
    
}


    
