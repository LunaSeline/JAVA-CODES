import java.util.Scanner;

public class Distance {
    public static void main(String args[])
    {

       Scanner sc= new Scanner(System.in);
            System.out.print("Should there be an interval?");
            System.out.print(" (press 1 for yes or 0 for no): ");
            int ch= sc.nextInt();
            double k=0;

            if (ch==1)
   {
            System.out.println("Enter the no of intervals: ");
            int x = sc.nextInt();

            for(int i=1; i<=x; i++){
                System.out.println("Enter the time for interval (in sec) "+i +": ");
                double t = sc.nextDouble();

                System.out.println("Enter the initial velocity(in meters/sec): ");
                double u= sc.nextDouble();
 
                System.out.println("Enter the acceleration(in m/sec2): ");
                double a= sc.nextDouble();
                double distance= (u*t*i)+ (0.5*a*t*t*i*i);
                System.out.println("\nDistance travelled in interval " +i +" is " +distance);
                k= k+distance;

            }
            System.out.println("The total distance travelled is: " +k +" meters");
   }
    else{
            System.out.println("Enter the time(in sec): ");
            double t = sc.nextDouble();
            System.out.println("Enter the initial velocity(in meter/sec): ");
            double u= sc.nextDouble();

            System.out.println("Enter the accelerationIin meter/sec2: ");
            double a= sc.nextDouble();

            double distance= (u*t)+(0.5*a*t*t);
            System.out.println("Distance travelled is: " +distance +" meters");
    
        }
        sc.close();
    }
    
}
