import java.util.Scanner;
public class askii {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int ch;
        System.out.println("Enetr charecter");
        ch=sc.next().charAt(0);
        int x;
        x=ch;
        if(x>=65 && x<=90){
            System.out.println("capital");
        }else if(x>=97 && x<=122){
            System.out.println("small");    
        }else if(x>=48 && x<=97){
            System.out.println("digit");
        }

        
    }
    
}
