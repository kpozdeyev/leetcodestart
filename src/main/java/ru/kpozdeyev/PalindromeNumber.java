package ru.kpozdeyev;

public class PalindromeNumber {

  public boolean isPalindrome(int x) {

    /*
    StringBuilder sb1 = new StringBuilder(String.valueOf(x));
    StringBuilder sb2 = new StringBuilder(sb1).reverse();
    return sb1.toString().equals(sb2.toString());
    */

    if (x < 0) {
      return false;
    } else if (x == 0) {
      return true;
    }

    int x1 = x;
    int length = 0;
    while (x1 > 0) {
      x1 /= 10;
      length++;
    }

    int x2 = x;
    while (length > 1) {
      int pow10 = (int) Math.pow(10, length - 1);
      int left = x2 / pow10;
      int right = x2 % 10;
      if (left != right) {
        return false;
      }
      x2 = (x2 - left * pow10) / 10;
      length -= 2;
    }
    return true;

  }

  public static void main(String[] args) {
    var palindromeNumber = new PalindromeNumber();
    boolean result = palindromeNumber.isPalindrome(121);
    System.out.println(result);
  }

}
