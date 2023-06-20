import java.util.Scanner;
public class percentage2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double salary,hra,da,total;
      System.out.println("enter salary");
      salary=sc.nextDouble();
      if(salary<=10000)
      {
        hra=salary*0.2;
        da=salary*0.8;
        total=salary+hra+da;
      }
      else if(salary<=20000)
      {
        hra=salary*0.25;
        da=salary*0.9;
        total=salary+hra+da; 
      }else
      {
        hra=salary*0.3;
        da=salary*0.95;
        total=salary+hra+da;
      }
      System.out.println("total is"+total);
    }
}
