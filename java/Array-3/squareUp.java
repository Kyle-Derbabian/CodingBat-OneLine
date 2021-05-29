public int[] squareUp(int n) {
  return java.util.stream.IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()).stream().flatMap(i -> Arrays.stream(java.util.stream.Stream.concat(Arrays.stream(new int[n - i]).boxed().collect(Collectors.toList()).stream(), java.util.stream.IntStream.rangeClosed(1, i).boxed().collect(Collectors.toList()).stream().map(j -> i - j + 1).collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(j -> j).toArray()).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
