package array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/*
Approach:
The algorithm uses a HashMap to count the frequency of each element in the input array.
It then maintains a PriorityQueue of size k to store the k most frequent elements,
allowing efficient retrieval of the desired elements based on their frequencies.

Time complexity:
The time complexity of the approach is O(nlog(k)),
where n is the number of elements in the input array nums
and k is the desired number of most frequent elements.
Counting the frequency takes O(n) time,
while maintaining and extracting the k most frequent elements takes O(nlog(k)) and O(klog(k)) time, respectively. The overall time complexity is O(nlog(k)) due to these operations, ensuring efficient computation for large inputs.

Space complexity:
The space complexity is O(n) due to the HashMap used to store the frequency count,
which can have up to n distinct elements in the worst case.
The additional space used by the PriorityQueue
and the output array of size k is negligible compared to the input size,
making the space required for the HashMap the primary factor determining the space complexity.

Extra notes:
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k]; // Array to store the k most frequent elements
        HashMap<Integer, Integer> map = new HashMap<>(); // HashMap to count the frequency of each element

        // Count the frequency of each element using the HashMap
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        // Create a PriorityQueue to store entries from the HashMap based on their frequency
        // The higher frequencies will have higher priority in the PriorityQueue
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        // Add entries from the HashMap to the PriorityQueue
        // Keep the size of the PriorityQueue equal to k by removing the entry with the smallest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k)
                pq.poll();
        }

        // Extract the k most frequent elements from the PriorityQueue and store them in the array
        int i = k;
        while (!pq.isEmpty()) {
            res[--i] = pq.poll().getKey();
        }

        return res; // Return the array containing the k most frequent elements
    }

}
