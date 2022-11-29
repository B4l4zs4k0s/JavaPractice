import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void sum() {
        Sum sum = new Sum();
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(33, 33));
        assertEquals(66, sum.sum(testList));
    }

    @Test
    void sumEmptyList() {
        Sum sum = new Sum();
        ArrayList<Integer> empty = new ArrayList<>();
    }

    @Test
    void sumHasOne (){
        Sum sum = new Sum();
        ArrayList<Integer> oneNum = new ArrayList<>();
        oneNum.add(10);
        assertEquals(10, sum.sum(oneNum));

    }

    @Test
    void hasMultiple(){
        Sum sum = new Sum();
        ArrayList<Integer> multiple = new ArrayList<>(Arrays.asList(1,3,6,7,9));
        assertEquals(26,sum.sum(multiple));
    }

    @Test
    void nullList() {
        Sum sum = new Sum();
        ArrayList<Integer> isNull = null;
        assertNull(sum.sum(isNull));
    }
}