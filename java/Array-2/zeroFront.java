public int[] zeroFront(int[] nums) {
  return java.util.stream.Stream.concat(Arrays.stream(new int[Collections.frequency(Arrays.stream(nums).boxed().collect(Collectors.toList()), 0)]).boxed().collect(Collectors.toList()).stream(), Arrays.stream(Arrays.stream(nums).filter(num -> num != 0).toArray()).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
