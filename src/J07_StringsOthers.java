import java.util.StringJoiner;
import java.util.StringTokenizer;

public class J07_StringsOthers {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Hello Buffer");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("hello Builder");
        System.out.println(sb2);

        String str = "Hello boy A B C D";

        StringTokenizer stk = new StringTokenizer(str); // more concepts are there to practice

        // while(stk.hasMoreTokens()){
        //     System.out.println(stk.nextToken());
        // }

        StringJoiner sj1 = new StringJoiner(",");

        sj1.setEmptyValue("Hello I am empty");
        System.out.println(sj1);

        while(stk.hasMoreTokens()){
            sj1.add(stk.nextToken());
        }

        System.out.println(sj1);

        

        
    }

    // public static int comp(String s1, String s2){
    //     if(s1>s2) return 1;
    // }
}
