package study.core.algorithm.sort;

import study.core.algorithm.utils.SortUtils;

/**
 * Created by zhenweiyu on 2017/4/26.
 * 快速排序
 */
public class QuickSort {

    public static void sort(int []num,int left,int right){
        if(left>=right){
            return;
        }
        int lowPos = left;
        int highPos = right;
        int key = num[left];
        while (lowPos!=highPos) {
            for (; ; highPos--) {
                if (highPos <= lowPos) {
                    break;
                }
                if (num[highPos] < key) {
                    num[lowPos] = num[highPos];
                    break;
                }
            }
            for (; ; lowPos++) {
                if (lowPos >= highPos) {
                    break;
                }
                if (num[lowPos] > key) {
                    num[highPos] = num[lowPos];
                    break;
                }
            }
        }
        if(lowPos==highPos){
            num[lowPos] = key;
        }
        sort(num,left,lowPos-1);
        sort(num,lowPos+1,right);

    }
     public static void main(String []args){
        int [] num = new int[]{7,9,8,12,6,5};
        QuickSort.sort(num,0,num.length-1);
        SortUtils.arrayPrint(num);
     }




}
