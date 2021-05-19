public int[] fizzArray(int n) {
  return n == 0 ? new int[0] : (new ArrayList<>(Arrays.asList(Arrays.stream(fizzArray(n - 1)).boxed().collect(Collectors.toList()), new ArrayList<>(Arrays.asList(n - 1))))).stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
