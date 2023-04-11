import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
        Scanner k= new Scanner(System.in);
        int m,l;
        System.out.print("Enter the no of cities: ");
        int n= k.nextInt();
        System.out.print("Enter the no of days for camparing: ");
        int f= k.nextInt();
        double sm= 0;
        double lar=0;
        double[][] temp = new double[n][f];
        int lday=0, lcity=0, sday=0, scity=0;
        for (int i=0; i<n; i++){
            m=i+1;
            System.out.println("CITY "+m +": ");
            for (int j=0; j<f; j++){
                l=j+1;
                System.out.print("ENTER THE TEMP FOR DAY " +l +": ");
                temp[i][j]= k.nextDouble();
                
                if (temp[i][j]>lar){
                    lar= temp[i][j];
                    lday=j+1;
                    lcity= i+1; }
                if (temp[i][j] < lar){
                    sm= temp[i][j];
                     sday= j+1;
                    scity= i+1; }
            }
        }
        System.out.println("The city " +lcity +" on day "+lday +" has the highest temp of "+lar);
        System.out.println("The city " +scity +" on day " +sday +" has the lowest temp of " +sm);
        k.close();
    }
}
