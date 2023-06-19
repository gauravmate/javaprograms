import java.util.Scanner;
public class evenodd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter any number");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
