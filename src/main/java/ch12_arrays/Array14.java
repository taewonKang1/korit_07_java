package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        // 1부터 100까지의 숫자를 2차 배열에 순서대록 값을 넣으시오.
        // 즉 nums[0][0] = 1, nums[0][1] = 2, nums[1][0] = 6
        int count = 1;
        for(int[] numArray : nums) {
            for(int i = 0; i < numArray.length; i++) {
                numArray[i] = count++;
            }
        }

        for (int[] numArray : nums) {
            for (int num : numArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
