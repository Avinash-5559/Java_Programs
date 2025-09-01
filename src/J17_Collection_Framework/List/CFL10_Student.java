package J17_Collection_Framework.List;

public class CFL10_Student {

    private String name;
    private String rollNo;

    public CFL10_Student(String name_c, String rollNo_c) {
        this.name = name_c;
        this.rollNo = rollNo_c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    void printDetail() {
        System.out.println("Student Name    : " + this.name);
        System.out.println("Student Roll No : " + this.rollNo);
    }

    @Override
    public String toString() {
        return "CFL10_Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}