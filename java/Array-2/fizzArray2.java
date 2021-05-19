public String[] fizzArray2(int n) {
  return n == 0 ? new String[0] : (new ArrayList<>(Arrays.asList(Arrays.asList(fizzArray2(n - 1)), new ArrayList<>(Arrays.asList(Integer.toString(n - 1)))))).stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().toArray(String[]::new);
}
