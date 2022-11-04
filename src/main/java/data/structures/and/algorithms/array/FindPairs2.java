package data.structures.and.algorithms.array;

import java.util.Arrays;

public class FindPairs2 {

    /**
     * @param nums
     * @param target Функция поиска пары в массиве с заданной суммой с помощью сортировки
     * @return target
     */
    public static int findPairs2(int[] nums, int target) {

        /**
         * сортируем массив по возрастанию
         */
        Arrays.sort(nums);

        /**
         * поддерживать два индекса, указывающих на конечные точки массива
         */
        int low = 0;
        int high = nums.length - 1;

        /**
         * уменьшаем пространство поиска `nums[low…high]` на каждой итерации цикла
         *  цикл до тех пор, пока пространство поиска не будет исчерпано
         */

        while (low < high) {
            /**
             * сумма найдена
             */
            if (nums[low] + nums[high] == target) {
                System.out.println("Pair found: " + nums[low] + " , " + nums[high]);
            }

            /**
             * увеличиваем `low` индекс, если сумма меньше желаемой суммы;
             * уменьшаем индекс `high`, если сумма больше желаемой суммы
             */
            if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        /**
         * доходим сюда, если пара не найдена
         */
        System.out.println("Pair not found: ");
        return target;
    }
}

