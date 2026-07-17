package Arrays;

import java.util.*;

public class ProductOfArrayExceptSelf238 {
    public int[] productOfArrays(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }
        return result;
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
        ProductOfArrayExceptSelf238 obj = new ProductOfArrayExceptSelf238();
        int[] result = obj.productOfArrays(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
