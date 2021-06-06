// Doesn't work yet

public int maxMirror(int[] nums) {
  
  if (nums.length == 0) {
    return 0;
  } else if (nums.length == 1) {
    return 1;
  } else if (nums.length == 2) {
    return nums[0] == nums[1] ? 2 : 1;
  }
  
  if (Arrays.asList(Arrays.copyOfRange(nums, 1, nums.length)).contains(nums[0])) {
    
    int newIndex = Arrays.asList(Arrays.copyOfRange(nums, 1, nums.length)).lastIndexOf(nums[0]);
    int[] subArray = Arrays.copyOfRange(nums, 0, newIndex);
    
    if (nums[1] == nums[newIndex - 1]) {
      return Math.max(2 + maxMirror(Arrays.copyOfRange(nums, 1, newIndex - 1)), maxMirror(Arrays.copyOfRange(nums, 1, nums.length)));
    }
  
    return Math.max(1 + maxMirror(Arrays.copyOfRange(nums, 1, nums.length)), maxMirror(Arrays.copyOfRange(nums, 1, nums.length)));
  
  }
  
  return maxMirror(Arrays.copyOfRange(nums, 1, nums.length));
  
  
  
  // 1 2 ... 2 1 4 5 ...
  // Max(1 + maxmirror(2 ... 2), maxMirror(2 ... end))
  
  
  // return Math.max(maxMirror(Arrays.copyOfRange(nums, 1, nums.length)) + 1, maxMirror(Arrays.copyOfRange(nums, 1, nums.length)));
  
  
  
}
