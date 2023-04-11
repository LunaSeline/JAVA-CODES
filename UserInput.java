import java.util.Scanner;

class UserInput{
    public static void main(String args[]){

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String c = Sc.nextLine();

            System.out.println("Enter an integer: ");

            int a= Sc.nextInt();

            System.out.println("Enter a float data type: ");
            float b= Sc.nextFloat();

     

            System.out.print("Integer: " +a +" Float: " +b +" String: "+c);
        }



    }
}