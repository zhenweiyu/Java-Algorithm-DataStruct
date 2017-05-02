package core.algorithm.sort;

import core.algorithm.utils.SortUtils;

/**
 * Created by zhenweiyu on 2017/4/27.
 * 冒泡排序
 */
public class BubbleSort {

    public static void sort(int []num){

        for(int i = 0;i<num.length-1;i++){
            for(int j = i;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

    }

    public static void main(String []args){
        int a[] = new int[]{9,3,1,2,5,7,12,0,6,3,3,9,8,7,12,45,0,26};
        sort(a);
        SortUtils.arrayPrint(a);


    }


}
