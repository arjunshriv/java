import java.lang.reflect.Type;

public class Operators {

    public static void main(String[] args) {

        System.out.println("Hello world...");
        expressions();

    }

    static void expressions() {

        System.out.print("-3 - 8 * 3 + 14 % 6 + 31 / 4 = ");
        System.out.println(-3 - 8 * 3 + 14 % 6 + 31 / 4);

        System.out.print("(int)(2.3*5+10/3-1) = ");
        System.out.println((int) (2.3 * 5 + 10 / 3 - 1));

        System.out.print("(int)(2.3*5+10/3-1) = ");
        System.out.println((int) (2.3 * 5 + 10 / 3 - 1));
    }

}
