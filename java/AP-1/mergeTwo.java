public String[] mergeTwo(String[] a, String[] b, int n) {
  return Arrays.copyOfRange((new HashSet<>((new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(a)), new ArrayList<>(Arrays.asList(b))))).stream().flatMap(i -> i.stream()).collect(Collectors.toList()).stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList()))).toArray(new String[n]), 0, n);
}
