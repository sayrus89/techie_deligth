package data.structures.and.algorithms.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairs2Test {

    @Test
    void findPairs2() {
        int[] nums = {1, 3, 7, 9, 4, 5, 6, 8, 2};
        int result = FindPairs2.findPairs2(nums, 10);
        int target = 10;
        assertEquals(result, target);
    }
}