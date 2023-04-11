import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

    void get_No(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void put_No() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Test extends Student {
    int m1;
    int m2;
    String s1;
    String s2;

    void get_No(int m1, int m2, String s1, String s2) {
        this.m1 = m1;
        this.m2 = m2;
        this.s1 = s1;
        this.s2 = s2;
    }

    void put_No() {
        System.out.println("Marks of " +s1 +": " + m1);
        System.out.println("Marks of " +s2 +": " + m2);
        
    }
}

interface Sports {
    void get_Weight(int weight);
    void put_Weight();
}

class Result extends Test implements Sports {
    int totalMarks;
    int weight;

    public void get_Weight(int weight) {
        this.weight = weight;
    }

    public void put_Weight() {
        System.out.println("Weight: " + weight + " kg");
    }

    void calculateTotalMarks() {
        totalMarks = m1 + m2;
    }

    void displayResult() {
        put_No();
        System.out.println("Total Marks: " + totalMarks);
        put_Weight();
    }
}

class Student_Result extends Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Result main = new Student_Result();

        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the roll number of " +name +": ");
        int rollNumber = scanner.nextInt();
        main.get_No(name, rollNumber);

        System.out.print("Enter the name of the first subject: ");
        String s1 = scanner.next();
        System.out.print("Enter the marks of " +s1 +": ");
        int m1 = scanner.nextInt();

        System.out.print("Enter the name of the second subject: ");
        String s2 = scanner.next();
        System.out.print("Enter the marks of " +s2 +": ");
        int m2 = scanner.nextInt();
    
        main.get_No(m1, m2, s1, s2);

        System.out.print("Enter the weight of " +name +": ");
        int weight = scanner.nextInt();
        main.get_Weight(weight);
        System.out.println("______________________RESULTS______________________");
        System.out.println("Name of the student: " +name);
        System.out.println("Roll number of the student: " +rollNumber);
        main.calculateTotalMarks();
        main.displayResult();
        scanner.close();    }
}
