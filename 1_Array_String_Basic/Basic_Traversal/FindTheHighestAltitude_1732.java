public class FindTheHighestAltitude_1732 {
  public static void main(String[] args) {
    int[] gain ={-4,-3,-2,-1,4,3,2};
    System.out.println(largetAltitude(gain));

  }
  static int largetAltitude(int[] gain) {
  int a = 0;      // current altitude
  int max = 0;    // highest altitude

  for (int i = 0; i < gain.length; i++) {
    a += gain[i];       // always add gain
    if (a > max) {
      max = a;         // update highest altitude
    }
  }
  return max;
}

}
