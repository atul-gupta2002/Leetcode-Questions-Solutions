class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;    // Number of rows
        int n = grid[0].length; // Number of columns

        int[] rowCount = new int[m]; // Count of servers in each row
        int[] colCount = new int[n]; // Count of servers in each column

        // Count servers in each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int communicatingServers = 0;

        // Count communicating servers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                    communicatingServers++;
                }
            }
        }

        return communicatingServers;
        
    }
}