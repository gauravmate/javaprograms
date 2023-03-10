import java.util.Scanner;
public class assigment1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(" a greater number:");
        }else{
            System.out.println(" b greater number");
        }
    }
    
}
