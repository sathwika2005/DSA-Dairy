package Arrays;

import java.util.*;

public class ContainsDuplicate219 {
    public boolean containsDuplicates(int[] nums, int key) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i]) && Math.abs((map.get(nums[i]) - i)) <= key) {
                return true;
            }
            map.put(nums[i], i);
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
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
        ContainsDuplicate219 obj = new ContainsDuplicate219();
        System.out.println(obj.containsDuplicates(nums, key));
        sc.close();
    }
}
