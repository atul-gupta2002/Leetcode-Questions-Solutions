class Solution {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length ;
        int m = heightMap[0].length ;
        if (n < 3 || m < 3) return 0;

        int water = 0;
        boolean[][] vis = new boolean[n][m];
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for (int i = 0; i <n ; i++){
            for (int j = 0; j<m ; j++){
                if (i == 0 || j == 0 || i == n-1 || j == m-1){
                    pq.offer(new int[]{heightMap[i][j], i, j});
                    vis[i][j] = true;
                }
            }
        }

        while (!pq.isEmpty()){
            int[] curr = pq.poll();
            int ht = curr[0];
            int x = curr[1];
            int y = curr[2];

            for (int[] dir: directions){
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && ny >=0 && nx < n && ny < m && !vis[nx][ny]){
                    vis[nx][ny] = true ;
                    water += Math.max(0, ht-heightMap[nx][ny]);
                    pq.offer(new int[]{ Math.max(ht, heightMap[nx][ny]), nx, ny});
                }
            }
        }
        return water;
    }
}