package array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // get frequency counts in hashmap??
    // then just get the highest ones
    public int[] topKFrequent(int[] nums, int k) {
        // frequency map
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int num: nums) {
            Integer key = Integer.valueOf(num);
            if (myMap.containsKey(key)) {
                Integer count = myMap.get(key); // Retrieve current value
                myMap.put(key, count + 1); // Increment and update value
            } else {
                myMap.put(key, 0);
            }
        }
        // Use a min-heap to keep track of top k frequent elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> myMap.get(a) - myMap.get(b));
        for (int key : myMap.keySet()) {
            minHeap.offer(key); // Add key to the min-heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the element with the smallest frequency
            }
        }

        // Convert the min-heap to an array
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}
