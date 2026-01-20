class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0, front = 0, side = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0;
            int maxCol = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) top++;           // top view
                maxRow = Math.max(maxRow, grid[i][j]); // row max for front
                maxCol = Math.max(maxCol, grid[j][i]); // column max for side
            }
            front += maxRow;
            side += maxCol;
        }

        return top + front + side;
    }
}