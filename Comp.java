import java.util.Scanner;
public class Comp {
    public static void main(String args[]) {
    Scanner m= new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double n1= m.nextDouble(); 
    System.out.print("Enter the second number: ");
    double n2= m.nextDouble();
    int l= (int) n1*1000;
    int k= (int) n2*1000;
    if (k!=l)
    {   System.out.println("The numbers are not equal");}
    else
      { System.out.println("The numbers are equal");}
    m.close();
    }
}
