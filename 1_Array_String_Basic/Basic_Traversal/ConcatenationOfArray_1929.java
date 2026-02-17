public class ConcatenationOfArray_1929 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int[] result = getConcatenation(arr);
    for(int num : result){
      System.out.println(num + " ");
    }
  }

  static int[] getConcatenation(int[] arr){
    int n = arr.length;
    int[] ans = new int[n * 2];
    for(int i=0;i<ans.length;i++){
      ans[i] = arr[i%n];
    }
    return ans;
  }
}