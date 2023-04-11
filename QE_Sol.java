import java.util.Scanner;
public class QE_Sol extends Exception {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter the coefficient of x2: ");
          double a= sc.nextDouble();
          System.out.print("Enter the coefficient of x: ");
          double b= sc.nextDouble();
          System.out.print("Enter the constant: ");
          double c= sc.nextDouble();
          try{
            double  d= ((b*b)-(4*a*c));
            double m= Math.sqrt(d);
            double x1= (-b-m)/(2*a);
            double x2= (-b+m)/(2*a);
          System.out.println("The solution of the quaratic equation " +a +"x2 + " +b +"x + " +c +" is: ");
          System.out.println(x1 +" and " +x2);
          }
          catch(Exception e){
          System.out.println("Caught an exception");
          System.out.println("OUTSIDE CATCH");
          }
        }
    }
    
}
