public class RichestCustomerWealth_1672 {
  public static void main(String[] args) {
    int[][] accounts = {{2,3,1},{1,1,5},{4,3,1}};
    System.out.println(maximumWealth(accounts));
  }
  
  static int maximumWealth(int[][] accounts){
    int maxWealth = 0;
    for(int i=0;i<accounts.length;i++){
      int sum = 0;
      int[] temp = accounts[i];
      for(int j=0;j<temp.length;j++){
        sum += temp[j];
      }
      if(sum > maxWealth){
        maxWealth = sum;
      }
    }
    return maxWealth;
  }
}
