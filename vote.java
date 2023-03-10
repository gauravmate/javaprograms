import java.util.Scanner;
public class vote {
  public static void main(String[] args)  
  {
Scanner sc=new Scanner(System.in);
int age;
System.out.println("enter your age");
age=sc.nextInt();
if(age>=18)
{
    System.out.println("you can vote");
}
else{
    System.out.println("you can not vote");
}
  }
    
}
