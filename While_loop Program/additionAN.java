import java.util.Scanner;
public class additionAN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("enter any number");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("addition is"+sum);
    }
    
}
