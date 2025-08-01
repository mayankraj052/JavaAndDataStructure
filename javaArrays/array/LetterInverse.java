package array;

public class LetterInverse {
  public static void main(String[] args) {
    String str = "MaYaNk raj";
    int n = str.length();
    StringBuilder sb = new StringBuilder();
    for(int i =0;i<n;i++){
      char ch = str.charAt(i);
      if(Character.isUpperCase(ch)){
        sb.append((char)(ch+32));
      }
      if(Character.isLowerCase(ch)){
        sb.append((char)(ch-32));
      }
    }
    System.out.println(sb);
  }
}
