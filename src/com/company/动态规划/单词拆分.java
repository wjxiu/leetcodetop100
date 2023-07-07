package com.company.动态规划;

import java.util.HashSet;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-07 10:07
 */
public class 单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] res=new boolean[s.length()+1];
//        初始条件，每次都是忘记写
        res[0]=true;
        for (int i = 1; i <s.length(); i++) {
            for (int j = 0; j <=i ; j++) {
                if (res[j]&&set.contains(s.substring(j,i))){
                    res[i]=true;
                    break;
                }
//                下面做法是错误的，因为结果会被覆盖掉，第一次res[j]&&set.contains(s.substring(j,i))是true,res[j]&&set.contains(s.substring(j,i))第二次变成false了，
//                我们只需要考虑能否组合，所以一旦能组合，设置为true并且跳出内层循环，减少开销
//                res[i]=res[j]&&set.contains(s.substring(j,i));
            }
        }
        return res[res.length-1];
    }
}
