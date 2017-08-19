import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/8/19.
 */
public class MathUtils {

    /**
     *
     * @param a  number - a
     * @param b  number -b
     * @return greatest common divisor
     */
    public static int gcd(int a,int b){
        if(a == 0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return lcm
     */

    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }

    /**
     *
     * @param n
     * @return true -- is a prime number false - is not a prime number
     */
    public static boolean isPrimeNumber(int n){
       if(n <= 1){
           return false;
       }
       for(int i = 2;i*i<=n;i++){
           if(n % i == 0){
               return true;
           }
       }
       return false;
    }


    /**
     *
     * @param n
     * @return factorial
     */

    public static BigDecimal factorial(int n){
        BigDecimal result = new BigDecimal(1);
        BigDecimal temp;
        for(int i = 2;i<=n;i++){
            temp = new BigDecimal(i);
            result = result.multiply(temp);
        }
        return result;
    }




    public static void main(String []args){
        System.out.println(gcd(5,10));
        System.out.println(lcm(5,10));
        System.out.println(isPrimeNumber(997));
        System.out.println(factorial(15));
    }




}
