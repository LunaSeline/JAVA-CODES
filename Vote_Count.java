import java.util.Scanner;
public class Vote_Count {
        public static void main(String args[]) {
            int Can = 5; 
            int[] count = new int[Can]; 
            Scanner m = new Scanner(System.in);
    
            System.out.print("Enter the number of ballots: ");
            int Bal = m.nextInt();
            for (int i = 0; i < Bal; i++) {
                System.out.print("Enter candidate for ballot " + (i + 1) + ": ");
                int c_N = m.nextInt(); 
                if (c_N >= 1 && c_N <= Can) {
                    count[c_N - 1]++;
                } else {
                    System.out.println("Ballot " + (i + 1) + " is spoiled.");
                }
            }
            System.out.println("Vote counts:");
            for (int i = 0; i < Can; i++) {
                System.out.println("Candidate " + (i + 1) + ": " + count[i] + " votes");
            }
            m.close();
        }
    }


