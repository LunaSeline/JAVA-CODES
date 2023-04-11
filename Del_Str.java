import java.util.*;
public class Del_Str {
    
        public void Delete(String str, int m){
            int l= str.length();
           String S2= (str.substring(0,m-1)).concat(str.substring(m,l));
        System.out.println("The string after removing " +m +"th element is : \n" +S2);
        }
    

    public static void main(String args[]){
        Scanner k= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= k.nextLine();

        System.out.println("Enter the index where you want delete the element");
        int m= k.nextInt();

        k.close();

        Del_Str D= new Del_Str();
        D.Delete(str, m);

    }
}
