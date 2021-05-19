public int commonTwo(String[] a, String[] b) {
  return (new HashSet<>(Arrays.asList(a))).size() + (new HashSet<>(Arrays.asList(b))).size() - (new HashSet<>((new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(a)), new ArrayList<>(Arrays.asList(b))))).stream().flatMap(i -> i.stream()).collect(Collectors.toList()))).size();
}
