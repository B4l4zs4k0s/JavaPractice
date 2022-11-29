public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10
        a += 3;
        System.out.println(a);

        int b = 100;
        // decrease the value of b by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // double the value of c
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // divide the value of d by 5
        d = d / 5;
        System.out.println(d);

        int e = 8;
        // cube the value of e
        e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)
        boolean isBigger = f1 > f2;
        System.out.println(isBigger);

        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)
        boolean isGreater = (g2 * 2) > g1;
        System.out.println(isGreater);

        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)
        boolean isDivisor = h % 11 == 0;
        System.out.println(isDivisor);

        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        boolean isSquaredGreater = i1 > i2 * i2 && i1 > i2 * i2 * i2;
        System.out.println(isSquaredGreater);

        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        boolean isDivideable = j % 3 == 0 || j % 5 == 0;
        System.out.println(isDivideable);
    }
}
