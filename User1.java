//Design an interfeace for a calculator.
interface solution{
    public void add(int i,int j);
    public void sub(int i,int j);
    public void mult(int i,int j);
    public void div(int i,int j);
 }
public class User1 implements solution{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
public void mult(int a,int b){
    System.out.println(a*b);
}
    public void div(int a,int b){
        System.out.println(a/b);
    }
 public static void main(String[] args){
    User1  a=new User1();
    a.add(2,3);
    a.sub(7,5);
    a.mult(6,8);
    a.div(8,4);
 }
}

