package DailyChallenge;

import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) {
        String str = "hello world, I am akashay Anand";
        StringTokenizer tokens = new StringTokenizer(str, " ");

        str = "";
        
        while (tokens.hasMoreTokens()){
            str = tokens.nextToken() + str;
            if(tokens.hasMoreTokens()) str = " " + str; 
        }

        System.out.println(str);
    }
}
