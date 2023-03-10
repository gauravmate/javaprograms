import java.util.Scanner;
public class assigment3 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        if(a>0){
            System.out.println("number is possitive");
        }
        else if(a<0){
            System.out.println("number id negetive");
        }
        else{
            System.out.println("number is 0");
        }
    }
    
}
