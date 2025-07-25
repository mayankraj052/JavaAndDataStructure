package array;

public class Anagram {
  public static boolean isAnagram(String str1, String str2){
    
    if(str1.length()!=str2.length()){
      return false;
    }
    int freq[] = new int[26];
    for(int i =0;i<str1.length();i++){
      freq[str1.charAt(i) -'a']++;
      freq[str2.charAt(i) -'a']--;
    }
    for(int count:freq){
      if(count!=0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(isAnagram("silent", "listen"));
  }
}
