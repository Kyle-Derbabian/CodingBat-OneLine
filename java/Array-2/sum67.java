public int sum67(int[] nums) {
  return Arrays.stream(nums).boxed().collect(Collectors.toList()).size() == 0 ? 0 : Arrays.stream(nums).boxed().collect(Collectors.toList()).get(0) == 6 ? sum67(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(7) + 1, Arrays.stream(nums).boxed().collect(Collectors.toList()).size()).stream().mapToInt(i -> i).toArray()) : Arrays.stream(nums).boxed().collect(Collectors.toList()).get(0) + sum67(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(1, Arrays.stream(nums).boxed().collect(Collectors.toList()).size()).stream().mapToInt(i -> i).toArray());
}
