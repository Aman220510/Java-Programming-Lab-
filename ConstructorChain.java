public class ConstructorChain{
    ConstructorChain(){
        this("Hello");
        System.out.println("Default constructor called.");
    }
    ConstructorChain(String str){
        System.out.println("Parameterized constructor called.");
    }
    public static void main(String[] args){
        ConstructorChain cc=new ConstructorChain();
    }
}