class demo{
    int i;
    int j;
    void setij(int x,int y){
    i=x;
    j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class classobject3 {
    public static void main(String[] args) {
        demo obj1=new demo();
        obj1.setij(10,20);
        demo obj2=new demo();
        obj2.setij(80,90);
        obj1.add();
        obj2.add();
        
    }
    
}
