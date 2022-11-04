package data.structures.and.algorithms.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairsTest {

    @Test
    void findArrayPair() {
        int[] nums = {1, 9, 3, 5, 7, 4};
        int result = FindPairs.findArrayPair(nums, 10);
        int target = 10;
        assertEquals(target, result);
    }

    @Test
    void notFindArrayPair() {
        int[] nums = {2, 1, 5, 3, 7, 9};
        int result = FindPairs.findArrayPair(nums, 20);
        int target = 20;
        assertEquals(target, result);
    }
}