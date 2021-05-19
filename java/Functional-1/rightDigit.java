public List<Integer> rightDigit(List<Integer> nums) {
  return nums.stream().map(n -> n % 10).collect(Collectors.toList());
}
