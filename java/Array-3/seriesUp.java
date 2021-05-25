public int[] seriesUp(int n) {
  return n == 0 ? new int[0] : java.util.stream.Stream.concat(Arrays.stream(seriesUp(n - 1)).boxed().collect(Collectors.toList()).stream(), java.util.stream.IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
