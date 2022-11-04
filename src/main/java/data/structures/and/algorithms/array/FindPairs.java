package data.structures.and.algorithms.array;

public class FindPairs {
    public static int findArrayPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("pair found " + nums[i] + ", " + nums[j]);
                }
            }
        }
        System.out.println("pair not found");
        return target;
    }
}
