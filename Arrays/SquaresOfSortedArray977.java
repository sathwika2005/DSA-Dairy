package Arrays;

import java.util.*;

public class SquaresOfSortedArray977 {
    public static int[] sortedArrayOfSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int[] result = new int[n];
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value :  ");
            nums[i] = sc.nextInt();
        }
        int[] result = sortedArrayOfSquares(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
