package J7_this_Keyword;

//------------------------------ Example 1 : Referring to instance variable ------------------------------

class Student_01 {
    int id;
    String name;

    Student_01(int id, String name) {
        this.id = id;                                                   // refers to instance variable
        this.name = name;                                               // refers to instance variable
    }

    void display() {
        System.out.println("ID : " + id + ", Name : " + name);
    }
}

public class Test_01 {
    public static void main(String[] args) {
        Student_01 s1 = new Student_01(101, "Alice");
        s1.display();
    }
}