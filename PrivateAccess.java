/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Data
{
    private String name;
    public void setter(String s){
        name=s;
    }
    public String getter(){
        System.out.println(name);
        return name;
    }
}
public class PrivateAccess
{
    public static void main(String[]args)
    {
        Data d = new Data();
        d.setter("Java");
        d.getter();
    }
}	 
