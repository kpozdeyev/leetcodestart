package ru.kpozdeyev;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    String shortest = strs[0];
    for (String str : strs) {
      if (shortest.length() > str.length()) {
        shortest = str;
      }
    }
    for (int i = 0; i < shortest.length(); i++) {
      char ch = shortest.charAt(i);
      for (String str : strs) {
        if (str.charAt(i) != ch) {
          return i == 0 ? "" : shortest.substring(0, i);
        }
      }
    }
    return shortest;
  }

  public static void main(String[] args) {
    var prefix = new LongestCommonPrefix();
    String result = prefix.longestCommonPrefix(new String[] {"flower","flow","flight"});
    System.out.println(result);
  }

}
