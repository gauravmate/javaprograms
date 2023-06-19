import java.util.Scanner;
public class decrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the number");
        n=sc.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
    
}
