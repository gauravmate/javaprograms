import java.util.Scanner;
public class assigment12 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
     String a;
     System.out.println("enter a alphabate")  ;
     a=sc.next();
     switch(a){
     case "a":
     System.out.println("this is a vowel");
     break;
     case "e":
     System.out.println("this is e vowel");
     break;
     case "i":
     System.out.println("this is i vowel");
     break;
     case "o": System.out.println("this is o vowel");
     break;
     case "u":
     System.out.println("this is u vowel");
     break;
     default:
     System.out.println("this is consonant");
     }
        
    }
    
}
