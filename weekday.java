import java.util.Scanner;
public class assigment8 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in) ;
    int weekdays;
    System.out.println("enter the weekday (1-7)");
    weekdays=sc.nextInt();
      if(weekdays==1) {
        System.out.println("monday");
    }else if(weekdays==2){
        System.out.println("tuesday");
    }else if(weekdays==3){
        System.out.println("wednesday");
    }else if(weekdays==4){
        System.out.println("thursday");
    }    else if(weekdays==5){
            System.out.println("friday");
    }else if(weekdays==6){
        System.out.println("saturday");
    }else if(weekdays==7){
        System.out.println("sunday");
    }else{
        System.out.println("pleace enter the weekdays(1-7)");
    }
}
}