package Arrays;

import java.util.*;

public class ContainsDuplicate217 {
    public boolean containsDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) && map.get(i) >= 1) {
                return true;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays size : ");
        int arraySize = sc.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter the value : ");
            nums[i] = sc.nextInt();
        }
        ContainsDuplicate217 obj = new ContainsDuplicate217();
        System.out.println("Contains Dulicates ? " + obj.containsDuplicates(nums));
        sc.close();
    }
}
