package J01_Java_Basic_Programs;

public class CompoundOp {
    public static void main(String [] args) {
        int i=14, j=14, k=14, l=-2;
        i+=2;
        System.out.println(i);//16
        i-=5;
        System.out.println(i);//11
        i*=5;
        System.out.println(i);//55
        i/=5;
        System.out.println(i);//11
        i%=6;
        System.out.println(i);//5
        j&=2;
        System.out.println(j);//2
        j|=3;
        System.out.println(j);//3
        j^=4;
        System.out.println(j);//7
        k<<=3;
        System.out.println(k);//112
        k>>=3;
        System.out.println(k);//14
        l>>>=2;
        System.out.println(l);//1073741823
    }
}
