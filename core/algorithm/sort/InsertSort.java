package core.algorithm.sort;

import core.algorithm.utils.SortUtils;

/**
 * Created by zhenweiyu on 2017/4/28.
 * 插入排序
 */
public class InsertSort {

    public static void sort(int []num){
        if(num.length<=1){
            return;
        }
        for(int i = 1;i<num.length;i++){
            if(num[i]<num[i-1]){
                int key = num[i];
                int j ;
                for(j = i-1;j>=0&&num[j]>key;j--){
                    num[j+1] = num[j];
                }
                num[j+1] = key;
            }
        }
    }

    public static void main(String []args){
        int a[] = new int[]{9,3,1,2,5,7,12,0,6,3,3,9,8,7,12,45,0,26};
        sort(a);
        SortUtils.arrayPrint(a);
    }



}
