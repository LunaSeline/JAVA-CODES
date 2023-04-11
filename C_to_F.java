import java.util.Scanner;
public class C_to_F {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN DEGREE C: ");
        double C= s.nextDouble();
        double F= ((C*9/5)+32);
        s.close();
        System.out.println(" ");
        System.out.println("TEMPERATURE IN F: "+ F);
    }
    
}
