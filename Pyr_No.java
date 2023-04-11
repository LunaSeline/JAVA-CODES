import java.util.*;
public class Pyr_No {
    public static void main(String args[]){
        System.out.println("Enter the numbers you want to display: ");
        Scanner k= new Scanner(System.in);
        int n= k.nextInt();
        System.out.println(" ");
        for(int i=1; i<=n; i++){
            for (int j= 1; j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        k.close();
    }
    
}
