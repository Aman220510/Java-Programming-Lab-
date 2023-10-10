class Animal
 {
     public int legcount;
     public void display(){
         System.out.println("I am an animal");
         System.out.println("I have"+legcount+"legs");
         
     }
 }
 public class Main
{
public static void main(String[] args) {
   Animal animal=new Animal();
   animal.legcount=4;
animal.display();
}
}