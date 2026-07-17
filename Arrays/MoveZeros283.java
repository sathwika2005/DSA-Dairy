package Arrays;

import java.util.*;

public class MoveZeros283 {
    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value : ");
            nums[i] = sc.nextInt();
        }
        moveZeros(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
