 import java.util.Scanner;
public class reasto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            sum=sum*i;
        }
        System.out.println("addition is"+sum);
    }
    
}

