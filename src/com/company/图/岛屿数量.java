package com.company.图;

/**
 * 网格问题的岛屿类问题
 * @author xiu
 * @create 2023-07-02 21:08
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
//                    dfs结束后意味着找到一个岛屿
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
//    将访问过格子的设置为‘2’防止重复遍历
//    递归访问前后左右四个格子，直到周围的四个格子不是未访问的陆地或者超出范围
    void dfs(char[][] grid,int i,int j){
        if(!inArea(grid,i,j)) return;//超出范围
        if (grid[i][j]!='1') return;//不是未访问的陆地
        grid[i][j]='2';
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
    }
// 判断i,j是否在格子范围内
    private boolean inArea(char[][] grid, int i, int j) {
        return  0<=i&&i< grid.length
                &&0<=j&&j<grid[0].length;
    }
}
