package linkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public String toString() {
        String result = "[";
        result += helperString();
        return result + "]";
    }

    private String helperString() {
        if (next == null) {
            return val + "";
        }
        // recurse
        return val + "," + next.helperString();
    }
}
