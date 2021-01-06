public int[] swapEnds(int[] nums) {
  return (new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<>(Collections.nCopies(1, nums[nums.length - 1])), nums.length > 2 ? Arrays.stream(Arrays.copyOfRange(nums, 1, nums.length - 1)).boxed().collect(Collectors.toList()) : new ArrayList<>(), nums.length != 1 ? new ArrayList<>(Collections.nCopies(1, nums[0])) : new ArrayList<>()))).stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
