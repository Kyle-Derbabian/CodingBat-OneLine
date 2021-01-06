public int[] makeLast(int[] nums) {
  return (new ArrayList<>(Arrays.asList((new ArrayList<>(Collections.nCopies(nums.length * 2 - 1, 0))), (new ArrayList<>(Collections.nCopies(1, nums[nums.length - 1])))))).stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
