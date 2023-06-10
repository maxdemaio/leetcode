package array;

import java.util.*;

/*
Approach:
The trick in the groupAnagrams function is to utilize a HashMap
where the key represents a unique characteristic of an anagram group.
By iterating over each string, the function counts the frequency of each char
and converts it into a string representation.
This string representation is used as the key in the HashMap.
By doing so, strings with the same character frequencies are grouped together.
The HashMap stores the anagram groups, with the values being lists of strings belonging to each group.
Finally, the function extracts the grouped anagram strings from the HashMap and returns them.

Time complexity:
The function uses a loop to iterate over each string in the input array,
resulting in a time complexity of O(n), where n is the total number of characters in all the strings.
Within the loop, there is another loop that iterates over each character in the current string.
Since the maximum length of a string is not specified, let's assume it is k.
Therefore, the inner loop has a time complexity of O(k).
The function also uses map.computeIfAbsent() and map.get() methods, which have an average time complexity of O(1) for a HashMap.
Overall, the time complexity of the function is O(n * k).

Space complexity:
The function uses additional space to store the result in the res list,
which has a space complexity of O(m), where m is the total number of anagram groups.
It also creates a HashMap called map to store the anagram groups.
The space required by map depends on the number of unique anagram keys generated from the input strings.
The maximum number of unique anagram keys is bounded by the number of distinct characters in the input strings,
which is 26 (assuming lowercase English alphabets only).
Therefore, the space complexity of map is O(26) or O(1).
Ignoring the constant factor, the overall space complexity of the function is O(m).

Extra notes:

 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
