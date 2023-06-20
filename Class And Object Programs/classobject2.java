import java.util.Scanner;
class demo11{
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);
    void name(){
        System.out.println("enter full name of the customer");
        name=sc.next();

    }
    void balance(){
        System.out.println("enter customer balance");
        balance=sc.nextInt();
    }
    void show(){
        System.out.println(name);
        System.out.println(balance);
    }
}
public class classobject2 {
 public static void main(String[] args) {
 demo11 ob1=new demo11();
 demo11 ob2=new demo11();
 ob1.name();
 ob1.balance();
 ob2.name();
 ob2.balance();
 ob1.show();
 ob2.show();

 }   
}
