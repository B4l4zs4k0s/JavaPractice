public class Counter {
    int counter = 0;

    public Counter() {
    }

    public void addMore(int number) {
        counter += number;
    }

    public void addOne() {
        counter++;
    }

    public int getCurrentValue() {
       return counter;
    }

    public void resetToZero() {
        counter = 0;
    }

}
