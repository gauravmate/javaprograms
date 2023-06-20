import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.println("facto is"+sum);
    }
    
}
