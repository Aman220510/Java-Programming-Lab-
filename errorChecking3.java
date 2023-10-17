import java.util.Scanner;
public class errorChecking3
{
public static void main(String[] args) {
   try {
       Scanner scn=new Scanner(System.in);
       int n=Integer.parseInt(scn.nextLine());
       if(99%n==0)
       
       System.out.println(n+"is a factor of 99");
   }
   catch (ArithmeticException err){
System.out.println("ÄrithmeticException:"+err);
}
catch (NumberFormatException err){
System.out.println("Number format Exception:"+err);
}
}}
