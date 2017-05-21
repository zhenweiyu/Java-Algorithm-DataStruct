package search;

/**
 * Created by zhenweiyu on 2017/5/8.
 */
public class SequenceSearch {

      public static int search(int[]num,int target){

          for(int i =0;i<num.length;i++){
              if(num[i] == target){
                  return i;
              }
          }
          return Integer.MAX_VALUE;
      }

      public static void main(String []args){

          int [] num = new int[]{1,4,5,4,3,8,9,66,44,55,24,66,33};

          System.out.println(search(num,66));

      }


}
