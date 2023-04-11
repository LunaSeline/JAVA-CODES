import java.util.*;
public class Main_Staff{
    public static void main(String args[]){
        System.out.println(" Teacher\n Regular Typist\n Casual Typist\n Officer");
       System.out.println("ENTER THE DESIGNATION(from the above names): ");
       Scanner b= new Scanner(System.in);
       String Staff_name = b.nextLine();
       b.close();
       switch(Staff_name){
       case "Teacher": 
       {Teacher t= new Teacher();
       t.Teach();
       t.Teach_Disp();}
       break;
       case "Regular Typist":
       {Regular R= new Regular();
       R.Reg();
       R.RegTY_Disp();}
       break;
       case "Casual Typist": 
       {Casual CA= new Casual();
        CA.Cas();
        CA.CasTY_Disp();}
        break;
        case "Officer":
        {Officer O= new Officer();
            O.Off();
            O.Off_Disp();}
       
       break;
       default:{ System.out.println("PLEASE ENTER THE CORRECT DESIGNATION");}
        }
    }
    
}
// CLASS STAFF
class Staff{
    int code;
    String name;

    Staff(int c, String n){
         c= code;
         n= name;
    }
}
// CLASS TEACHER
class Teacher extends Staff{
    private static String n;
    private static int c;
    Teacher() {
        super(c, n);
    }
    String sub;
    int pub;
   void Teach(){

        Scanner k= new Scanner(System.in);
        
        System.out.println("ENTER NAME: ");
        n= k.nextLine();

        System.out.println("ENTER SUBJECT OF TEACHER: ");
        sub= k.nextLine();

        System.out.println("ENTER TEACHER CODE: ");
        c= k.nextInt();

        System.out.println("ENTER NUMBER OF PUBLICATIONS: ");
        pub= k.nextInt();
        k.close();
    }

    void Teach_Disp(){
        System.out.println("\n\nNAME:                   " +n);
        System.out.println("TEACHER CODE:           " +c);
        System.out.println("SUBJECT OF TEACHER:     " +sub);
        System.out.println("NUMBER OF PUBLICATIONS: " +pub);

    }
}
// CLASS OFFICER
class Officer extends Staff{
    private static String n;
    private static int c;
    Officer() {
        super(c, n);
    }
    char gr;
   void Off(){

        Scanner l= new Scanner(System.in);
        
        System.out.println("ENTER NAME: ");
        n= l.nextLine();

        System.out.println("ENTER OFFICER CODE: ");
        c= l.nextInt();

        System.out.println("ENTER THE GRADE OF THE OFFICER: ");
        gr= l.next().charAt(0);
        l.close();
    }

    void Off_Disp(){
        System.out.println("\n\nNAME:             " +n);
        System.out.println("OFFICER CODE:     " +c);
        System.out.println("GRADE OF OFFICER: " +gr);

    }
}
// CLASS TYPIST
class Typist extends Staff{
        private static String n;
        private static int c;
        double speed;
        Typist(double sp) {
            super(c, n);
            sp= speed;
        }
        
}
// REGULAR TYPIST
class Regular extends Typist{
    private static String n;
    private static int c;
    private static double sp;
    double sa;
    Regular() {
        super(sp);
    }
    char gr;
   void Reg(){

        Scanner p= new Scanner(System.in);
        
        System.out.println("ENTER NAME: ");
        n= p.nextLine();

        System.out.println("ENTER REGULAR TYPIST CODE: ");
        c= p.nextInt();

        System.out.println("ENTER THE SPEED OF THE TYPIST (in char/min): ");
        sp= p.nextDouble();

        System.out.println("ENTER THE SALARY OF THE TYPIST (/month): ");
        sa= p.nextDouble();
        p.close();
    }

    void RegTY_Disp(){
        System.out.println("\n\nNAME:                     " +n);
        System.out.println("REGULAR TYPIST CODE:      " +c);
        System.out.println("SPEED OF REGULAR TYPIST:  " +sp);
        System.out.println("SALARY OF REGULAR TYPIST: " +sa);

    }
}
// CLASS CASUAL TYPIST
class Casual extends Typist{
    private static String n;
    private static int c;
    private static double sp;
    double dw;
    Casual() {
        super(sp);
    }
    char gr;
   void Cas(){

        Scanner q= new Scanner(System.in);
        
        System.out.println("ENTER NAME: ");
        n= q.nextLine();

        System.out.println("ENTER CASUAL TYPIST CODE: ");
        c= q.nextInt();

        System.out.println("ENTER THE SPEED OF THE TYPIST (in char/min): ");
        sp= q.nextDouble();

        System.out.println("ENTER THE DAILY WAGE OF THE TYPIST (/month): ");
        dw= q.nextDouble();
        q.close();
    }

    void CasTY_Disp(){
        System.out.println("\n\nNAME:                        " +n);
        System.out.println("CASUAL TYPIST CODE:          " +c);
        System.out.println("SPEED OF CASUAL TYPIST:      " +sp);
        System.out.println("DAILY WAGE OF CASUAL TYPIST: " +dw);

    }
}