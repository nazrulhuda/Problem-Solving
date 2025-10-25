import java.util.*;

public class NeetCode7ProductExceptSelf {
    public static int[] productExceptSelfBrute(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];

        // Step 1️⃣: Build left array
        left[0] = 1; // nothing on the left of first element
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Step 2️⃣: Build right array
        right[n - 1] = 1; // nothing on the right of last element
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Step 3️⃣: Multiply left[i] * right[i]
        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }

        return output;
    }

     public static int[] productExceptSelfOptimized(int[] nums) {
        int n = nums.length;

        int[] output = new int[n];

        // Step 1️⃣: build left products directly into output[]
        // output[i] = product of everything to the LEFT of i
        output[0] = 1; // nothing to the left of first element
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2️⃣: go from RIGHT to LEFT, and multiply "right side" products
        // rightProduct will track product of everything to the RIGHT of i
        int rightProduct = 1; // nothing to the right of last element yet
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelfBrute(nums);
        System.out.println(Arrays.toString(result)); // [24, 12, 8, 6]
    }
}
