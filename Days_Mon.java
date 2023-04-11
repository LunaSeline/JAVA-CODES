import java.util.*;
public class Days_Mon {
    public static void main(String args[]){
        Scanner m= new Scanner(System.in);
        System.out.print("Enter the month(MM): ");
        int month= m.nextInt();
        System.out.print("Enter the Year number(YYYY): ");
        int year = m.nextInt();
        m.close();
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");
    }

}

