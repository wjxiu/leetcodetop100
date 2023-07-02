package com.company.图;

/**
 * @author xiu
 * @create 2023-07-02 21:31
 */
public class 岛屿的周长 {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
//                    只有一个岛屿，直接返回，有多个设置变量保存结果
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    int dfs(int[][] grid, int i, int j) {
//    只有地图边界和靠着海洋的陆地才是想要的
        if (!inArea(grid, i, j)) {
            return 1;//超出范围
        }
//        找到海洋
        if (grid[i][j] == 0) {
            return 1;
        }
//        去掉重复的
        if (grid[i][j] ==2) {
            return 0;
        }
        //    将访问过格子的设置为‘2’防止重复遍历
        grid[i][j] = 2;
        return  dfs(grid, i, j + 1) +
                dfs(grid, i, j - 1) +
                dfs(grid, i - 1, j) +
                dfs(grid, i + 1, j);
    }

    // 判断i,j是否在格子范围内
    private boolean inArea(int[][] grid, int i, int j) {
        return 0 <= i && i < grid.length
                && 0 <= j && j < grid[0].length;
    }
}