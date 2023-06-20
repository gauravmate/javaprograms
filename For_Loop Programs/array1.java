import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in) ;
    int i;
    int [] arr=new int[5]   ;
    System.out.println("enter array element");
    for(i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    
    System.out.println("your array");
    for(i=0;i<5;i++){
        if(arr[i]%2==0){
    System.out.println(arr[i]);
    }
    }
}
    

}