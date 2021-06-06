// Works, but isn't in one-line format for convenience

public boolean splitArray(int[] nums) {
  
  if (nums.length == 0) {
    return true;
  } else if (nums.length == 1) {
    return nums[0] == 0;
  }
  
  int[] newNums1 = Arrays.copyOfRange(nums, 1, nums.length);
  newNums1[0] += nums[0];
  int[] newNums2 = Arrays.copyOfRange(nums, 1, nums.length);
  newNums2[0] -= nums[0];
  
  return splitArray(newNums1) || splitArray(newNums2);
  
}
