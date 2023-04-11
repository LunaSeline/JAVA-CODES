import java.util.*;
public class String_read {
    public static void main (String args[]){
System.out.print("Enter the String: ");
Scanner m= new Scanner(System.in);
String S = m.nextLine();
m.close();
char[] str_char = S.toCharArray();
Arrays.sort(str_char);
String sorted_str= new String(str_char);
System.out.println("The sorted string is: " +sorted_str);

    }
    
}
