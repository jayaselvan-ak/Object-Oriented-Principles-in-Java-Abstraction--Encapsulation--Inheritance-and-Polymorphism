public class Main {
    public static void main (String[] args) {
        Student s1 = new Student("Karan", 2);
        System.out.println(s1.getDetails());
    }
}

class Student {
    private final String name;
    private int year; // year of study
    private static final int annualFees = 10000;

    public Student (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails () {
        return "Name : " + name + "\n" + "Fees : " + this.computeFees();
    }

    public float computeFees () {
        return Student.annualFees * this.year;
    }
}