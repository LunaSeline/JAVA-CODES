public class Excp_Ex {
    public static void main(String args[]){
        try{
            int a=7;
            int b= 0;
            int c[]={1, 2, 3, 4, 5};
            for (int i = 0; i <= c.length; i++)
                System.out.print(c[i] +" ");
            int d= a/b;
            System.out.println(d);
            
        }
        catch(ArithmeticException e)
        {System.out.println("DIVIDE BY ZERO");}
        catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("\nARRAY INDEX IS OUT OF BOUNDS");}
    }
    
}
