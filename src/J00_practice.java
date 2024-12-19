import java.util.Arrays;

public class J00_practice {
  public static void main(String[] args) {
    int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
    // bs(arr);
    ss(arr);
    System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
  }

  static void ss(int[] arr){
    for(int i=0; i<arr.length-1; i++){
      int si=i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[si]>arr[j]) si = j;
      }
      if(arr[si] < arr[i]){
        int temp = arr[si];
        arr[si] = arr[i];
        arr[i] = temp;
      }
    }
  }

}
