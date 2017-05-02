package study.core.algorithm.sort;

import study.core.algorithm.utils.SortUtils;

/**
 * Created by zhenweiyu on 2017/4/27.
 * 归并排序
 */
public class MergeSort {


    public static void merge(int []num,int left,int right){
        if(left == right){
            return;
        }
        int m = (left+right)/2;
        merge(num,left,m);
        merge(num,m+1,right);
        sort(num,left,m,right);
    }


    public static void sort(int []num,int start1,int end1,int end2){
        int pos1 = start1;
        int pos2 = end1+1;
        int temp[] = new int[end2-start1+1];
        int pos_temp = 0;
        while (pos1<=end1&&pos2<=end2) {
            if (num[pos1] < num[pos2]) {
                temp[pos_temp++] = num[pos1++];
            }
            else {
                temp[pos_temp++] = num[pos2++];
            }
        }

        while (pos2<=end2){
           temp[pos_temp++] = num[pos2++];
        }
        while (pos1<=end1){
            temp[pos_temp++] = num[pos1++];
        }
        for(int x=0,l=start1;x<temp.length;x++,l++){
            num[l] = temp[x];
        }

    }

    public static void main(String []args){
        int []a = new int[]{7,9,8,12,6,5};
        merge(a,0,a.length-1);
        SortUtils.arrayPrint(a);
    }

}
