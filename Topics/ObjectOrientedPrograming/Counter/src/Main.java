public class Main {
    public static void main(String[] args) {
        Counter test = new Counter();
        System.out.println(test.getCurrentValue());
        test.addMore(50);
        System.out.println(test.getCurrentValue());
        test.addOne();
        System.out.println(test.getCurrentValue());
        test.resetToZero();
        System.out.println(test.getCurrentValue());
    }
}
