package J16_Generics;

public class GN04_Generics4 {
    public static void main(String[] args) {

        Test<Integer> i = new Test<Integer>(5);
        System.out.println("Integer : " + i.getObject());

        Test<Double> d = new Test<Double>(5.265);
        System.out.println("Double  : " + d.getObject());

        Test<String> s = new Test<String>("Pramod");
        System.out.println("String  : " + s.getObject());

    }
}

class Test<T> {
    T obj;

    public Test(T obj_c) {
        this.obj = obj_c;
    }

    public T getObject() {
        return this.obj;
    }
}