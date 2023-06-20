import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,b;
        System.out.println("enter number");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            b=n*i;
            System.out.println(b);
        }
    }
    
}
