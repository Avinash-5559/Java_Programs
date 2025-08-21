package J07_this_Keyword;

//------------------------------ Example 2 : Calling another constructor using this() ------------------------------

class Student_02 {
    int id;
    String name;

    Student_02() {
        this(102, "Bob");                                    // calls the other constructor
    }

    Student_02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID : " + id + ", Name : " + name);
    }
}

public class Test_02 {
    public static void main(String[] args) {
        Student_02 s2 = new Student_02();                             // will call no-arg constructor
        s2.display();
    }
}