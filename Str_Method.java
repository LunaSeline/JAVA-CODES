public class Str_Method {

    public static void main(String args[]) {
        
        // WAP TO IMPLEMENT VARIOUS STRING METHODS
        
        String s1 = "Strings are immutable";
        String s2 = "Integers are not imuutable     ";

       System.out.println("s1 = Strings are immutable\n");
       System.out.println("s2 = Integers are not imuutable\n");

      char r1 = s1.charAt(10);
      System.out.println("1) char charAt(int n): " +r1);

      int r2 = s1.compareTo(s2);
      System.out.println("2) int  compareTo(String s1): " +r2);
        
      String r3 = s1.concat(s2);
      System.out.println("3) String concat(String s): " +r3);

      Boolean r4 = s1.endsWith( "immu" );
      System.out.println("4) boolean endsWith(String suffix): " +r4);

      Boolean r5 = s1.equals( s2 );
      System.out.println("5) boolean equals(String s): " +r5);
      
      int r6 = s1.indexOf('i');
      System.out.println("6) int indexOf(int/char): " +r6);

      int r7 = s1.lastIndexOf('n');
      System.out.println("7) int lastIndexOf(int/char: )" +r7);

      int r8 = s1.length();
      System.out.println("8) int length(): " +r8);

      String r9 = s1.toUpperCase();
      System.out.println("9) String toUpperCase(): " +r9);

      String r10 = s1.toLowerCase();
      System.out.println("10) String toLowerCase(): " +r10);

      String r11 = s2.trim();
      System.out.println("11) String  trim(): " +r11);


    }
    
}
