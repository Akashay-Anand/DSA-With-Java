// import java.lang.*;
public class SICI {

    public static void main(String[] args) {
        System.out.println(MathChallenge(5,3));
    }

    static String MathChallenge(int num1, int num2){
        int ans =(int)(Math.ceil(num1/num2));
        String numString = String.format("%,.2f", ans);
        return numString ;
    } 
}


// xtumck92q7f




    // public static int MathChallenge(int num){
    //     int temp = 1, count=0;
    //     while(num>9){
    //         while(num>0){
    //             temp *= num%10;
    //             num = num/10;
    //         }
    //         count++;
    //         num = temp;
    //     }
    //     return count;
    // }