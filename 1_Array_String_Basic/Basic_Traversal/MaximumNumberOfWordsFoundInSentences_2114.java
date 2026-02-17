public class MaximumNumberOfWordsFoundInSentences_2114 {
  public static void main(String[] args) {
    String[] sentences = {
      "alice and bob love leetcode",
      "i think so too",
      "this is great thanks very much"
    };
    System.out.println(mostWordsFound(sentences));
  }

  static int mostWordsFound(String[] sentences) {
    int maxWords = 0;
    for(int i=0;i<sentences.length;i++){
      String temp = sentences[i];
      int wordCount = 1;
      for(int j=temp.length()-1;j>=0;j--){
        if(temp.charAt(j) == ' '){
          wordCount++;
        }
      }
      if(wordCount > maxWords){
        maxWords = wordCount;
      }
    }
    return maxWords;
  }
}
