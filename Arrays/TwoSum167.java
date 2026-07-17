package Arrays;

import java.util.*;

public class TwoSum167 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int arraySize = sc.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter the value : ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}