package com.company.普通数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-06-23 15:41
 */
public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][2];
        Arrays.sort(intervals,(i1,i2)->{
            if (i1[0]!=i2[0]){
                return i1[0]-i2[0];
            }else{
                return i1[1]-i2[1];
            }
        });
//        如果当前区间的左端点在数组 merged 中最后一个区间的右端点之后，那么它们不会重合，我们可以直接将这个区间加入数组 merged 的末尾；
//
//否则，它们重合，我们需要用当前区间的右端点更新数组 merged 中最后一个区间的右端点，将其置为二者的较大值。
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int l=intervals[i][0];
            int r=intervals[i][1];
            if (res.size()==0||res.get(res.size()-1)[1]<l){
                res.add(new int[]{l,r});
            }else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],r);
            }
        }
        return res.toArray(new int[0][0]);
    }
}
