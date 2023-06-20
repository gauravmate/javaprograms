import java.util.Scanner;
class demo10{
    String studentname;
    int math,eng,hindi,total;
    Scanner sc=new Scanner(System.in);
    void name(){
        System.out.println("enter student name");
        studentname=sc.next();
    }
    void mark(){
        System.out.println("enter 3 subject mark"); 
        math=sc.nextInt();
        eng=sc.nextInt();
        hindi=sc.nextInt();
        total=(math+eng+hindi)/3;

    }
    void show(){
        System.out.println( studentname);  
        System.out.println(total);
    }
}
public class classobject1 {
 public static void main(String[] args) {
  demo10  ob1=new demo10();
  ob1.name();
  ob1.mark();
  ob1.show();

 }   
}
