package array;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @Test
    void findMin() {
        int[] array = {0, 5 ,10};
        int result = Min.findMin(array);
        int expected = 0;
        assertEquals(expected, result);
    }
}