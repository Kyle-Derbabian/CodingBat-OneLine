// Doesn't work

public boolean splitArray(int[] nums) {
  //return splitArray(0, nums, 0, 0);
  //java.util.function.BiPredicate function = (int start, int numbers[], int sum1, int sum2) -> { return start >= numbers.length ? sum1 == sum2 : function.apply(start + 1, numbers, sum1 + numbers[start], sum2) || function.apply(start + 1, numbers, sum1, sum2 + numbers[start]); };
  // values = {start, sum1, sum2}
  final java.util.function.BiPredicate<Integer[], Integer[]> function = (Integer[] values, Integer[] numbers) -> 
  { 
    return values[0] >= numbers.length ? values[1] == values[2] : 
    this.function.test(new Integer[]{values[0] + 1, values[1] + numbers[values[0]], values[2]}, numbers) ||
    this.function.test(new Integer[]{values[0] + 1, values[1], values[2] + numbers[values[0]]}, numbers); 
  };
  return function.test(new Integer[]{0, 0, 0}, Arrays.stream(nums).boxed().toArray(Integer[]::new));
}


/*
public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
  return start >= nums.length ? sum1 == sum2 : splitArray(start + 1, nums, sum1 + nums[start], sum2) || splitArray(start + 1, nums, sum1, sum2 + nums[start]);
}
*/
