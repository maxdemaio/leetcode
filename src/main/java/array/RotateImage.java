package array;


/**
 * @author Max DeMaio
 * Solved on 11/05/2022
 * <p>
 * Rotate Array
 * https://leetcode.com/problems/rotate-image/
 * Difficulty: Medium
 * <p>
 * Approach:
 * just go backwards and put numbers in order
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1) for no-memory version
 */


public class RotateImage {
    public int[][] rotateWithMem(int[][] matrix) {
        // create new matrix with the row and col size of given matrix
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        // iterate over rows backwards
        // row
        for (int i = matrix.length - 1; i >= 0; i--) {
            // go over cols forwards
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                newMatrix[j][(matrix.length - 1) - i] = matrix[i][j];
            }
            System.out.println();
        }

        return newMatrix;
    }


}
