package searchSort;

/*

// The straight forward way is to brute force it by doing a linear scan.
// O(n) time and O(1) memory
 public int firstBadVersion(int n) {
    for (int i = 1; i < n; i++) {
        if (isBadVersion(i)) {
            return i;
        }
    }
    return n;
}
 */


public class FirstBadVersion {
    // Binary search
    // O(log n) time and O(1) space
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int num) {
        // example API
        return true;
    }
}
