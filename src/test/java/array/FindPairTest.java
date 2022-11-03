package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairTest {

    @Test
    void findArrayPair() {
        int[] nums = {1, 9, 3, 5, 7, 4};
        int result = FindPair.findArrayPair(nums, 10);
        int target = 10;
        assertEquals(target, result);
    }
}