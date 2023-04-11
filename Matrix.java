import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the no of rows of a: ");
        int ar = k.nextInt();
        System.out.print("Enter the no of columns of a: ");
        int ac = k.nextInt();
        System.out.print("Enter the number of rows of b: ");
        int br = k.nextInt();
        System.out.print("Enter the number of columns of b: ");
        int bc = k.nextInt();

        if (ac != ar) {
            System.out.println("The no of columns of a must be equal to the no of rows of b.");
        }
        System.out.println("Enter the elements of a:");
        int[][] m1 = new int[ar][ac];
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < ac; j++) {
                System.out.print("(" +(i+1) +"," +(j+1) +")= ");
                m1[i][j] = k.nextInt();
            }
        }

        System.out.println("Enter the elements of b:");
        int[][] m2 = new int[br][bc];
        for (int i = 0; i < br; i++) {
            for (int j = 0; j < bc; j++) {
                System.out.print("(" +(i+1) +"," +(j+1) +")= ");
                m2[i][j] = k.nextInt();
            }
        }
        int[][] r = new int[ar][bc];
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                for (int l = 0; l < ac; l++) {
                    r[i][j] += m1[i][l] * m2[l][j];
                }
            }
        }
        System.out.println("The result of [axb] is:");
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
        k.close();
    }
}
