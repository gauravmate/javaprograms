import java.util.Scanner;
public class notacount {
    public static void main(String[] args) {
        int r2000=0,r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,count=0,amt;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amount");
        amt = sc.nextInt();

        while(amt >= 2000){
            r2000 = amt / 2000;
            amt =amt % 2000;
            System.out.println("Total number of 2000rs is "+ r2000);
            break;
        }

        while(amt >= 500){
            r500 = amt / 500;
            amt =amt % 500;
            System.out.println("Total number of 500rs is "+ r500);
            break;
        }

        while(amt >= 200){
            r200 = amt / 200;
            amt =amt % 200;
            System.out.println("Total number of 200rs is "+ r200);
            break;
        }  

        while(amt >= 100){
        r100 = amt / 100;
        amt =amt % 100;
        System.out.println("Total number of 100rs is "+ r100);
        break;
    }
    while(amt >= 50){
        r50 = amt / 50;
        amt =amt % 50;
        System.out.println("Total number of 50rs is "+ r50);
        break;
    }
    while(amt >= 20){
        r20 = amt / 20;
        amt =amt % 20;
        System.out.println("Total number of 20rs is "+ r20);
        break;
    }
    while(amt >= 10){
        r10 = amt / 10;
        amt =amt % 10;
        System.out.println("Total number of 10rs is "+ r10);
        break;
    }
    while(amt >= 5){
        r5 = amt / 5;
        amt =amt % 5;
        System.out.println("Total number of 5rs is "+ r5);
        break;
    }
    while(amt >= 2){
        r2 = amt / 2;
        amt =amt % 2;
        System.out.println("Total number of 2rs is "+ r2);
        break;
    }
    count = r2000+ r500+ r200+ r100+ r50+ r20+ r10+ r5+ r2;
    System.out.println("Total number of note and coine : \n \n "+ count );  
  }
}