// Doesn't work yet

public boolean split53(int[] nums) {
  
  int[] fizz = Arrays.stream(nums).filter(i -> i % 3 == 0 && i % 5 != 0).toArray();
  int[] buzz = Arrays.stream(nums).filter(i -> i % 5 == 0).toArray();
  int[] remaining = Arrays.stream(nums).filter(i -> i % 3 != 0 && i % 5 != 0).toArray();
  
  int difference = Arrays.stream(fizz).sum() - Arrays.stream(buzz).sum();
  
  return splitArray(remaining, difference) || splitArray(remaining, -difference);
  
}



public boolean splitArray(int[] nums, int difference) {
  
  if (nums.length == 0) {
    return true;
  } else if (nums.length == 1) {
    return nums[0] == difference;
  }
  
  int[] newNums1 = Arrays.copyOfRange(nums, 1, nums.length);
  newNums1[0] += nums[0];
  int[] newNums2 = Arrays.copyOfRange(nums, 1, nums.length);
  newNums2[0] -= nums[0];
  
  return splitArray(newNums1, difference) || splitArray(newNums2, difference);
  
}






// public boolean split53(int[] nums) {
  
//   int[] fizz = Arrays.stream(nums).filter(i -> i % 3 == 0 && i % 5 != 0).toArray();
//   int[] buzz = Arrays.stream(nums).filter(i -> i % 5 == 0).toArray();
//   int[] remaining = Arrays.stream(nums).filter(i -> i % 3 != 0 && i % 3 != 0).toArray();
  
  
//   int difference = Arrays.stream(fizz).sum() - Arrays.stream(buzz).sum();
  
  
//   return difference == 1; 

  
// }







// public boolean split53(int[] nums) {
//   return helperMethod(0, nums, 0, 0);
// }

// public boolean helperMethod(int start, int[] nums, int sum1, int sum2) {
//   return start >= nums.length ? sum1 == sum2 : nums[start] % 5 == 0 ? helperMethod(start + 1, nums, sum1 + nums[start], sum2) : nums[start] % 3 == 0 ? helperMethod(start + 1, nums, sum1, sum2 + nums[start]) : helperMethod(start + 1, nums, sum1 + nums[start], sum2) || helperMethod(start + 1, nums, sum1, sum2 + nums[start]);
// }
