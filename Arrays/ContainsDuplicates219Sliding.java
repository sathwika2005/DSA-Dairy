package Arrays;

import java.util.*;

// using sliding window approach.

public class ContainsDuplicates219Sliding {
    public boolean containsDuplicates(int[] nums, int key) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > key) {
                seen.remove(nums[i - key - 1]);
            }
            if (!seen.add(nums[i])) {
                return true;
            }
        }
        return false;
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
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        ContainsDuplicates219Sliding obj = new ContainsDuplicates219Sliding();
        System.out.println(obj.containsDuplicates(nums, key));
        sc.close();
    }
}
