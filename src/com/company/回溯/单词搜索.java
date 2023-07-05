package com.company.回溯;

/**
 * @author xiu
 * @create 2023-07-04 9:32
 */
public class 单词搜索 {
    public static void main(String[] args) {
         char[][] borad=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCE";
        System.out.println(new 单词搜索().exist(borad, word));
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] used=null;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                used=new boolean[board.length][board[0].length];
                if (dfs(board,word,0,i,j,used)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j, boolean used[][]) {
        if (!inArea(board,i,j)||used[i][j]) return false;
        if (board[i][j]!=word.charAt(index)){
            return false;
        }else{
            used[i][j]=true;
        }
        if (index ==word.length()-1) return true;
        boolean b= dfs(board,word, index +1,i+1,j,used)||
                dfs(board,word, index +1,i-1,j,used)||
                dfs(board,word, index +1,i,j+1,used)||
                dfs(board,word, index +1,i,j-1,used);
        used[i][j]=false;
        return b;
    }

    private boolean inArea(char[][] board, int i, int j) {
        return i>=0&&i<board.length
                &&j>=0&&j< board[0].length;
    }


}
