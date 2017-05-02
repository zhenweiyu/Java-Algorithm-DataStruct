package study.core.algorithm.sort;

import study.core.algorithm.utils.SortUtils;

/**
 * Created by zhenweiyu on 2017/4/28.
 * 基数排序
 * 数组中不含0,无重复数字
 */
public class RadixSort {

    public static void sort(int []num){
        if(num.length<=1){
            return;
        }
        int max = num[0];
        for(int i=1;i<num.length;i++){
           if(num[i]>max){
               max = num[i];
           }
        }
        int []temp = new int[max+1];
        for(int i =0;i<num.length;i++){
            temp[num[i]] = num[i];
        }
        for(int i=0,j=0;i<temp.length;i++){
            if(temp[i]!=0){
                num[j++] = temp[i];
            }
        }
    }

    public static void main(String[] args){
        int []a = new int[]{6,5,4,9,8,10,20,63,1,3};
        sort(a);
        SortUtils.arrayPrint(a);
    }



}
