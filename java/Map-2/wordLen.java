public Map<String, Integer> wordLen(String[] strings) {
  return java.util.stream.IntStream.range(0, (new HashSet<String>(Arrays.asList(strings))).size()).boxed().collect(Collectors.toMap(n -> (new HashSet<String>(Arrays.asList(strings))).toArray(new String[(new HashSet<String>(Arrays.asList(strings))).size()])[n], n -> (new HashSet<String>(Arrays.asList(strings))).toArray(new String[(new HashSet<String>(Arrays.asList(strings))).size()])[n].length()));
}
