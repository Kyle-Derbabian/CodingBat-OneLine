public int[] fix45(int[] nums) {
  return nums.length < 2 ? nums : nums[0] == 4 && nums[1] != 5 ? java.util.stream.Stream.concat(Arrays.asList(new Integer[] {4, 5}).stream(), Arrays.stream(fix45(java.util.stream.Stream.concat(java.util.stream.Stream.concat(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(2, Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(5)).stream(), Arrays.asList(new Integer[] {nums[1]}).stream()).collect(Collectors.toList()).stream(), Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(5) + 1, nums.length).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray())).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray() : nums[0] == 5 ? (nums[nums.length - 1] == 4 || nums[nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1 + 1] != 5 ? java.util.stream.Stream.concat(Arrays.asList(new Integer[] {nums[nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1 + 1]}).stream(), Arrays.stream(fix45(java.util.stream.Stream.concat(java.util.stream.Stream.concat(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(1, nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1 + 1).stream(), Arrays.asList(new Integer[] {5}).stream()).collect(Collectors.toList()).stream(), Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1 + 2, nums.length).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray())).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray() : java.util.stream.Stream.concat(Arrays.stream(fix45(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(0, nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1).stream().mapToInt(i -> i).toArray())).boxed().collect(Collectors.toList()).stream(), Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(nums.length - java.util.stream.IntStream.range(0, nums.length).map(i -> (nums.length - 1 - i)).mapToObj(Arrays.stream(nums).boxed().collect(Collectors.toList())::get).collect(Collectors.toCollection(ArrayList::new)).indexOf(4) - 1, nums.length).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray()) : java.util.stream.Stream.concat(Arrays.asList(nums[0] == 4 && nums[1] == 5 ? new Integer[] {4, 5} : new Integer[] {nums[0]}).stream(), Arrays.stream(fix45(Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(nums[0] == 4 && nums[1] == 5 ? 2 : 1, nums.length).stream().mapToInt(i -> i).toArray())).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
