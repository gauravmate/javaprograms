import java.util.Scanner;
public class array3 {
    public static void main(String[] args) 
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("enter array");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    
    System.out.println("your array");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.println(" "+arr[i][j]);
        }
    }System.out.println();
    
}
}
