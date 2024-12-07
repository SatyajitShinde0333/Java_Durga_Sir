public class TwoDArrays {
    // public static void spiralMatrix(int matrix[][]) {
    //     if (matrix.length == 0) return; // Handle empty matrix

    //     int startRow = 0;
    //     int endRow = matrix.length - 1;
    //     int startCol = 0;
    //     int endCol = matrix[0].length - 1;

    //     while (startRow <= endRow && startCol <= endCol) {
    //         // Traverse from left to right
    //         for (int j = startCol; j <= endCol; j++) {
    //             System.out.print(matrix[startRow][j] + " ");
    //         }
    //         startRow++;

    //         // Traverse from top to bottom
    //         for (int i = startRow; i <= endRow; i++) {
    //             System.out.print(matrix[i][endCol] + " ");
    //         }
    //         endCol--;

    //         // Traverse from right to left
    //         if (startRow <= endRow) {
    //             for (int j = endCol; j >= startCol; j--) {
    //                 System.out.print(matrix[endRow][j] + " ");
    //             }
    //             endRow--;
    //         }

    //         // Traverse from bottom to top
    //         if (startCol <= endCol) {
    //             for (int i = endRow; i >= startRow; i--) {
    //                 System.out.print(matrix[i][startCol] + " ");
    //             }
    //             startCol++;
    //         }
    //     }
    // }

    // diagonal sum

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                    }
            }
            
            }return sum;
   
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            
        };
        //spiralMatrix(matrix);
        int sum = diagonalSum(matrix);
        System.out.println("Sum of diagonal elements: " + sum);
    }
}


   