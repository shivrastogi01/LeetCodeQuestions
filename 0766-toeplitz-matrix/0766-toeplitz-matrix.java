class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // check along rows
        for (int i = 0; i < matrix.length; i++) {
            int startRow = i, startCol = 0;
            int previous = matrix[startRow][startCol];
            while (startRow < matrix.length && startCol < matrix[startRow].length) {
                int current = matrix[startRow][startCol];
                if (previous != current) {
                    return false;
                }
                previous = current;
                startRow++;
                startCol++;
            }
        }
        
        // check along columns
        for (int i = 1; i < matrix[0].length; i++) {
            int startRow = 0, startCol = i;
            int previous = matrix[startRow][startCol];
            while (startRow < matrix.length && startCol < matrix[startRow].length) {
                int current = matrix[startRow][startCol];
                if (previous != current) {
                    return false;
                }
                previous = current;
                startRow++;
                startCol++;
            }
        }

        return true;
    }
}