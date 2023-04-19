package ru.kpozdeyev;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    // очевидное решение через 2 вложенных цикла обладает сложностью O(n2)
    // попробуем решить одним циклом + мапой
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return new int[] {map.get(nums[i]), i};
      }
      map.put(target - nums[i], i);
    }
    return new int[] {0, 0};
  }

  public static void main(String[] args) {
    var twoSum = new TwoSum();
    int[] result = twoSum.twoSum(new int[] {2,7,11,15}, 9);
    System.out.println(result[0] + " " + result[1]);
  }

}
