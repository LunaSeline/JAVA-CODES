
class A extends Thread{
    public void run(){
    for (int l=1; l<=3; l++)
    {
System.out.println("From Thread A l= " +l);
   }
   System.out.println("Exit form A");
    }
}
class B extends Thread{
    public void run(){
    for (int m=1; m<=3; m++)
    {
System.out.println("From Thread B l= " +m);
   }
   System.out.println("Exit form B");
    }
}
class Thre_Test {

    public static void main(String args[] ) {
        new A().start();
        new B().start();        
    }
}
