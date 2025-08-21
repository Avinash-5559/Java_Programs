package J7_this_Keyword;

//------------------------------ Example 3 : Passing current object as argument ------------------------------

class Student_03 {
    void show(Student_03 obj) {
        System.out.println("Object received!");
    }

    void callShow() {
        show(this);                                                 // passing current object
    }
}

public class Test_03 {
    public static void main(String[] args) {
        Student_03 s3 = new Student_03();
        s3.callShow();
    }
}