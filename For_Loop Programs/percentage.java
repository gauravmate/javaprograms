import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int physics,chemistry,biology,math,computer,p;
        System.out.println("enter physics mark");
        physics=sc.nextInt();
        System.out.println("enter chemistry mark");
        chemistry=sc.nextInt();
        System.out.println("enter biology mark");
        biology=sc.nextInt();
        System.out.println("enter math mark");
        math=sc.nextInt();
        System.out.println("enter computer mark");
        computer=sc.nextInt();
        p=(physics+chemistry+biology+math+computer);
        System.out.println("\n total"+p);
        p=(physics+chemistry+biology+math+computer)/5;
        if(p>=90){
       System.out.println("grade A");}
    
        else if(p>=80){  
            System.out.println("grade B");}
        else if(p>=70){
            System.out.println("grade C");
        }else if (p>=60){
            System.out.println("grade D");
        }else if(p>=40){
            System.out.println("grade E");
        }else{
            System.out.println("grade F");
        }
    }
}
