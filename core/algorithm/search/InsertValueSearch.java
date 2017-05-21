package search;

/**
 * Created by zhenweiyu on 2017/5/21.
 */
public class InsertValueSearch {

    /*
     *  @param int []num 有序数列

     */
    public static int search(int []num,int lowIndex,int highIndex,int target){

        int findIndex = lowIndex + (target-num[lowIndex])/(num[highIndex]-num[lowIndex])*(highIndex-lowIndex);
        if (target>findIndex){
            for(int index= findIndex;index<=highIndex;index++){
                if(target == num[index]){
                    return index;
                }
            }
        }else{
            for(int index = findIndex-1;index>=0;index--){
                if(target == num[index]){
                    return index;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String []args){
        int []num = new int[]{4,5,6,7,8,9,10,11,12,13,14,15,16,20,25,29};
        System.out.println(search(num,0,num.length-1,20));

    }

}
