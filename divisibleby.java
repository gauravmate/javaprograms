import java.util.Scanner;
public class assigment7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int x,y,a;
    System.out.println("enter the number");
    a=sc.nextInt();
    x=a%5;
    y=a%11;
    if(x==0 && y==0){
        System.out.println("a divisible by 5 and 11");
    }else{
        System.out.println("is not divisible by 5 and 11");
    }
    
    }
}
