import java.util.*;

// for HashMap, ArrayList, Collections, etc.

public class Neetcode5TopKFrequentElements{

    public static int[] UsingSorting(int[] nums, int k) {

        // Step 1: Count how many times each number appears
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (count.containsKey(num)) {
                // if number is already in the map, increase its count by 1
                count.put(num, count.get(num) + 1);
            } else {
                // if number not found in map, add it with count = 1
                count.put(num, 1);
            }
        }

        // Step 2: Convert the map into a list of small arrays [frequency, number]
        List<int[]> arr = new ArrayList<int[]>();

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();      // the actual number
            int frequency = entry.getValue(); // how many times it appeared
            int[] pair = new int[2];
            pair[0] = frequency;
            pair[1] = number;
            arr.add(pair);
        }

        // Step 3: Sort the list in descending order by frequency (highest first)
        arr.sort((a, b) -> b[0] - a[0]); // same as using Comparator, but shorter

        // Step 4: Pick the first k numbers (the most frequent ones)
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1]; // [1] holds the actual number
        }

        // Step 5: Return the result
        return result;
    }
    
    public static int[] UsingMinHeap(int[] nums, int k) {

        // Step 1️⃣: Count how many times each number appears
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            // getOrDefault(num, 0) returns 0 if num not found
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        // Example after this step: {1=3, 2=2, 3=1}

        // Step 2️⃣: Create a MIN HEAP (PriorityQueue)
        // The smallest frequency element will stay at the top
        // Each element is an int[] = [frequency, number]
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]   // sort by frequency (ascending order)
        );

        // Step 3️⃣: Add elements from the map into the heap
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            // Add the [frequency, number] pair into the heap
            heap.add(new int[]{freq, num});

            // If heap size is larger than k, remove the smallest frequency
            if (heap.size() > k) {
                heap.poll(); // removes the least frequent element
            }
        }

        // Step 4️⃣: Create a result array
        int[] result = new int[k];
        int index = 0;

        // Remove all elements from heap (these are top k frequent numbers)
        while (!heap.isEmpty()) {
            int[] pair = heap.poll(); // removes and returns top of heap
            result[index] = pair[1];  // store the number
            index++;
        }

        // Step 5️⃣: Return the result array
        return result;
    }

    

    public static int[] UsingBucketSort(int[] nums, int k) {

        // Step 1️⃣: Count frequency of each number using HashMap
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        // Example: {1=3, 2=2, 3=1}

        // Step 2️⃣: Create an array of buckets
        // Each bucket[i] = list of numbers that appear 'i' times
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Fill the buckets
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(number);
        }

        // Step 3️⃣: Collect numbers from highest frequency down
        int[] result = new int[k];
        int index = 0;

        // Go backwards through bucket array (high freq → low freq)
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index] = num;
                    index++;
                    if (index == k) break;  // Stop once we have k elements
                }
            }
        }

        // Step 4️⃣: Return result
        return result;
    }

    // Step 6: Main function to test the program
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] answer = UsingMinHeap(nums, k);

        System.out.println("Top " + k + " frequent elements are:");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println(); // new line
    }
}
