public class countNegativeNumberInSortedMatrix {
    
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countNegativeNumberInSortedMatrix solution = new countNegativeNumberInSortedMatrix();
        int[][] grid = {
            {3, 2},
            {1, 0}
        };
        int result = solution.countNegatives(grid);
        System.out.println("The number of negative numbers in the grid is: " + result);
    }
}

    
    

