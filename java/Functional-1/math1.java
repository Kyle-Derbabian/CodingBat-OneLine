public List<Integer> math1(List<Integer> nums) {
  return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
}
