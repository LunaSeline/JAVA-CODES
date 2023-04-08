import java.util.Scanner;

public class SOL_QE {
    public static void main(String args[]){
        try (Scanner ln = new Scanner(System.in)) {
            System.out.println("Enter the coefficient of x2: ");
            double a = ln.nextDouble();

             System.out.println("Enter the coefficient of x: ");
            double b = ln.nextDouble();

             System.out.println("Enter the constant: ");
            double c = ln.nextDouble();

            System.out.println("The quadratic equation is: " +a +"x2 +" +b +"x +" +c);

            double d = ((b*b)-(4*a*c));

            if(d>0){
               double k= Math.sqrt(d);
               double x1 = (((-b)+k)/(2*a));
               double x2 = (((-b)-k)/(2*a));

                System.out.println(":The solutions of the equations are:\n" +x1 +"\t" +x2);
            }

            else{
                if(d==0){
                    double x1= -b/(2*a);
                    System.out.println(":The solutions of the equations are:\n" +x1 +" and\t" +x1);
                }

                else{
                    System.out.println(":The solutions of the equations donot exist.");
                }
            }
        }




    }
    
}
