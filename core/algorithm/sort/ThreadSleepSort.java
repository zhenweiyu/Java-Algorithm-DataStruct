package study.core.algorithm.sort;

/**
 * Created by zhenweiyu on 2017/6/8.
 */
public class ThreadSleepSort {

    public static void sort(int []num){
        for(int i =0;i<num.length;i++){
            final int index = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(num[index]);
                        System.out.print(num[index]);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }




    public static void main(String[]args){
       int[] num = new int[]{4,5,8,3,6,9,4,1};
       sort(num);
    }

}
