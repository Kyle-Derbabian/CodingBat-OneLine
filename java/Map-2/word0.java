public Map<String, Integer> word0(String[] strings) {
  return java.util.stream.IntStream.range(0, (new HashSet<String>(Arrays.asList(strings))).size()).boxed().collect(Collectors.toMap(n -> (new HashSet<String>(Arrays.asList(strings))).toArray(new String[(new HashSet<String>(Arrays.asList(strings))).size()])[n], n -> (new int[(new HashSet<String>(Arrays.asList(strings))).size()])[n]));
}
