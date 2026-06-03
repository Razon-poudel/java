import java.util.*;

interface LibraryHelper {
    void checkBooks();
}

abstract class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void attendClass() {
        System.out.println(name + " attending class");
    }

    int gradeCalculator() {
        return marks / 25;
    }

    abstract void display();
}

class lab3 extends Student implements LibraryHelper {

    lab3(String n, int m) {
        super(n, m);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + gradeCalculator());
    }

    public void checkBooks() {
        System.out.println(name + " is checking books");
    }

    public static void main(String[] args) {
        lab3 obj = new lab3("Naman", 75);
        obj.display();
        obj.attendClass();
        obj.checkBooks();
    }
}     