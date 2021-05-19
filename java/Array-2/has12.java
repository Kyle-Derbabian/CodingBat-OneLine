public boolean has12(int[] nums) {
  return !(nums.length < 2 || Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(1) == -1 || Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(2) == -1) && (Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(1) < Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(2) || has12(Arrays.copyOfRange(nums, Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(1), nums.length)));
}
