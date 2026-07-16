package Arrays;

import java.util.*;

public class TwoSum01 {
    public int[] twoSum(int[] nums, int target, int arraySize) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arraySize; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = sc.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter the value : ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        TwoSum01 obj = new TwoSum01();
        int[] result = obj.twoSum(nums, target, arraySize);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}