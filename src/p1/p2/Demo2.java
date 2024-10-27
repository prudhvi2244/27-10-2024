package p1.p2;

public class Demo2 {
    public static void main(String[] args) {

       /* I2 i2=(a,b)->{
            return  a+b;
        };*/

        I2 i2=(a,b)->a+b;

       int sum= i2.add(10,20);
        System.out.println(sum);
    }
}
