import java.util.*;


public class J07_StringsQus {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ehlol";
        Anagram(s1, s2);
        // ReverseStr();
        // FindPattern();

        // String str = "AABAACAADAABAAABAA";
        // String ptr = "AABA";
        // System.out.println( str.indexOf(ptr,5));

    }   

    static void Anagram(String s1, String s2){
        int[] arr = new int[256]; // it is assumed that the characters are stored using 8 bit and there can be 256 possible unique characters

        for(int i=0;i<s1.length();i++) arr[s1.charAt(i)]++;
        for(int i=0;i<s2.length();i++) arr[s2.charAt(i)]--;

        boolean flag = true;
        for(int i=0;i<256;i++)
            if(arr[i] != 0){ flag = false; break;}
        
        System.out.println(flag);
    }

    static void ReverseStr(){
        String str = "Hello world here i am going to explore the system";
        // char arr[] = str.toCharArray();
        StringTokenizer stk = new StringTokenizer(str," ");

        ArrayList<String> li = new ArrayList<String>();
        
        while(stk.hasMoreTokens())
            li.add(stk.nextToken());
    
        str = "";
        for(int i= li.size()-1;i>=0;i--)
            str += li.get(i) + " ";

        System.out.println(str);

        str.toCharArray().toString();
    }

    static void FindPattern(){
        String str = "AABAACAADAABAAABAA";
        String ptr = "AABA";

        int sl = str.length();
        int pl = ptr.length();

        // error infinity loop
        // int n = str.length();
        // int i =0;
        // while(str.indexOf(ptr,i) != -1 && i<n){ 
        //     System.out.println("found at index : " + str.indexOf(str));
        //     i += str.indexOf(str);
        // }

        // Method 1 ; Best TC: O(n) ; Worst TC: O(pl*(sl-pl+1));
        for(int i=0;i<=sl-pl;i++){
            int j=0;
            for( j=0;j<pl;j++){
                if(str.charAt(i+j) != ptr.charAt(j)) break;
            }
            if(j==pl) System.out.println("Found at: " + i);
        }

        // Method 2 ; 
        
    }
}

/*

Anagram: Two strings are said to be an anagram of each other if they are just permutations of each other. That is, the set of characters in both the strings must be the same, only the order of characters can be different.



 */