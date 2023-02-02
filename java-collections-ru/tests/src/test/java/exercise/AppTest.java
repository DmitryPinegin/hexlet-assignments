package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = App.take(numbers1, 5);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        Assertions.assertEquals(expected, actual);

        List<Integer> expected1 = App.take(numbers1, 2);
        List<Integer> actual1 = new ArrayList<>();
        actual1.add(1);
        actual1.add(2);
        Assertions.assertEquals(expected1, actual1);

        List<Integer> expected2 = App.take(numbers1, 4);
        List<Integer> actual2 = new ArrayList<>();
        actual2.add(1);
        actual2.add(2);
        actual2.add(3);
        actual2.add(4);
        Assertions.assertEquals(expected2, actual2);

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> expected3 = App.take(numbers2, 2);
        List<Integer> actual3 = new ArrayList<>();
        Assertions.assertEquals(expected3, actual3);

        List<Integer> expected4 = App.take(numbers2, 0);
        Assertions.assertEquals(expected4, actual3);

        // END
    }
}
