import java.util.ArrayList;
import java.util.List;

public class J00_test {
    public static void main(String[] args) {

        byte b = -31;
        System.out.println(~b);

        // Outer1:
        // for(int i=0;i<3;i++){
        //     System.out.println("Outer " + i);
        //     inner:
        //     for(int j=0;j<3;j++){
        //         System.out.println("Inner " + j);
                
        //         if(i == j+1) break Outer1;
        //         System.out.println("Bye");
        //     }
            
        // }


        
    }
}
class Solution{
    public List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(0,s,path,ans);
        return ans;
    }
    void solve(int index, String s, List<String> path, List<List<String>> res){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s, index,i)){
                path.add(s.substring(index, i+1));
                solve(i+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))
            return false;
        }
        return true;
    }
}