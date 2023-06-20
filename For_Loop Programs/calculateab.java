import java.util.Scanner;
public class calculateab{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=1;
        System.out.println("enter a number");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++){
            sum=sum*a;
        }   
        System.out.println(sum);
         }
    
}
