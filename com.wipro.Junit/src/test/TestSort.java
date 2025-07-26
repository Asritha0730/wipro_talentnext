package test;

import static org.junit.Assert.*;
import org.junit.Test;
import task.SortService;

public class TestSort {

    @Test
    public void testSortValues() {
        SortService ss = new SortService();
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, ss.sortValues(input));
    }
}

