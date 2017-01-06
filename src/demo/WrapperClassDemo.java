package demo;

/**
 * Created by Manohar on 12/21/2016.
 */
public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer x = 5;
        int y = x;

        System.out.println(x);
        System.out.println(y);

        if (args.length >= 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + b);
        }
    }
}
