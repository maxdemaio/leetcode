package bitManipulation;

/**
 * Approach/Notes:
 * XOR will get us the sum with no carry
 * AND plus a left shift will give us the carries
 * We keep adding these two until there are no carries left!
 *
 * Time complexity:
 * O(n)
 *
 * Space complexity:
 * O(1)
*/
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp = (a & b) << 1;
            a = (a ^ b);
            b = tmp;
        }
        return a;
    }
}
