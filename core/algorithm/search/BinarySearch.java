package search;

/**
 * Created by zhenweiyu on 2017/5/18.
 */
public class BinarySearch {

    public static int search(int[]num,int target){

        int mid = num.length/2;

        if(target==num[mid]){
            return mid;
        }
        if(target>num[mid]){
           for(int index = mid+1;index<num.length;index++){
               if(target == num[index]){
                   return index;
               }
           }
        }
        if(target<num[mid]){
            for(int index = mid-1;index>=0;index--){
                if(target == num[index]){
                    return index;
                }
            }
        }
        return -1;
    }

    public static void main(String []args){

        int [] num = {5,6,9,13,23,44,66,77,99};
        System.out.println(BinarySearch.search(num,77));

    }




}
