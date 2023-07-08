package com.company.动态规划;

/**
 * @author xiu
 * @create 2023-07-08 9:08
 */
public class 最小路径和 {
    public int minPathSum(int[][] grid) {
//        原地修改grid数组,含义为0,0到下标i,j的最小数字总和
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                else if (i == 0) grid[i][j] = grid[i][j - 1]+grid[i][j];
                else if (j == 0)  grid[i][j] = grid[i - 1][j]+grid[i][j];
                else grid[i][j] =Math.min( grid[i][j - 1] , grid[i - 1][j])+grid[i][j];

            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
